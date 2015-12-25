package edu.ip.gestionetudiants;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class InterfaceListe extends JFrame{
    
    //definition du panneau principal
    Container panneauPrincipal;
    
    //definition des autres panneaux
    PanneauEnteteListe panneauEntete;
    public PanneauCentreListe panneauCentre;
    PanneauBasListe panneauBas;
    
    public InterfaceListe(){
        this.setSize(700, 300);
        
        //creation du panneau prinipal
        panneauPrincipal=this.getContentPane();
        panneauPrincipal.setLayout(new BorderLayout());
        
        //creation des autres panneaux 
        panneauEntete=new PanneauEnteteListe();
        panneauCentre=new PanneauCentreListe();
        panneauBas=new PanneauBasListe();
        
        
        //ajout des aux panneaux au panneau principal
        panneauPrincipal.add(panneauEntete,BorderLayout.NORTH);
        panneauPrincipal.add(panneauCentre,BorderLayout.CENTER);
        panneauPrincipal.add(panneauBas,BorderLayout.SOUTH);
        
        
        this.setResizable(false);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.isAlwaysOnTopSupported();
        //this.setVisible(true);
                
                
              
    }
}
