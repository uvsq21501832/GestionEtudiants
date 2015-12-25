package edu.ip.gestionetudiants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauEnteteListe extends JPanel{
    
    //declaration des objets
    JLabel entete;
    
    public PanneauEnteteListe(){
        
        //definition des caracteristiques du panneau
        this.setSize(new Dimension(500,50));
        
        //creation des objets
        entete=new JLabel("Liste des étudiants");
        Font font=new Font("Cambria",Font.BOLD, 30);
        entete.setFont(font);
        
        //ajout des objets au panneau
        this.add(entete);
        
    }
}
