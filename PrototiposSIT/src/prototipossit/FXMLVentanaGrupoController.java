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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author salom
 */
public class FXMLVentanaGrupoController implements Initializable {

    @FXML
    private TableColumn<?, ?> cHrInicio;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<?, ?> cMatricula;

    @FXML
    private Button btnGuardar;

    @FXML
    private ComboBox<?> sesion;

    @FXML
    private TableColumn<?, ?> cHrFin;

    @FXML
    private TableColumn<?, ?> cMes;

    @FXML
    private TableColumn<?, ?> cAvance;

    @FXML
    private TableColumn<?, ?> cDia;

    @FXML
    private TextField tfDocente;

    @FXML
    private TableColumn<?, ?> cNombre;

    @FXML
    private TableColumn<?, ?> cModalidad;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    void guardar(ActionEvent event) {

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
