/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

/**
 *
 * @author user
 */
public class Multa {
    private String placa;
    private String fecha;
    private String descripcion;
    private double monto;

    public Multa(String placa, String fecha, String descripcion, double monto) {
        this.placa = placa;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    // Getters
    public String getPlaca() { return placa; }
    public String getFecha() { return fecha; }
    public String getDescripcion() { return descripcion; }
    public double getMonto() { return monto; }
}
