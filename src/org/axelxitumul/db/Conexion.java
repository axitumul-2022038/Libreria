/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.axelxitumul.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author informatica
 */
public class Conexion {
    private Connection conexion;
    private static Conexion instancia;
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                    conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_libreria?useSSL=false", "root", "root");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    public synchronized static Conexion getInstancia(){
        if(instancia==null)
            instancia = new Conexion();
        return instancia;
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void setConexion(Connection conexion){
        this.conexion = conexion;
    }
}
// el cj se agrega en versiones mayores a 7 en menores no se agrega