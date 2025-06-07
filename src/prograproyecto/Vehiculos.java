/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

/**
 *
 * @author user
 */
public class Vehiculos implements Comparable<Vehiculos> {
    public String placa;
    public String dpi;
    public String nombre;
    public String marca;
    public String modelo;
    public int anio;
    public int multas;
    public int traspasos;

    public Vehiculos(String placa, String dpi, String nombre, String marca, String modelo, int anio, int multas, int traspasos) {
        this.placa = placa;
        this.dpi = dpi;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.multas = multas;
        this.traspasos = traspasos;
    }

    @Override
    public int compareTo(Vehiculos o) {
        return this.placa.compareTo(o.placa);
    }
}

