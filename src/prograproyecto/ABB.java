/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

import java.util.*;
import java.util.function.Consumer;

/**
 *
 * @author user
 */
public class ABB {
    private class Nodo {
        Vehiculo vehiculo;
        Nodo izquierdo, derecho;

        Nodo(Vehiculo v) {
            this.vehiculo = v;
        }
    }

    private Nodo raiz;

    public void insertar(Vehiculo v) {
        raiz = insertarRec(raiz, v);
    }

    private Nodo insertarRec(Nodo actual, Vehiculo v) {
        if (actual == null) return new Nodo(v);

        int cmp = v.getPlaca().compareTo(actual.vehiculo.getPlaca());
        if (cmp < 0)
            actual.izquierdo = insertarRec(actual.izquierdo, v);
        else if (cmp > 0)
            actual.derecho = insertarRec(actual.derecho, v);
        return actual;
    }

    public void inorden(List<Vehiculo> lista) {
        inordenRec(raiz, lista);
    }

    private void inordenRec(Nodo actual, List<Vehiculo> lista) {
        if (actual != null) {
            inordenRec(actual.izquierdo, lista);
            lista.add(actual.vehiculo);
            inordenRec(actual.derecho, lista);
        }
    }
}