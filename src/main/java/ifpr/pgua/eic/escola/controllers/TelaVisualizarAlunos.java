package ifpr.pgua.eic.escola.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.escola.App;
import ifpr.pgua.eic.escola.models.Escola;
import ifpr.pgua.eic.escola.models.Aluno;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class TelaVisualizarAlunos implements Initializable{
    
    @FXML
    void voltar(ActionEvent event) {
        App.popScreen();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }

}
