/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

/**
 *
 * @author user
 */
public class NodoAVL {
    Vehiculo vehiculo;
    NodoAVL izquierda, derecha;
    int altura;

    public NodoAVL(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.altura = 1;
    }
}
