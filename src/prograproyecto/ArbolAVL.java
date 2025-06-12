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
public class ArbolAVL {
    private NodoAVL raiz;

    public void insertar(Vehiculo vehiculo) {
        raiz = insertarRec(raiz, vehiculo);
    }

    private NodoAVL insertarRec(NodoAVL nodo, Vehiculo vehiculo) {
        if (nodo == null) return new NodoAVL(vehiculo);

        if (vehiculo.getPlaca().compareToIgnoreCase(nodo.vehiculo.getPlaca()) < 0) {
            nodo.izquierda = insertarRec(nodo.izquierda, vehiculo);
        } else {
            nodo.derecha = insertarRec(nodo.derecha, vehiculo);
        }

        nodo.altura = 1 + Math.max(altura(nodo.izquierda), altura(nodo.derecha));
        int balance = getBalance(nodo);

        // Rotaciones
        if (balance > 1 && vehiculo.getPlaca().compareToIgnoreCase(nodo.izquierda.vehiculo.getPlaca()) < 0)
            return rotacionDerecha(nodo);

        if (balance < -1 && vehiculo.getPlaca().compareToIgnoreCase(nodo.derecha.vehiculo.getPlaca()) > 0)
            return rotacionIzquierda(nodo);

        if (balance > 1 && vehiculo.getPlaca().compareToIgnoreCase(nodo.izquierda.vehiculo.getPlaca()) > 0) {
            nodo.izquierda = rotacionIzquierda(nodo.izquierda);
            return rotacionDerecha(nodo);
        }

        if (balance < -1 && vehiculo.getPlaca().compareToIgnoreCase(nodo.derecha.vehiculo.getPlaca()) < 0) {
            nodo.derecha = rotacionDerecha(nodo.derecha);
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    private int altura(NodoAVL nodo) {
        return (nodo == null) ? 0 : nodo.altura;
    }

    private int getBalance(NodoAVL nodo) {
        return (nodo == null) ? 0 : altura(nodo.izquierda) - altura(nodo.derecha);
    }

    private NodoAVL rotacionDerecha(NodoAVL y) {
        NodoAVL x = y.izquierda;
        NodoAVL T2 = x.derecha;

        x.derecha = y;
        y.izquierda = T2;

        y.altura = Math.max(altura(y.izquierda), altura(y.derecha)) + 1;
        x.altura = Math.max(altura(x.izquierda), altura(x.derecha)) + 1;

        return x;
    }

    private NodoAVL rotacionIzquierda(NodoAVL x) {
        NodoAVL y = x.derecha;
        NodoAVL T2 = y.izquierda;

        y.izquierda = x;
        x.derecha = T2;

        x.altura = Math.max(altura(x.izquierda), altura(x.derecha)) + 1;
        y.altura = Math.max(altura(y.izquierda), altura(y.derecha)) + 1;

        return y;
    }

    public void inorden(List<Vehiculo> lista) {
        inordenRec(raiz, lista);
    }

    private void inordenRec(NodoAVL nodo, List<Vehiculo> lista) {
        if (nodo != null) {
            inordenRec(nodo.izquierda, lista);
            lista.add(nodo.vehiculo);
            inordenRec(nodo.derecha, lista);
        }
    }
    
    public Vehiculo buscar(String placa) {
    return buscarRecursivo(raiz, placa);
}

private Vehiculo buscarRecursivo(NodoAVL nodo, String placa) {
    if (nodo == null) return null;

    if (placa.equalsIgnoreCase(nodo.vehiculo.getPlaca())) return nodo.vehiculo;

    if (placa.compareToIgnoreCase(nodo.vehiculo.getPlaca()) < 0)
        return buscarRecursivo(nodo.izquierda, placa);
    else
        return buscarRecursivo(nodo.derecha, placa);
}

    
}
