/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.eti.ana.dukemarket.javafx.controller;

import br.com.ana.dukemarket.javafx.App;
import br.com.ana.dukemarket.javafx.model.Produto;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.loggin.Level;
import java.util.loggin.Logger;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author qualifica
 */
public class MenuPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

 public void btnProdutodClick() {
     System.out.println(x:"Botão Produtos Clickado!");
 }
@Override
public void start(Tage stage) throws IOException {
    scene = new Scene (parent: loadFXML (fxml:"menuPrincipal"), d: 640, d1: 480)
    stage.setScene(scene);
    
    stage.setTitle(string:"DukeMarket");
    
    stage.show();
}

  