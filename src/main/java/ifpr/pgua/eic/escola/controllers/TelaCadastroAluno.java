package ifpr.pgua.eic.escola.controllers;

import ifpr.pgua.eic.escola.App;
import ifpr.pgua.eic.escola.models.Escola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaCadastroAluno {

    @FXML
    void voltar(ActionEvent event) {
        App.popScreen();
    }

}
