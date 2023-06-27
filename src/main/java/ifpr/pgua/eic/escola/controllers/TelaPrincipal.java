package ifpr.pgua.eic.escola.controllers;

import ifpr.pgua.eic.escola.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TelaPrincipal {

    @FXML
    void abrirTelaCadastro(ActionEvent event) {
        App.pushScreen("CADASTRO_ALUNO");
    }

    @FXML
    void abrirTelaVisualizar(ActionEvent event) {
        App.pushScreen("VISUALIZAR_ALUNOS");
    }

}
