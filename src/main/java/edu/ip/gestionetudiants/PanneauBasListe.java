package edu.ip.gestionetudiants;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauBasListe extends JPanel{
    
    //declaration des objets 
    JButton fermer;
    
    public PanneauBasListe(){
        
        //definition des caracteristiques du panneau
        this.setSize(new Dimension(500,50));
        
        //creation des objets
        fermer=new JButton("Fermer");
        this.add(fermer);
        
        //fermer
        fermer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                GestionEtudiants.fenListe.setVisible(false);
                GestionEtudiants.fenSaisie.panneauBas.annuler.setEnabled(true);
                GestionEtudiants.fenSaisie.panneauBas.enregistrer.setEnabled(true);
                GestionEtudiants.fenSaisie.panneauBas.visualiser.setEnabled(true);
                //GestionEtudiants.fenSaisie.enable();
            }
        });
    }
}
