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


    }
}
