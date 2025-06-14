/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

/**
 *
 * @author user
 */
public class NodoMulta {
   Multa multa;
    NodoMulta anterior;
    NodoMulta siguiente;

    public NodoMulta(Multa multa) {
        this.multa = multa;
        this.anterior = null;
        this.siguiente = null;
    }
    
}
