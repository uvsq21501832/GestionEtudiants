package edu.ip.gestionetudiants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauEnteteSaisie extends JPanel{
    
    //declaration des objet du panneau
    JLabel entete;
    
    public PanneauEnteteSaisie(){
        
        //definition des caracteristiques du panneau
        this.setSize(710,100);
        
        
        
        //creation des objets du panneau
        entete=new JLabel("Saisie des étudiants");
       // JLabel trait=new JLabel("------------------------------------------------------------------------------");
        Font font=new Font("Cambria",Font.BOLD, 30);
        entete.setFont(font);
        
        //ajout des objets au panneau
        this.add(entete);
        //this.add(trait);
        
        
    }
    
}
