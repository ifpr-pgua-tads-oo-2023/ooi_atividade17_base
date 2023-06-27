package ifpr.pgua.eic.biblioteca.controllers;

import ifpr.pgua.eic.biblioteca.App;
import ifpr.pgua.eic.biblioteca.models.Biblioteca;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaCadastroAutor {

    @FXML
    void voltar(ActionEvent event) {
        App.popScreen();
    }

}
