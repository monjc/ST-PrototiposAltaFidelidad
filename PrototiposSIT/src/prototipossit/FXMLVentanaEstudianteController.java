/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prototipossit;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import prototipossit.Estudiante;

/**
 * FXML Controller class
 *
 * @author salom
 */
public class FXMLVentanaEstudianteController implements Initializable {

    @FXML
    private TextField tfDocente;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnAgregarHorario;

    @FXML
    private Label lbMatricula1;

    @FXML
    private Label lbMatricula2;

    @FXML
    private Label lbMatricula3;

    @FXML
    private Label lbNombre1;
    
    @FXML
    private Label lbNombre2;
    
    @FXML
    private Label lbNombre3;
    
    Estudiante estudiante1 = new Estudiante("s19123456", "Juan Pérez", 19, "Septiembre", "10:00", "10:30:00", "Virtual", 80);
    Estudiante estudiante2 = new Estudiante("s20789101", "Mario López", 19, "Septiembre", "10:30", "11:00", "presencial", 90);
    Estudiante estudiante3 = new Estudiante("s19543210", "Pedro Gómez", 20, "Septiembre", "11:00", "11:30", "presencial", 40);

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbMatricula1.setText(estudiante1.getMatricula());
        lbMatricula2.setText(estudiante2.getMatricula());
        lbMatricula3.setText(estudiante3.getMatricula());
        
        lbNombre1.setText(estudiante1.getNombre());
        lbNombre2.setText(estudiante2.getNombre());
        lbNombre3.setText(estudiante3.getNombre());
    }

    @FXML
    private void regresar(ActionEvent event) throws IOException {
        Stage stageAgendarGrupo = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLVentanaInicio.fxml"));

        Scene scene = new Scene(root);
        stageAgendarGrupo.setScene(scene);
        stageAgendarGrupo.show();
        Stage stageActual = (Stage) btnRegresar.getScene().getWindow();
        Stage stage = (Stage) stageActual.getScene().getWindow();
        stage.close();
    }

}
