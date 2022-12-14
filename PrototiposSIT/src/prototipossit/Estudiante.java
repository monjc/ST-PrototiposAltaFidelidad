/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipossit;

import javafx.scene.control.Button;


/**
 *
 * @author salom
 */
public class Estudiante {
    public String matricula;
    public String nombre;
    public int dia;
    public String mes;
    public String horaInicio;
    public String horaFin;
    public String modalidad;
    public int avance;
    private Button editar;
    private Button eliminar;

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public Button getEditar() {
        return editar;
    }

    public void setEditar(Button editar) {
        this.editar = editar;
    }

    public Button getEliminar() {
        return eliminar;
    }

    public void setEliminar(Button eliminar) {
        this.eliminar = eliminar;
    }

    public Estudiante() {
    }

    public Estudiante(String matricula, String nombre, int dia, String mes, String horaInicio, String horaFin, String modalidad, int avance) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.modalidad = modalidad;
        this.avance = avance;
        this.editar = new Button("Editar");
        this.eliminar = new Button("Eliminar");
    }
}
