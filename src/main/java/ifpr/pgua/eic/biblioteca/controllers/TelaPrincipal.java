package ifpr.pgua.eic.biblioteca.controllers;

import ifpr.pgua.eic.biblioteca.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TelaPrincipal {

    @FXML
    void abrirTelaCadastro(ActionEvent event) {
        App.pushScreen("CADASTRO_AUTOR");
    }

    @FXML
    void abrirTelaVisualizar(ActionEvent event) {
        App.pushScreen("VISUALIZAR_AUTORES");
    }

}
