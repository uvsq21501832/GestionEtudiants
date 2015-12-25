package edu.ip.gestionetudiants;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestionEtudiants {
    
    //declaration des objets
    public static InterfaceSaisie fenSaisie;
    public static InterfaceListe fenListe;
    public static ArrayList<Etudiant> liste;
    
    public static ResultSet resultat;
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        //creation des objets
        liste= new ArrayList<Etudiant>();
        fenSaisie=new InterfaceSaisie();
        fenListe=new InterfaceListe();
        ConnectionBD.Connexion();
       
        
        Etudiant.affiche();
    }
}
