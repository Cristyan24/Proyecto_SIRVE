/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

/**
 *
 * @author user
 */
public class Traspaso {
    private String placa;
    private String dpiAnterior;
    private String nombreAnterior;
    private String fecha;
    private String dpiNuevo;
    private String nombreNuevo;
    private String departamento;

    public Traspaso(String placa, String dpiAnterior, String nombreAnterior, String fecha, String dpiNuevo, String nombreNuevo, String departamento) {
        this.placa = placa;
        this.dpiAnterior = dpiAnterior;
        this.nombreAnterior = nombreAnterior;
        this.fecha = fecha;
        this.dpiNuevo = dpiNuevo;
        this.nombreNuevo = nombreNuevo;
        this.departamento = departamento;
    }

    public String getPlaca() {
        return placa;
    }

    public String getDpiAnterior() {
        return dpiAnterior;
    }

    public String getNombreAnterior() {
        return nombreAnterior;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDpiNuevo() {
        return dpiNuevo;
    }

    public String getNombreNuevo() {
        return nombreNuevo;
    }
     public String getDepartamento() {
        return departamento;
    }
}
