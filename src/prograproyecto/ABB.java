/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

import java.util.function.Consumer;

/**
 *
 * @author user
 */
public class ABB {
    public NodoABB raiz;

    public void insertar(Vehiculos nuevo) {
        raiz = insertarRec(raiz, nuevo);
    }

    private NodoABB insertarRec(NodoABB actual, Vehiculos nuevo) {
        if (actual == null) {
            return new NodoABB(nuevo);
        }

        if (nuevo.compareTo(actual.dato) < 0) {
            actual.izquierda = insertarRec(actual.izquierda, nuevo);
        } else if (nuevo.compareTo(actual.dato) > 0) {
            actual.derecha = insertarRec(actual.derecha, nuevo);
        }

        return actual;
    }

    // Recorrido inOrden que acepta una función para procesar cada nodo
    public void inOrden(Consumer<Vehiculos> accion) {
        inOrdenRec(raiz, accion);
    }

    private void inOrdenRec(NodoABB nodo, Consumer<Vehiculos> accion) {
        if (nodo != null) {
            inOrdenRec(nodo.izquierda, accion);
            accion.accept(nodo.dato);
            inOrdenRec(nodo.derecha, accion);
        }
    }
}