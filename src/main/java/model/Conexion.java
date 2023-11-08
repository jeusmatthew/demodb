/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.swing.JOptionPane;

/**
 *
 * @author jeusm
 */
public class Conexion {
    private Connection con = null;

    public Connection getConexion() {
        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("src/main/java/resources/app.properties");
            properties.load(fileInputStream);
            con = (Connection)DriverManager.getConnection(properties.getProperty("urlLinux"));
            JOptionPane.showMessageDialog(null, "conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
            e.printStackTrace();
        }
        return con;
    }
    
}
