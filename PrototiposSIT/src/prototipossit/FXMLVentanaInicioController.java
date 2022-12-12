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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author salom
 */
public class FXMLVentanaInicioController implements Initializable {

    @FXML
    private ComboBox<String> cbOpcionAgenda;
    
    @FXML
    private Button btnAgendar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbOpcionAgenda.setItems(FXCollections.observableArrayList("Por estudiante", "Por grupo", "Por horario"));
    }
    
    @FXML
    private void agendar(ActionEvent event) throws IOException{
        Stage stageAgendarEstudiante = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLVentanaEstudiante.fxml"));
        
        Scene scene = new Scene(root);
        stageAgendarEstudiante.setScene(scene);
        stageAgendarEstudiante.setTitle("Agendar por estudiante");
        stageAgendarEstudiante.show();
        Stage stageActual = (Stage)btnAgendar.getScene().getWindow();
        Stage stage = (Stage) stageActual.getScene().getWindow();
        stage.close();
    }
}
