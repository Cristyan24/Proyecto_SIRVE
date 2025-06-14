/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

/**
 *
 * @author user
 */
public class NodoTraspaso {
    Traspaso traspaso;
    NodoTraspaso siguiente;

    public NodoTraspaso(Traspaso traspaso) {
        this.traspaso = traspaso;
        this.siguiente = null;
    }
}
