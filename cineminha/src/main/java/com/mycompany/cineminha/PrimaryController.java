package com.mycompany.cineminha;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button btn_sessao;
    @FXML
    private Button btn_salas;
    @FXML
    private Button btn_clientes;
    @FXML
    private Button btn_filmes;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void btn_sessao_Click(ActionEvent event) {
    }

    @FXML
    private void btn_salas_Click(ActionEvent event) {
    }

    @FXML
    private void btn_clientes_Click(ActionEvent event) {
    }

    @FXML
    private void btn_filmes_Click(ActionEvent event) {
    }
}
