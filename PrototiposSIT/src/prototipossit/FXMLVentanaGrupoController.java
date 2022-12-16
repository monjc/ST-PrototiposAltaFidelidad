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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
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

    @FXML
    private CheckBox cb1;

    @FXML
    private CheckBox cb2;

    @FXML
    private CheckBox cb3;

    @FXML
    private CheckBox cb4;

    @FXML
    private ComboBox cbPeriodo;

    @FXML
    private ComboBox cbSesion;

    @FXML
    private ComboBox cbProgramaEducativo;

    @FXML
    private ComboBox cbLugar1;

    @FXML
    private ComboBox cbLugar2;

    @FXML
    private ComboBox cbLugar3;

    @FXML
    private ComboBox cbLugar4;

    @FXML
    private ComboBox cbGrupoLugar1;

    @FXML
    private ComboBox cbGrupoLugar2;

    @FXML
    private ComboBox cbAñadirLugar;

    @FXML
    private TextField tfGrupo1;

    @FXML
    private TextField tfGrupo2;

    @FXML
    private TextField tfGrupo3;

    @FXML
    private TextField tfGrupo4;

    @FXML
    private TextField tfGrupoGrupo1;

    @FXML
    private TextField tfGrupoGrupo2;

    @FXML
    private TextField tfAñadirGrupo;

    @FXML
    private TextField tfAñadirVinculo;

    @FXML
    private Label lbAñadirVinculo;

    @FXML
    private TextField tfGrupoVinculo;

    @FXML
    private Label lbGrupoVinculo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfDocente.setText("Tutor de Ejemplo");

        lbAñadirVinculo.setVisible(false);
        tfAñadirVinculo.setVisible(false);

        lbGrupoVinculo.setVisible(false);
        tfGrupoVinculo.setVisible(false);

        llenarComboPeriodo();
        llenarComboSesion();
        llenarComboProgramaEducativo();

        cbAñadirModalidad.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> arg0, String string_before, String string_after) {
                if (string_after.equals("En línea")) {
                    tfAñadirVinculo.setText("");
                    tfAñadirVinculo.setVisible(true);
                    lbAñadirVinculo.setVisible(true);
                } else {
                    tfAñadirVinculo.setVisible(false);
                    lbAñadirVinculo.setVisible(false);
                }
            }
        });

        cbGrupoModalidad2.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> arg0, String string_before, String string_after) {
                if (string_after.equals("En línea")) {
                    tfGrupoVinculo.setText("");
                    tfGrupoVinculo.setVisible(true);
                    lbGrupoVinculo.setVisible(true);
                } else {
                    tfGrupoVinculo.setVisible(false);
                    lbGrupoVinculo.setVisible(false);
                }
            }
        });

        llenarCombosDias();
        llenarCombosMeses();
        llenarCombosHorasInicio();
        llenarCombosHorasFin();
        llenarCombosLugar();
        llenarCombosModalidad();
    }

    @FXML
    void guardar(ActionEvent event) {

        if (cb1.isSelected() || cb2.isSelected() || cb3.isSelected() || cb4.isSelected()) {
            cbGrupoDia2.setValue(cbAñadirDia.getSelectionModel().getSelectedItem().toString());
            cbGrupoMes2.setValue(cbAñadirMes.getSelectionModel().getSelectedItem().toString());
            cbGrupoHrI2.setValue(cbAñadirHrI.getSelectionModel().getSelectedItem().toString());
            cbGrupoHrF2.setValue(cbAñadirHrFin.getSelectionModel().getSelectedItem().toString());
            cbGrupoLugar2.setValue(cbAñadirLugar.getSelectionModel().getSelectedItem().toString());
            cbGrupoModalidad2.setValue(cbAñadirModalidad.getSelectionModel().getSelectedItem().toString());
            tfGrupoGrupo2.setText(tfAñadirGrupo.getText());
            
            tfGrupoVinculo.setText(tfAñadirVinculo.getText());
            
            if(tfAñadirVinculo.getText() != null){
                tfGrupoVinculo.setVisible(true);
                lbGrupoVinculo.setVisible(true);
            }

            cbGrupoDia2.setStyle("-fx-background-color: #FA2D23");
            cbGrupoMes2.setStyle("-fx-background-color: #FA2D23");
            cbGrupoHrI2.setStyle("-fx-background-color: #FA2D23");
            cbGrupoHrF2.setStyle("-fx-background-color: #FA2D23");
            cbGrupoLugar2.setStyle("-fx-background-color: #FA2D23");
            cbGrupoModalidad2.setStyle("-fx-background-color: #FA2D23");
            tfGrupoGrupo2.setStyle("-fx-background-color: #FA2D23");

            cbGrupoDia2.setDisable(true);
            cbGrupoMes2.setDisable(true);
            cbGrupoHrI2.setDisable(true);
            cbGrupoHrF2.setDisable(true);
            cbGrupoLugar2.setDisable(true);
            cbGrupoModalidad2.setDisable(true);
            tfGrupoGrupo2.setDisable(true);
            tfGrupoVinculo.setDisable(true);
            lbGrupoVinculo.setDisable(true);

            if (cb1.isSelected()) {
                cbDia1.setValue(cbAñadirDia.getSelectionModel().getSelectedItem().toString());
                cbMes1.setValue(cbAñadirMes.getSelectionModel().getSelectedItem().toString());
                cbHrI1.setValue(cbAñadirHrI.getSelectionModel().getSelectedItem().toString());
                cbHrF1.setValue(cbAñadirHrFin.getSelectionModel().getSelectedItem().toString());
                cbModalidad1.setValue(cbAñadirModalidad.getSelectionModel().getSelectedItem().toString());
                cbLugar1.setValue(cbAñadirLugar.getSelectionModel().getSelectedItem().toString());
                tfGrupo1.setText(tfAñadirGrupo.getText());

                cbDia1.setStyle("-fx-background-color: #FA2D23");
                cbMes1.setStyle("-fx-background-color: #FA2D23");
                cbHrI1.setStyle("-fx-background-color: #FA2D23");
                cbHrF1.setStyle("-fx-background-color: #FA2D23");
                cbLugar1.setStyle("-fx-background-color: #FA2D23");
                cbModalidad1.setStyle("-fx-background-color: #FA2D23");
                tfGrupo1.setStyle("-fx-background-color: #FA2D23");

                cbDia1.setDisable(true);
                cbMes1.setDisable(true);
                cbHrI1.setDisable(true);
                cbHrF1.setDisable(true);
                cbLugar1.setDisable(true);
                cbModalidad1.setDisable(true);
                tfGrupo1.setDisable(true);

                cb1.setSelected(false);
            }

            if (cb2.isSelected()) {
                cbDia2.setValue(cbAñadirDia.getSelectionModel().getSelectedItem().toString());
                cbMes2.setValue(cbAñadirMes.getSelectionModel().getSelectedItem().toString());
                cbHrI2.setValue(cbAñadirHrI.getSelectionModel().getSelectedItem().toString());
                cbHrF2.setValue(cbAñadirHrFin.getSelectionModel().getSelectedItem().toString());
                cbLugar2.setValue(cbAñadirLugar.getSelectionModel().getSelectedItem().toString());
                cbModalidad2.setValue(cbAñadirModalidad.getSelectionModel().getSelectedItem().toString());
                tfGrupo2.setText(tfAñadirGrupo.getText());

                cbDia2.setStyle("-fx-background-color: #FA2D23");
                cbMes2.setStyle("-fx-background-color: #FA2D23");
                cbHrI2.setStyle("-fx-background-color: #FA2D23");
                cbHrF2.setStyle("-fx-background-color: #FA2D23");
                cbLugar2.setStyle("-fx-background-color: #FA2D23");
                cbModalidad2.setStyle("-fx-background-color: #FA2D23");
                tfGrupo2.setStyle("-fx-background-color: #FA2D23");

                cbDia2.setDisable(true);
                cbMes2.setDisable(true);
                cbHrI2.setDisable(true);
                cbHrF2.setDisable(true);
                cbLugar2.setDisable(true);
                cbModalidad2.setDisable(true);
                tfGrupo2.setDisable(true);

                cb2.setSelected(false);
            }

            if (cb3.isSelected()) {
                cbDia3.setValue(cbAñadirDia.getSelectionModel().getSelectedItem().toString());
                cbMes3.setValue(cbAñadirMes.getSelectionModel().getSelectedItem().toString());
                cbHrI3.setValue(cbAñadirHrI.getSelectionModel().getSelectedItem().toString());
                cbHrF3.setValue(cbAñadirHrFin.getSelectionModel().getSelectedItem().toString());
                cbModalidad3.setValue(cbAñadirModalidad.getSelectionModel().getSelectedItem().toString());
                cbLugar3.setValue(cbAñadirLugar.getSelectionModel().getSelectedItem().toString());
                tfGrupo3.setText(tfAñadirGrupo.getText());

                cbDia3.setStyle("-fx-background-color: #FA2D23");
                cbMes3.setStyle("-fx-background-color: #FA2D23");
                cbHrI3.setStyle("-fx-background-color: #FA2D23");
                cbHrF3.setStyle("-fx-background-color: #FA2D23");
                cbLugar3.setStyle("-fx-background-color: #FA2D23");
                cbModalidad3.setStyle("-fx-background-color: #FA2D23");
                tfGrupo3.setStyle("-fx-background-color: #FA2D23");

                cbDia3.setDisable(true);
                cbMes3.setDisable(true);
                cbHrI3.setDisable(true);
                cbHrF3.setDisable(true);
                cbLugar3.setDisable(true);
                cbModalidad3.setDisable(true);
                tfGrupo3.setDisable(true);

                cb3.setSelected(false);
            }

            if (cb4.isSelected()) {
                cbDia4.setValue(cbAñadirDia.getSelectionModel().getSelectedItem().toString());
                cbMes4.setValue(cbAñadirMes.getSelectionModel().getSelectedItem().toString());
                cbHrI4.setValue(cbAñadirHrI.getSelectionModel().getSelectedItem().toString());
                cbHrF4.setValue(cbAñadirHrFin.getSelectionModel().getSelectedItem().toString());
                cbModalidad4.setValue(cbAñadirModalidad.getSelectionModel().getSelectedItem().toString());
                cbLugar4.setValue(cbAñadirLugar.getSelectionModel().getSelectedItem().toString());
                tfGrupo4.setText(tfAñadirGrupo.getText());
                
                cbDia4.setStyle("-fx-background-color: #FA2D23");
                cbMes4.setStyle("-fx-background-color: #FA2D23");
                cbHrI4.setStyle("-fx-background-color: #FA2D23");
                cbHrF4.setStyle("-fx-background-color: #FA2D23");
                cbLugar4.setStyle("-fx-background-color: #FA2D23");
                cbModalidad4.setStyle("-fx-background-color: #FA2D23");
                tfGrupo4.setStyle("-fx-background-color: #FA2D23");

                cbDia4.setDisable(true);
                cbMes4.setDisable(true);
                cbHrI4.setDisable(true);
                cbHrF4.setDisable(true);
                cbLugar4.setDisable(true);
                cbModalidad4.setDisable(true);
                tfGrupo4.setDisable(true);

                cb4.setSelected(false);
            }

            cbAñadirDia.setValue(null);
            cbAñadirMes.setValue(null);
            cbAñadirHrI.setValue(null);
            cbAñadirHrFin.setValue(null);
            cbAñadirLugar.setValue(null);
            cbAñadirModalidad.setValue(null);
            tfAñadirGrupo.setText(null);
            tfAñadirVinculo.setText(null);
            
            lbAñadirVinculo.setVisible(false);
            tfAñadirVinculo.setVisible(false);
        }

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
        ObservableList<String> modalidad = FXCollections.observableList(Arrays.asList("Presencial", "En línea"));
        cbModalidad1.setItems(modalidad);
        cbModalidad2.setItems(modalidad);
        cbModalidad3.setItems(modalidad);
        cbModalidad4.setItems(modalidad);

        cbGrupoModalidad1.setItems(modalidad);
        cbGrupoModalidad2.setItems(modalidad);

        cbAñadirModalidad.setItems(modalidad);

    }

    private void llenarComboPeriodo() {
        ObservableList<String> periodos = FXCollections.observableList(Arrays.asList("Agosto 2022 - Enero 2023", "Febrero 2022 - Julio 2022", "Agosto 2021 - Enero 2022"));
        cbPeriodo.setItems(periodos);
    }

    private void llenarComboSesion() {
        ObservableList<String> sesiones = FXCollections.observableList(Arrays.asList("1", "2", "3"));
        cbSesion.setItems(sesiones);
    }

    private void llenarComboProgramaEducativo() {
        ObservableList<String> programas = FXCollections.observableList(Arrays.asList("Tecnologías Computacionales", "Ingeniería de Software", "Redes y Servicios de Cómputo"));
        cbProgramaEducativo.setItems(programas);
    }

    private void llenarCombosLugar() {
        ObservableList<String> lugares = FXCollections.observableList(Arrays.asList("Aula TC", "F101", "F102", "F103", "F401", "F402", "F403", "Cubículo 1", "Cubículo 2"));
        cbLugar1.setItems(lugares);
        cbLugar2.setItems(lugares);
        cbLugar3.setItems(lugares);
        cbLugar4.setItems(lugares);

        cbGrupoLugar1.setItems(lugares);
        cbGrupoLugar2.setItems(lugares);

        cbAñadirLugar.setItems(lugares);
    }

    @FXML
    void editar1(ActionEvent event) {

        cbDia1.setDisable(false);
        cbMes1.setDisable(false);
        cbHrI1.setDisable(false);
        cbHrF1.setDisable(false);
        cbLugar1.setDisable(false);
        cbModalidad1.setDisable(false);
        tfGrupo1.setDisable(false);

        cbDia1.setStyle("-fx-background-color: ");
        cbMes1.setStyle("-fx-background-color: ");
        cbHrI1.setStyle("-fx-background-color: ");
        cbHrF1.setStyle("-fx-background-color: ");
        cbLugar1.setStyle("-fx-background-color: ");
        cbModalidad1.setStyle("-fx-background-color: ");
        tfGrupo1.setStyle("-fx-background-color: ");

    }

    @FXML
    void eliminar1(ActionEvent event) {
        cbDia1.setValue("");
        cbMes1.setValue("");
        cbHrI1.setValue("");
        cbHrF1.setValue("");
        cbLugar1.setValue("");
        cbModalidad1.setValue("");
        tfGrupo1.setText("");

        cbDia1.setDisable(false);
        cbMes1.setDisable(false);
        cbHrI1.setDisable(false);
        cbHrF1.setDisable(false);
        cbLugar1.setDisable(false);
        cbModalidad1.setDisable(false);
        tfGrupo1.setDisable(false);
    }

    @FXML
    void editar2(ActionEvent event) {
        cbDia2.setDisable(false);
        cbMes2.setDisable(false);
        cbHrI2.setDisable(false);
        cbHrF2.setDisable(false);
        cbLugar2.setDisable(false);
        cbModalidad2.setDisable(false);
        tfGrupo2.setDisable(false);

        cbDia2.setStyle("-fx-background-color: ");
        cbMes2.setStyle("-fx-background-color: ");
        cbHrI2.setStyle("-fx-background-color: ");
        cbHrF2.setStyle("-fx-background-color: ");
        cbLugar2.setStyle("-fx-background-color: ");
        cbModalidad2.setStyle("-fx-background-color: ");
        tfGrupo2.setStyle("-fx-background-color: ");
    }

    @FXML
    void eliminar2(ActionEvent event) {
        cbDia2.setValue("");
        cbMes2.setValue("");
        cbHrI2.setValue("");
        cbHrF2.setValue("");
        cbLugar2.setValue("");
        cbModalidad2.setValue("");
        tfGrupo2.setText("");

        cbDia2.setDisable(false);
        cbMes2.setDisable(false);
        cbHrI2.setDisable(false);
        cbHrF2.setDisable(false);
        cbLugar2.setDisable(false);
        cbModalidad2.setDisable(false);
        tfGrupo2.setDisable(false);
    }

    @FXML
    void editar3(ActionEvent event) {
        cbDia3.setDisable(false);
        cbMes3.setDisable(false);
        cbHrI3.setDisable(false);
        cbHrF3.setDisable(false);
        cbLugar3.setDisable(false);
        cbModalidad3.setDisable(false);
        tfGrupo3.setDisable(false);

        cbDia3.setStyle("-fx-background-color: ");
        cbMes3.setStyle("-fx-background-color: ");
        cbHrI3.setStyle("-fx-background-color: ");
        cbHrF3.setStyle("-fx-background-color: ");
        cbLugar3.setStyle("-fx-background-color: ");
        cbModalidad3.setStyle("-fx-background-color: ");
        tfGrupo3.setStyle("-fx-background-color: ");

    }

    @FXML
    void eliminar3(ActionEvent event) {
        cbDia3.setValue("");
        cbMes3.setValue("");
        cbHrI3.setValue("");
        cbHrF3.setValue("");
        cbLugar3.setValue("");
        cbModalidad3.setValue("");
        tfGrupo3.setText("");

        cbDia3.setDisable(false);
        cbMes3.setDisable(false);
        cbHrI3.setDisable(false);
        cbHrF3.setDisable(false);
        cbLugar3.setDisable(false);
        cbModalidad3.setDisable(false);
        tfGrupo3.setDisable(false);
    }

    @FXML
    void editar4(ActionEvent event) {
        cbDia4.setDisable(false);
        cbMes4.setDisable(false);
        cbHrI4.setDisable(false);
        cbHrF4.setDisable(false);
        cbLugar4.setDisable(false);
        cbModalidad4.setDisable(false);
        tfGrupo4.setDisable(false);

        cbDia4.setStyle("-fx-background-color: ");
        cbMes4.setStyle("-fx-background-color: ");
        cbHrI4.setStyle("-fx-background-color: ");
        cbHrF4.setStyle("-fx-background-color: ");
        cbLugar4.setStyle("-fx-background-color: ");
        cbModalidad4.setStyle("-fx-background-color: ");
        tfGrupo4.setStyle("-fx-background-color: ");
    }

    @FXML
    void eliminar4(ActionEvent event) {
        cbDia4.setValue("");
        cbMes4.setValue("");
        cbHrI4.setValue("");
        cbHrF4.setValue("");
        cbLugar4.setValue("");
        cbModalidad4.setValue("");
        tfGrupo4.setText("");

        cbDia4.setDisable(false);
        cbMes4.setDisable(false);
        cbHrI4.setDisable(false);
        cbHrF4.setDisable(false);
        cbLugar4.setDisable(false);
        cbModalidad4.setDisable(false);
        tfGrupo4.setDisable(false);
    }

    @FXML
    void editarGrupo1(ActionEvent event) {
        cbGrupoDia1.setDisable(false);
        cbGrupoMes1.setDisable(false);
        cbGrupoHrI1.setDisable(false);
        cbGrupoHrF1.setDisable(false);
        cbGrupoLugar1.setDisable(false);
        cbGrupoModalidad1.setDisable(false);
        tfGrupoGrupo1.setDisable(false);

    }

    @FXML
    void eliminarGrupo1(ActionEvent event) {
        cbGrupoDia1.setValue("");
        cbGrupoMes1.setValue("");
        cbGrupoHrI1.setValue("");
        cbGrupoHrF1.setValue("");
        cbGrupoLugar1.setValue("");
        cbGrupoModalidad1.setValue("");
        tfGrupoGrupo1.setText("");

        cbGrupoDia1.setDisable(false);
        cbGrupoMes1.setDisable(false);
        cbGrupoHrI1.setDisable(false);
        cbGrupoHrF1.setDisable(false);
        cbGrupoLugar1.setDisable(false);
        cbGrupoModalidad1.setDisable(false);
        tfGrupoGrupo1.setDisable(false);
    }

    @FXML
    void editarGrupo2(ActionEvent event) {
        cbGrupoDia2.setDisable(false);
        cbGrupoMes2.setDisable(false);
        cbGrupoHrI2.setDisable(false);
        cbGrupoHrF2.setDisable(false);
        cbGrupoLugar2.setDisable(false);
        cbGrupoModalidad2.setDisable(false);
        tfGrupoGrupo2.setDisable(false);
    }

    @FXML
    void eliminarGrupo2(ActionEvent event) {
        cbGrupoDia2.setValue("");
        cbGrupoMes2.setValue("");
        cbGrupoHrI2.setValue("");
        cbGrupoHrF2.setValue("");
        cbGrupoLugar2.setValue("");
        cbGrupoModalidad2.setValue("");
        tfGrupoGrupo2.setText("");

        cbGrupoDia2.setDisable(false);
        cbGrupoMes2.setDisable(false);
        cbGrupoHrI2.setDisable(false);
        cbGrupoHrF2.setDisable(false);
        cbGrupoLugar2.setDisable(false);
        cbGrupoModalidad2.setDisable(false);
        tfGrupoGrupo2.setDisable(false);
    }

    @FXML
    void guardar1(ActionEvent event) {

        cbDia1.setDisable(true);
        cbMes1.setDisable(true);
        cbHrI1.setDisable(true);
        cbHrF1.setDisable(true);
        cbLugar1.setDisable(true);
        cbModalidad1.setDisable(true);
        tfGrupo1.setDisable(true);

    }

    @FXML
    void guardar2(ActionEvent event) {
        cbDia2.setDisable(true);
        cbMes2.setDisable(true);
        cbHrI2.setDisable(true);
        cbHrF2.setDisable(true);
        cbLugar2.setDisable(true);
        cbModalidad2.setDisable(true);
        tfGrupo2.setDisable(true);
    }

    @FXML
    void guardar3(ActionEvent event) {
        cbDia3.setDisable(true);
        cbMes3.setDisable(true);
        cbHrI3.setDisable(true);
        cbHrF3.setDisable(true);
        cbLugar3.setDisable(true);
        cbModalidad3.setDisable(true);
        tfGrupo3.setDisable(true);
    }

    @FXML
    void guardar4(ActionEvent event) {
        cbDia4.setDisable(true);
        cbMes4.setDisable(true);
        cbHrI4.setDisable(true);
        cbHrF4.setDisable(true);
        cbLugar4.setDisable(true);
        cbModalidad4.setDisable(true);
        tfGrupo4.setDisable(true);
    }

}
