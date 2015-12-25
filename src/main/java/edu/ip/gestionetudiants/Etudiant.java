package edu.ip.gestionetudiants;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Etudiant {
    
    //declaration des attributs
    String matricule;
    String nom;
    String telNumber;
    public static ResultSet resultat;
    
    
    //definition des methodes
    
    /*le constructeurs*/
    public void Etudiant(String matricule, String nom, String telNumber){
        this.matricule=matricule;
        this.nom=nom;
        this.telNumber=telNumber;
        
    }
    
    /*les autres methodes*/
    
    public static void affiche() throws SQLException{
        
        //intialisation du panneau
        GestionEtudiants.fenListe.panneauCentre.modelTable.setRowCount(0);
        
        //requete dans la base de donnees
        resultat=ConnectionBD.querry.executeQuery("Select * from Etudiant;");
        //next permet de passer a la ligne 2(ligne des donnees)
        while(resultat.next()){
            String matricule=resultat.getString("Matricule");
            String nom=resultat.getString("Nom");
            String telephone=resultat.getString("Telephone");
            
            String []row={matricule,nom,telephone};
            GestionEtudiants.fenListe.panneauCentre.modelTable.addRow(row);
        }
    }
    
    
}
