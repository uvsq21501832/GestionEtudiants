package edu.ip.gestionetudiants;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionBD {
    public static Connection connection;//static pour pouvoir appeler la connection sans instancier la classe
    public static Statement querry;
    
    public static void Connexion() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");//indique le pilote de connexion
        //creation de l'url de connexion
        String url="jdbc:mysql://localhost:3306/new";
        String utilisateur="root";
        String motDePasse="";
        connection=null;
        connection=DriverManager.getConnection(url, utilisateur, motDePasse);
        querry=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        
    }
    
}
