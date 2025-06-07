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
    public Vehiculos dato;
    public NodoABB izquierda;
    public NodoABB derecha;

    public NodoABB(Vehiculos dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}
