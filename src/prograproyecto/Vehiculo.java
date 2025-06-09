/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

/**
 *
 * @author user
 */
public class Vehiculo {
     private String placa;
    private String dpi;
    private String nombre;
    private String marca;
    private String modelo;
    private String año;

    public Vehiculo(String placa, String dpi, String nombre, String marca, String modelo, String año) {
        this.placa = placa;
        this.dpi = dpi;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getPlaca() { return placa; }
    public String getDpi() { return dpi; }
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getAño() { return año; }
}
