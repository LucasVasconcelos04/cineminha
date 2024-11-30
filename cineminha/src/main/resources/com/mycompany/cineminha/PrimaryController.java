/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.cineminha;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PrimaryController implements Initializable {

    @FXML
    private Button btn_sessao;
    @FXML
    private Button btn_salas;
    @FXML
    private Button btn_clientes;
    @FXML
    private Button btn_filmes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btn_sessao_Click(ActionEvent event) 
    {
        try {
        // Carrega o arquivo FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CadSessao.fxml"));
        Parent root = fxmlLoader.load();

        // Obtém o Stage atual a partir do evento
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Define a nova cena no Stage atual
        stage.setScene(new Scene(root));
        stage.show();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void btn_salas_Click(ActionEvent event) 
    {
        
    }

    @FXML
    private void btn_clientes_Click(ActionEvent event) {
    }

    @FXML
    private void btn_filmes_Click(ActionEvent event) {
    }
    
}
