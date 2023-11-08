/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.demodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.ControladorProducto;
import model.ConsultasProducto;
import model.Medicamento;
import view.ProductView;

/**
 *
 * @author jeusm
 */
public class Demodb {

    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento();
        ConsultasProducto consultasProducto = new ConsultasProducto();
        ProductView view = new ProductView();
        ControladorProducto controladorProducto = new ControladorProducto(medicamento, consultasProducto, view);
        view.setVisible(true);

        // Connection connection = null;
        // try {
        // // create a database connection
        // connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
        // Statement statement = connection.createStatement();
        // statement.setQueryTimeout(30); // set timeout to 30 sec.

        // statement.executeUpdate("drop table if exists person");
        // statement.executeUpdate("create table person (id integer, name string)");
        // statement.executeUpdate("insert into person values(1, 'leo')");
        // statement.executeUpdate("insert into person values(2, 'yui')");
        // ResultSet rs = statement.executeQuery("select * from person");
        // while (rs.next()) {
        // // read the result set
        // System.out.println("name = " + rs.getString("name"));
        // System.out.println("id = " + rs.getInt("id"));
        // }
        // } catch (SQLException e) {
        // // if the error message is "out of memory",
        // // it probably means no database file is found
        // System.err.println(e.getMessage());
        // } finally {
        // try {
        // if (connection != null)
        // connection.close();
        // } catch (SQLException e) {
        // // connection close failed.
        // System.err.println(e.getMessage());
        // }
        // }

    }
}
