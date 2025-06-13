/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

import java.util.List;

/**
 *
 * @author user
 */
public class ArbolABB {
    private NodoABB raiz;

    public void insertar(Vehiculo vehiculo) {
        raiz = insertarRec(raiz, vehiculo);
    }

    private NodoABB insertarRec(NodoABB nodo, Vehiculo vehiculo) {
        if (nodo == null) return new NodoABB(vehiculo);

        if (vehiculo.getPlaca().compareToIgnoreCase(nodo.vehiculo.getPlaca()) < 0) {
            nodo.izquierda = insertarRec(nodo.izquierda, vehiculo);
        } else {
            nodo.derecha = insertarRec(nodo.derecha, vehiculo);
        }
        return nodo;
    }

    public void inorden(List<Vehiculo> lista) {
        inordenRec(raiz, lista);
    }

    private void inordenRec(NodoABB nodo, List<Vehiculo> lista) {
        if (nodo != null) {
            inordenRec(nodo.izquierda, lista);
            lista.add(nodo.vehiculo);
            inordenRec(nodo.derecha, lista);
        }
    }
    
    public void eliminar(String placa) {
    raiz = eliminarRec(raiz, placa);
}

    
    private NodoABB eliminarRec(NodoABB nodo, String placa) {
    if (nodo == null) return null;

    if (placa.compareTo(nodo.vehiculo.getPlaca()) < 0) {
        nodo.izquierda = eliminarRec(nodo.izquierda, placa);
    } else if (placa.compareTo(nodo.vehiculo.getPlaca()) > 0) {
        nodo.derecha = eliminarRec(nodo.derecha, placa);
    } else {
        if (nodo.izquierda == null) return nodo.derecha;
        if (nodo.derecha == null) return nodo.izquierda;

        NodoABB sucesor = encontrarMin(nodo.derecha);
        nodo.vehiculo = sucesor.vehiculo;
        nodo.derecha = eliminarRec(nodo.derecha, sucesor.vehiculo.getPlaca());
    }

    return nodo;
}

private NodoABB encontrarMin(NodoABB nodo) {
    while (nodo.izquierda != null) nodo = nodo.izquierda;
    return nodo;
}

    
}
