/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

/**
 *
 * @author user
 */
public class NodoABB {
    Vehiculo dato;
    NodoABB izquierda, derecha;

    public NodoABB(Vehiculo dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}
