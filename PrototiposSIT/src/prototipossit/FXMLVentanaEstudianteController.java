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
    private Button btnAñadir;

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
    
    @FXML
    private Label lbDia1;
    
    @FXML
    private Label lbDia2;
    
    @FXML
    private Label lbMes1;
    
    @FXML
    private Label lbMes2;
    
    @FXML
    private Label lbHrInicio1;
    
    @FXML
    private Label lbHrInicio2;
    
    @FXML
    private Label lbHrFin1;
    
    @FXML
    private Label lbHrFin2;
    
    @FXML
    private Label lbModalidad1;
    
    @FXML
    private Label lbModalidad2;
    
    /*
    @FXML
    private TableView<Estudiante> table;
    
    @FXML
    private TableColumn<Estudiante, String> matricula;
    
    @FXML
    private TableColumn<Estudiante, String> nombre;
    
    @FXML
    private TableColumn<Estudiante, Integer> dia;
    
    @FXML
    private TableColumn<Estudiante, String> mes;
    
    @FXML
    private TableColumn<Estudiante, String> matricula;
    */
    
    public Estudiante estudiante1 = new Estudiante("s19123456", "Juan Pérez", 19, "Septiembre", "10:00", "10:30", "Virtual", 80);
    public Estudiante estudiante2 = new Estudiante("s20789101", "Mario López", 19, "Septiembre", "10:30", "11:00", "presencial", 90);
    public Estudiante estudiante3 = new Estudiante("s19543210", "Pedro Gómez", 20, "Septiembre", "11:00", "11:30", "presencial", 40);
    
    public ObservableList<Estudiante> listaEstudiantes = FXCollections.observableArrayList(
        new Estudiante("s19123456", "Juan Pérez", 19, "Septiembre", "10:00", "10:30", "Virtual", 80),
        new Estudiante("s20789101", "Mario López", 19, "Septiembre", "10:30", "11:00", "presencial", 90),
        new Estudiante("s19543210", "Pedro Gómez", 20, "Septiembre", "11:00", "11:30", "presencial", 40)
    );

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarTabla();
    }
    
   /*public void llenarTabla(){
        matricula.setCellValueFactory(new PropertyValueFactory<Estudiante, String
    }
    */ 
    
    public void llenarTabla(){
        
        lbMatricula1.setText(estudiante1.getMatricula());
        lbMatricula2.setText(estudiante2.getMatricula());
        lbMatricula3.setText(estudiante3.getMatricula());
        
        lbNombre1.setText(estudiante1.getNombre());
        lbNombre2.setText(estudiante2.getNombre());
        lbNombre3.setText(estudiante3.getNombre());
        
        lbDia1.setText(Integer.toString(estudiante1.getDia()));
        lbDia2.setText(Integer.toString(estudiante2.getDia()));
        
        lbMes1.setText(estudiante1.getMes());
        lbMes2.setText(estudiante2.getMes());
        
        lbHrInicio1.setText(estudiante1.getHoraInicio());
        lbHrInicio2.setText(estudiante2.getHoraInicio());
        
        lbHrFin1.setText(estudiante1.getHoraFin());
        lbHrFin2.setText(estudiante2.getHoraFin());
        
        lbModalidad1.setText(estudiante1.getModalidad());
        lbModalidad2.setText(estudiante2.getModalidad());
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
