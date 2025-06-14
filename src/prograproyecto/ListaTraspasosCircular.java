/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ListaTraspasosCircular {
     private NodoTraspaso cabeza;

    public void insertar(Traspaso traspaso) {
        NodoTraspaso nuevo = new NodoTraspaso(traspaso);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            NodoTraspaso actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public List<Traspaso> buscarPorPlaca(String placa) {
        List<Traspaso> encontrados = new ArrayList<>();
        if (cabeza == null) return encontrados;

        NodoTraspaso actual = cabeza;
        do {
            if (actual.traspaso.getPlaca().equalsIgnoreCase(placa)) {
                encontrados.add(actual.traspaso);
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return encontrados;
    }

    public void recorrerTodos(List<Traspaso> lista) {
        if (cabeza == null) return;

        NodoTraspaso actual = cabeza;
        do {
            lista.add(actual.traspaso);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}
