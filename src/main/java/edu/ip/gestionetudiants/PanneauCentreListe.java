package edu.ip.gestionetudiants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanneauCentreListe extends JPanel{
    
    //declaration des objets
    JTable table;
    DefaultTableModel modelTable;
    JScrollPane scroll;
    
    public PanneauCentreListe(){
        
        //definition des caracteristiques du panneau
        //this.setPreferredSize(new Dimension(600,100));
        Font font=new Font("Lucida Calligraphy",Font.BOLD, 16);
        //creation des objets
        String donnee[][]={};
        String titre[]={};
        table=new JTable(donnee,titre);
        
        
        modelTable=new DefaultTableModel();
        table.setFont(font);
        modelTable.addColumn("Matricule");
        modelTable.addColumn("Nom");
        modelTable.addColumn("Telephone");
        table.setGridColor(Color.green);
       table.setRowHeight(30);
       //table.setRowHeight(10, 10);
        
        //test
        String et1[]={"4575","ILLY Poulmanogo","74895623"};
        modelTable.addRow(et1);
        
        table.setModel(modelTable);
        //table.setPreferredSize(new Dimension(600,400));
        
        scroll=new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(600,150));
        
        //ajout des objets au panneau
        this.add(scroll);
    }
}
