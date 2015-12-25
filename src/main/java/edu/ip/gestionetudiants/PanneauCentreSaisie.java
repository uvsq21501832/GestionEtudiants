package edu.ip.gestionetudiants;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanneauCentreSaisie extends JPanel{
    
    //declaration des objets du panneau
    JLabel matricule;
    JLabel nom;
    JLabel telephone;
    JTextField champMatricule;
    JTextField champNom;
    JTextField champTelephone;
    
    public PanneauCentreSaisie(){
        
        //definition des caracteristiques du panneau
        this.setSize(new Dimension(400,190));
        
        //creation des objets du panneau
        //taille des label
        Font font=new Font("",Font.BOLD, 20);
        
        matricule=new JLabel("                        Matricule    ");
        matricule.setFont(font);
        nom=new JLabel("                              Nom     ");
        nom.setFont(font);
        telephone=new JLabel("                     Telephone     ");
        telephone.setFont(font);
        
       // JLabel trait=new JLabel("------------------------------------------------------------------------------\n");
        font=new Font("Lucida Calligraphy",Font.BOLD, 16);
        champMatricule=new JTextField(15);
        champMatricule.setFont(font);
        champNom=new JTextField(15);
        champNom.setFont(font);
        champTelephone=new JTextField(15);
        champTelephone.setFont(font);
        champMatricule.setPreferredSize(new Dimension(300,40));
        champNom.setPreferredSize(new Dimension(1200,40));
        champTelephone.setPreferredSize(new Dimension(1200,40));
        
        //deinition du manager du panneau
        //this.setLayout(new ());
        
        
        //ajout des objets au panneau
        //this.add(trait);
        this.add(matricule);
        this.add(champMatricule);
        this.add(nom);
        this.add(champNom);
        this.add(telephone);
        this.add(champTelephone);
    }
    
}
