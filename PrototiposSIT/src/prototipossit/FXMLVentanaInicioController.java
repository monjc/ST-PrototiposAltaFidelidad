/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package prototipossit;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author salom
 */
public class FXMLVentanaInicioController implements Initializable {

    @FXML
    private TextField tfDocente;
    
    @FXML
    private ComboBox<String> cbOpcionAgenda;

    @FXML
    private Button btnAgendar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfDocente.setText("Tutor de Ejemplo");
        cbOpcionAgenda.setItems(FXCollections.observableArrayList("Por estudiante", "Por grupo", "Por horario"));
    }

    @FXML
    private void agendar(ActionEvent event) throws IOException {

        int indice = cbOpcionAgenda.getSelectionModel().getSelectedIndex();

        switch (indice) {
            case -1:
                break;
            case 0:
                abrirEscena1();
                break;
            case 1:
                abrirEscena2();
                break;
            case 2:
                abrirEscena3();
                break;
        }
    }

    private void abrirEscena1() throws IOException {
        Stage stageAgendarEstudiante = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLVentanaEstudiante.fxml"));

        Scene scene = new Scene(root);
        stageAgendarEstudiante.setScene(scene);
        stageAgendarEstudiante.setTitle("Agendar por Estudiante");
        stageAgendarEstudiante.show();
        Stage stageActual = (Stage) btnAgendar.getScene().getWindow();
        Stage stage = (Stage) stageActual.getScene().getWindow();
        stage.close();
    }

    private void abrirEscena2() throws IOException {
        Stage stageAgendarGrupo = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLVentanaGrupo.fxml"));

        Scene scene = new Scene(root);
        stageAgendarGrupo.setScene(scene);
        stageAgendarGrupo.setTitle("Agendar por Grupo");
        stageAgendarGrupo.show();
        Stage stageActual = (Stage) btnAgendar.getScene().getWindow();
        Stage stage = (Stage) stageActual.getScene().getWindow();
        stage.close();
    }

    private void abrirEscena3() throws IOException {
        Stage stageAgendarHorario = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLVentanaHorario.fxml"));

        Scene scene = new Scene(root);
        stageAgendarHorario.setScene(scene);
        stageAgendarHorario.setTitle("Agendar por Horario");
        stageAgendarHorario.show();
        Stage stageActual = (Stage) btnAgendar.getScene().getWindow();
        Stage stage = (Stage) stageActual.getScene().getWindow();
        stage.close();
    }
}
