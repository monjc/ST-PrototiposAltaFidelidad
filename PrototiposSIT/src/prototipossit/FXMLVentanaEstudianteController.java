/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prototipossit;

import javafx.event.ActionEvent;
import java.io.IOException;
import static java.lang.Compiler.disable;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import static prototipossit.Estudiante.listaEstudiantes;

/**
 * FXML Controller class
 *
 * @author salom
 */
public class FXMLVentanaEstudianteController implements Initializable {

    @FXML
    private ComboBox cbDia2;

    @FXML
    private ComboBox cbDia1;

    @FXML
    private ComboBox cbHrF3;

    @FXML
    private ComboBox cbHrF2;

    @FXML
    private ComboBox cbDia3;

    @FXML
    private ComboBox cbHrF1;

    @FXML
    private Button btnEditar2;

    @FXML
    private Button btnEditar1;

    @FXML
    private Label nombre2;

    @FXML
    private ComboBox cbMes1;

    @FXML
    private Button btnEditar3;

    @FXML
    private Label nombre1;

    @FXML
    private ComboBox cbMes3;

    @FXML
    private Label nombre3;

    @FXML
    private ComboBox cbMes2;

    @FXML
    private ComboBox cbModalidad2;

    @FXML
    private ComboBox cbModalidad3;

    @FXML
    private ComboBox cbModalidad1;

    @FXML
    private Button btnRegresar;

    @FXML
    private ComboBox cbHrI3;

    @FXML
    private ComboBox cbHrI2;

    @FXML
    private ComboBox cbHrI1;

    @FXML
    private Label matricula1;

    @FXML
    private Label matricula2;

    @FXML
    private Label matricula3;

    @FXML
    private TextField tfDocente;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnEliminar3;

    @FXML
    private Button btnEliminar2;

    @FXML
    private Button btnEliminar1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfDocente.setText("Docente de Ejemplo");
        llenarCombosDias();
        llenarCombosMeses();
        llenarCombosHorasInicio();
        llenarCombosHorasFin();
        llenarCombosModalidad();
    }

    public void llenarCombosDias() {
        ObservableList<String> dias = FXCollections.observableList(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"));
        cbDia1.setItems(dias);
        cbDia1.setDisable(true);

        cbDia2.setItems(dias);
        cbDia2.setDisable(true);

        cbDia3.setItems(dias);
        cbDia3.setDisable(true);
    }

    public void llenarCombosMeses() {
        ObservableList<String> meses = FXCollections.observableList(Arrays.asList("Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Enero"));
        cbMes1.setItems(meses);
        cbMes1.setDisable(true);

        cbMes2.setItems(meses);
        cbMes2.setDisable(true);

        cbMes3.setItems(meses);
        cbMes3.setDisable(true);

    }

    public void llenarCombosHorasInicio() {
        ObservableList<String> horasI = FXCollections.observableList(Arrays.asList("07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"));
        cbHrI1.setItems(horasI);
        cbHrI1.setDisable(true);

        cbHrI2.setItems(horasI);
        cbHrI2.setDisable(true);

        cbHrI3.setItems(horasI);
        cbHrI3.setDisable(true);
    }

    public void llenarCombosHorasFin() {
        ObservableList<String> horasF = FXCollections.observableList(Arrays.asList("07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00"));
        cbHrF1.setItems(horasF);
        cbHrF1.setDisable(true);

        cbHrF2.setItems(horasF);
        cbHrF2.setDisable(true);

        cbHrF3.setItems(horasF);
        cbHrF3.setDisable(true);
    }

    public void llenarCombosModalidad() {
        ObservableList<String> modalidad = FXCollections.observableList(Arrays.asList("Presencial", "Virtual"));
        cbModalidad1.setItems(modalidad);
        cbModalidad1.setDisable(true);

        cbModalidad2.setItems(modalidad);
        cbModalidad2.setDisable(true);

        cbModalidad3.setItems(modalidad);
        cbModalidad3.setDisable(true);
    }

    @FXML
    void edicion1(ActionEvent event) {
        cbDia1.setDisable(false);
        cbMes1.setDisable(false);
        cbHrI1.setDisable(false);
        cbHrF1.setDisable(false);
        cbModalidad1.setDisable(false);
    }

    @FXML
    void eliminar1(ActionEvent event) {
        cbDia1.setDisable(false);
        cbMes1.setDisable(false);
        cbHrI1.setDisable(false);
        cbHrF1.setDisable(false);
        cbModalidad1.setDisable(false);
        
        cbDia1.promptTextProperty().setValue("");
        cbMes1.promptTextProperty().setValue("");
        cbHrI1.promptTextProperty().setValue("");
        cbHrF1.promptTextProperty().setValue("");
        cbModalidad1.promptTextProperty().setValue("");

        cbDia1.setDisable(true);
        cbMes1.setDisable(true);
        cbHrI1.setDisable(true);
        cbHrF1.setDisable(true);
        cbModalidad1.setDisable(true);
    }

    @FXML
    void edicion2(ActionEvent event) {
        cbDia2.setDisable(false);
        cbMes2.setDisable(false);
        cbHrI2.setDisable(false);
        cbHrF2.setDisable(false);
        cbModalidad2.setDisable(false);
    }

    @FXML
    void eliminar2(ActionEvent event) {
        
        cbDia2.setDisable(false);
        cbMes2.setDisable(false);
        cbHrI2.setDisable(false);
        cbHrF2.setDisable(false);
        cbModalidad2.setDisable(false);
        
        cbDia2.promptTextProperty().setValue("");
        cbMes2.promptTextProperty().setValue("");
        cbHrI2.promptTextProperty().setValue("");
        cbHrF2.promptTextProperty().setValue("");
        cbModalidad2.promptTextProperty().setValue("");
        
        cbDia2.setDisable(true);
        cbMes2.setDisable(true);
        cbHrI2.setDisable(true);
        cbHrF2.setDisable(true);
        cbModalidad2.setDisable(true);
    }

    @FXML
    void edicion3(ActionEvent event) {
        cbDia3.setDisable(false);
        cbMes3.setDisable(false);
        cbHrI3.setDisable(false);
        cbHrF3.setDisable(false);
        cbModalidad3.setDisable(false);
    }

    @FXML
    void eliminar3(ActionEvent event) {
        
        cbDia3.setDisable(false);
        cbMes3.setDisable(false);
        cbHrI3.setDisable(false);
        cbHrF3.setDisable(false);
        cbModalidad3.setDisable(false);
        
        cbDia3.promptTextProperty().setValue("");
        cbMes3.promptTextProperty().setValue("");
        cbHrI3.promptTextProperty().setValue("");
        cbHrF3.promptTextProperty().setValue("");
        cbModalidad3.promptTextProperty().setValue("");
        
        cbDia3.setDisable(true);
        cbMes3.setDisable(true);
        cbHrI3.setDisable(true);
        cbHrF3.setDisable(true);
        cbModalidad3.setDisable(true);
    }

    @FXML
    void guardar(ActionEvent event) {
        cbDia1.setDisable(true);
        cbDia2.setDisable(true);
        cbDia3.setDisable(true);

        cbMes1.setDisable(true);
        cbMes2.setDisable(true);
        cbMes3.setDisable(true);

        cbHrI1.setDisable(true);
        cbHrI2.setDisable(true);
        cbHrI3.setDisable(true);

        cbHrF1.setDisable(true);
        cbHrF2.setDisable(true);
        cbHrF3.setDisable(true);

        cbModalidad1.setDisable(true);
        cbModalidad2.setDisable(true);
        cbModalidad3.setDisable(true);

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
