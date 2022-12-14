/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prototipossit;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    private TextField tfDocente;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnActualizar;

    @FXML
    private TableView<Estudiante> tEstudiantes;

    @FXML
    private TableColumn<Estudiante, String> cMatricula;

    @FXML
    private TableColumn<Estudiante, String> cNombre;

    @FXML
    private TableColumn<Estudiante, Integer> cDia;

    @FXML
    private TableColumn<Estudiante, String> cMes;

    @FXML
    private TableColumn<Estudiante, String> cHrInicio;

    @FXML
    private TableColumn<Estudiante, String> cHrFin;

    @FXML
    private TableColumn<Estudiante, String> cModalidad;

    @FXML
    private TableColumn<Estudiante, String> cEditar;

    @FXML
    private TableColumn<Estudiante, String> cEliminar;

    /*public ObservableList<Estudiante> listaEstudiantes = FXCollections.observableArrayList(
            new Estudiante("s19123456", "Juan Pérez", 19, "Septiembre", "10:00", "10:30", "Virtual", 80),
            new Estudiante("s20789101", "Mario López", 19, "Septiembre", "10:30", "11:00", "presencial", 90),
            new Estudiante("s19543210", "Pedro Gómez", 20, "Septiembre", "11:00", "11:30", "presencial", 40)
    );*/

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfDocente.setText("Docente de Ejemplo");
        llenarTabla();
    }

    public void llenarTabla() {
        cMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        cNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        cDia.setCellValueFactory(new PropertyValueFactory<>("dia"));
        cMes.setCellValueFactory(new PropertyValueFactory<>("mes"));
        cHrInicio.setCellValueFactory(new PropertyValueFactory<>("horaInicio"));
        cHrFin.setCellValueFactory(new PropertyValueFactory<>("horaFin"));
        cModalidad.setCellValueFactory(new PropertyValueFactory<>("modalidad"));
        cEditar.setCellValueFactory(new PropertyValueFactory<>("editar"));
        cEliminar.setCellValueFactory(new PropertyValueFactory<>("eliminar"));

        tEstudiantes.setItems(listaEstudiantes);
    }

    @FXML
    void guardar(ActionEvent event) {
        
    }

    @FXML
    void actualizar(ActionEvent event) {
        listaEstudiantes.clear();
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
