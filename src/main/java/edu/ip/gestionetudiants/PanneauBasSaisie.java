package edu.ip.gestionetudiants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanneauBasSaisie extends JPanel{
    
    
    //declaration des objets du panneau
    JButton enregistrer;
    JButton annuler;
    JButton visualiser;
    
    public PanneauBasSaisie(){
        
        //definition des caracteristiques du panneau
        this.setSize(new Dimension(710,70));
        this.setLayout(new FlowLayout());
        
        //creation des objets du panneau
        enregistrer=new JButton("Enregistrer");
        annuler=new JButton("Annuler");
        visualiser=new JButton("Visualiser");
        visualiser.setLocation(10, 10);
        
        //ajout des objets au panneau
        this.add(enregistrer);
        this.add(annuler);
        this.add(visualiser);
        
        //enregistrer
        enregistrer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
            //recuperation des donnees saisies
            String matricule=GestionEtudiants.fenSaisie.panneauCentre.champMatricule.getText();
            String nom=GestionEtudiants.fenSaisie.panneauCentre.champNom.getText();
            String telephone=GestionEtudiants.fenSaisie.panneauCentre.champTelephone.getText();
                
            // Controle d'erreur de clé primaire dans la base de donnees
            ResultSet resultat;
            int existe=0;
                try {
                    resultat=ConnectionBD.querry.executeQuery("select * from Etudiant;");
                    while(resultat.next()){
                        String m=resultat.getString("Matricule");
                        if(m.equals(matricule)) existe=1;
                       }
                    } catch (SQLException ex) {Logger.getLogger(PanneauBasSaisie.class.getName()).log(Level.SEVERE, null, ex);}
            if(existe==1){
                JOptionPane.showMessageDialog(null, "Erreur de saisie. Ce matricule existe déjà.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }else{
                if(matricule.length()==0){
                    JOptionPane.showMessageDialog(null, "Erreur de saisie. Le matricule ne peut etre vide.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                else{
            
                //ecriture de la requete
                String requete="insert into Etudiant values('"+matricule+"','"+nom+"','"+telephone+"');";
               
                 //requete dans la base de donnees
                    try {
                        ConnectionBD.querry.executeUpdate(requete);
                        } catch (SQLException ex) {Logger.getLogger(PanneauBasSaisie.class.getName()).log(Level.SEVERE, null, ex);}
                //reinitialisation des champs
                GestionEtudiants.fenSaisie.panneauCentre.champMatricule.setText("");
                GestionEtudiants.fenSaisie.panneauCentre.champNom.setText("");
                GestionEtudiants.fenSaisie.panneauCentre.champTelephone.setText("");
                }
            }
            }
        });
        
        
        //annuler
        annuler.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        
        
        //Visualiser
        visualiser.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                //desactivation de la fenetre de saisie
                GestionEtudiants.fenSaisie.panneauBas.annuler.setEnabled(false);
                GestionEtudiants.fenSaisie.panneauBas.enregistrer.setEnabled(false);
                GestionEtudiants.fenSaisie.panneauBas.visualiser.setEnabled(false);
                //GestionEtudiants.fenSaisie.;
                GestionEtudiants.fenListe.setVisible(true);
                
                    //mise a jour du panneau
                
                try {
                    
                    Etudiant.affiche();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(PanneauBasSaisie.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
     @Override
  public void paintComponent(Graphics g){
        
        try{
            Image img=ImageIO.read(new File("ciel.jpg"));
            g.drawImage(img, 0,0, 1200, 100, this);
        }catch(IOException e){
        }
         g.setColor(Color.red);
    }
    
}
