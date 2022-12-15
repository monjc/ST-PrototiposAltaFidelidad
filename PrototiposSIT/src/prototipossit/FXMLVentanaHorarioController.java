/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prototipossit;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
public class FXMLVentanaHorarioController implements Initializable {

    @FXML
    private ComboBox cbDia2;

    @FXML
    private ComboBox cbHrF4;

    @FXML
    private ComboBox cbDia1;

    @FXML
    private ComboBox cbHrF3;

    @FXML
    private ComboBox cbMes4;

    @FXML
    private ComboBox cbHrF2;

    @FXML
    private ComboBox cbDia4;

    @FXML
    private ComboBox cbHrF1;

    @FXML
    private ComboBox cbDia3;

    @FXML
    private ComboBox cbHrI4;

    @FXML
    private ComboBox cbHrI3;

    @FXML
    private ComboBox cbHrI2;

    @FXML
    private ComboBox cbHrI1;

    @FXML
    private ComboBox cbMes1;

    @FXML
    private TextField tfDocente;

    @FXML
    private ComboBox cbMes3;

    @FXML
    private ComboBox cbMes2;

    @FXML
    private ComboBox cbModalidad3;

    @FXML
    private ComboBox cbModalidad2;

    @FXML
    private ComboBox cbModalidad1;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnAgregarHorario;

    @FXML
    private ComboBox cbModalidad4;

    @FXML
    private Button btnEditar4;

    @FXML
    private Button btnEliminar4;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbDia4.setVisible(false);
        cbMes4.setVisible(false);
        cbHrI4.setVisible(false);
        cbHrF4.setVisible(false);
        cbModalidad4.setVisible(false);
        btnEditar4.setVisible(false);
        btnEliminar4.setVisible(false);

        llenarCombosDias();
        llenarCombosMeses();
        llenarCombosHorasInicio();
        llenarCombosHorasFin();
        llenarCombosModalidad();
    }

    @FXML
    void agregarHorario(ActionEvent event) {
        cbDia4.setVisible(true);
        cbMes4.setVisible(true);
        cbHrI4.setVisible(true);
        cbHrF4.setVisible(true);
        cbModalidad4.setVisible(true);
        btnEditar4.setVisible(true);
        btnEliminar4.setVisible(true);

    }

    @FXML
    void editar1(ActionEvent event) {

    }

    @FXML
    void eliminar1(ActionEvent event) {

    }

    @FXML
    void editar2(ActionEvent event) {

    }

    @FXML
    void eliminar2(ActionEvent event) {

    }

    @FXML
    void editar3(ActionEvent event) {

    }

    @FXML
    void eliminar3(ActionEvent event) {

    }

    @FXML
    void editar4(ActionEvent event) {

    }

    @FXML
    void eliminar4(ActionEvent event) {

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

    private void llenarCombosDias() {
        ObservableList<String> dias = FXCollections.observableList(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"));
        cbDia1.setItems(dias);
        cbDia2.setItems(dias);
        cbDia3.setItems(dias);
        cbDia4.setItems(dias);
    }

    private void llenarCombosMeses() {
        ObservableList<String> meses = FXCollections.observableList(Arrays.asList("Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Enero"));
        cbMes1.setItems(meses);
        cbMes2.setItems(meses);
        cbMes3.setItems(meses);
        cbMes4.setItems(meses);
    }

    private void llenarCombosHorasInicio() {
        ObservableList<String> horasI = FXCollections.observableList(Arrays.asList("07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"));
        cbHrI1.setItems(horasI);
        cbHrI2.setItems(horasI);
        cbHrI3.setItems(horasI);
        cbHrI4.setItems(horasI);
    }

    private void llenarCombosHorasFin() {
        ObservableList<String> horasF = FXCollections.observableList(Arrays.asList("07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00"));
        cbHrF1.setItems(horasF);
        cbHrF2.setItems(horasF);
        cbHrF3.setItems(horasF);
        cbHrF4.setItems(horasF);
    }

    private void llenarCombosModalidad() {
        ObservableList<String> modalidad = FXCollections.observableList(Arrays.asList("Presencial", "Virtual"));
        cbModalidad1.setItems(modalidad);
        cbModalidad2.setItems(modalidad);
        cbModalidad3.setItems(modalidad);
        cbModalidad4.setItems(modalidad);
    }
}
