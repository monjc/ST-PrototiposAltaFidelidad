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
public class FXMLVentanaGrupoController implements Initializable {

    @FXML
    private ComboBox cbAñadirHrFin;

    @FXML
    private ComboBox sesion;

    @FXML
    private ComboBox cbAñadirModalidad;

    @FXML
    private ComboBox cbGrupoHrI2;

    @FXML
    private ComboBox cbGrupoHrI1;

    @FXML
    private ComboBox cbGrupoHrI3;

    @FXML
    private ComboBox cbAñadirMes;

    @FXML
    private TextField tfDocente;

    @FXML
    private Button cbGrupoEliminar1;

    @FXML
    private Button cbGrupoEliminar2;

    @FXML
    private Button btnEliminar4;

    @FXML
    private Button cbGrupoEliminar3;

    @FXML
    private Button btnEliminar3;

    @FXML
    private Button btnEliminar2;

    @FXML
    private Button btnEliminar1;

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
    private ComboBox cbGrupoDia3;

    @FXML
    private ComboBox cbHrF1;

    @FXML
    private ComboBox cbDia3;

    @FXML
    private ComboBox cbGrupoDia2;

    @FXML
    private ComboBox cbAñadirHrI;

    @FXML
    private ComboBox cbGrupoHrF3;

    @FXML
    private ComboBox cbGrupoHrF2;

    @FXML
    private ComboBox cbGrupoMes3;

    @FXML
    private ComboBox cbGrupoMes2;

    @FXML
    private ComboBox cbAñadirDia;

    @FXML
    private ComboBox cbGrupoMes1;

    @FXML
    private Button btnEditar2;

    @FXML
    private Button btnEditar1;

    @FXML
    private ComboBox cbMes1;

    @FXML
    private Button btnEditar4;

    @FXML
    private Button btnEditar3;

    @FXML
    private ComboBox cbMes3;

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
    private ComboBox cbModalidad4;

    @FXML
    private ComboBox cbHrI4;

    @FXML
    private ComboBox cbHrI3;

    @FXML
    private ComboBox cbHrI2;

    @FXML
    private ComboBox cbHrI1;

    @FXML
    private ComboBox cbGrupoModalidad1;

    @FXML
    private Button cbGrupoEditar3;

    @FXML
    private ComboBox cbGrupoModalidad2;

    @FXML
    private Button cbGrupoEditar1;

    @FXML
    private ComboBox cbGrupoModalidad3;

    @FXML
    private Button cbGrupoEditar2;

    @FXML
    private Button btnGuardar;

    @FXML
    private ComboBox cbGrupoHrF1;

    @FXML
    private ComboBox cbGrupoDia1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCombosDias();
        llenarCombosMeses();
        llenarCombosHorasInicio();
        llenarCombosHorasFin();
        llenarCombosModalidad();
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

    private void llenarCombosDias() {
        ObservableList<String> dias = FXCollections.observableList(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"));
        cbDia1.setItems(dias);
        cbDia2.setItems(dias);
        cbDia3.setItems(dias);
        cbDia4.setItems(dias);

        cbGrupoDia1.setItems(dias);
        cbGrupoDia2.setItems(dias);

        cbAñadirDia.setItems(dias);

    }

    private void llenarCombosMeses() {
        ObservableList<String> meses = FXCollections.observableList(Arrays.asList("Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Enero"));
        cbMes1.setItems(meses);
        cbMes2.setItems(meses);
        cbMes3.setItems(meses);
        cbMes4.setItems(meses);

        cbGrupoMes1.setItems(meses);
        cbGrupoMes2.setItems(meses);

        cbAñadirMes.setItems(meses);
    }

    public void llenarCombosHorasInicio() {
        ObservableList<String> horasI = FXCollections.observableList(Arrays.asList("07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30"));
        cbHrI1.setItems(horasI);
        cbHrI2.setItems(horasI);
        cbHrI3.setItems(horasI);
        cbHrI4.setItems(horasI);
        
        cbGrupoHrI1.setItems(horasI);
        cbGrupoHrI2.setItems(horasI);

        cbAñadirHrI.setItems(horasI);

    }

    public void llenarCombosHorasFin() {
        ObservableList<String> horasF = FXCollections.observableList(Arrays.asList("07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00"));
        cbHrF1.setItems(horasF);
        cbHrF2.setItems(horasF);
        cbHrF3.setItems(horasF);
        cbHrF4.setItems(horasF);
        
        cbGrupoHrF1.setItems(horasF);
        cbGrupoHrF2.setItems(horasF);
        
        cbAñadirHrFin.setItems(horasF);
    }

    public void llenarCombosModalidad() {
        ObservableList<String> modalidad = FXCollections.observableList(Arrays.asList("Presencial", "Virtual"));
        cbModalidad1.setItems(modalidad);
        cbModalidad2.setItems(modalidad);
        cbModalidad3.setItems(modalidad);
        cbModalidad4.setItems(modalidad);
        
        cbGrupoModalidad1.setItems(modalidad);
        cbGrupoModalidad2.setItems(modalidad);
        
        cbAñadirModalidad.setItems(modalidad);

    }

}
