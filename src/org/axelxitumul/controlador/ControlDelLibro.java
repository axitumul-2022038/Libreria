/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.axelxitumul.controlador;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.axelxitumul.db.Conexion;
import org.axelxitumul.modelo.Libro;

/**
 *
 * @author informatica
 */
public class ControlDelLibro {
    public void agregarLibro(Libro libro){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarLibro(?,?,?,?,?);");
            sentencia.setString(1, libro.getNombreDelLibro());
            sentencia.setString(2, libro.getNombreDelAutor());
            sentencia.setString(3, libro.getNombreDeLaEditorial());
            sentencia.setInt(4, libro.getEdicion());
            sentencia.setBoolean(5, true);
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Has enviado un libro a la BD");
        }catch(Exception error){
            error.printStackTrace();
        }
    }
}
