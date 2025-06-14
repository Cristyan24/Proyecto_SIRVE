/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ListaMultasDoble {
    private NodoMulta cabeza;
    private NodoMulta cola;

    public void agregarMulta(Multa multa) {
        NodoMulta nuevo = new NodoMulta(multa);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public List<Multa> buscarPorPlaca(String placa) {
        List<Multa> resultados = new ArrayList<>();
        NodoMulta actual = cabeza;
        while (actual != null) {
            if (actual.multa.getPlaca().equalsIgnoreCase(placa)) {
                resultados.add(actual.multa);
            }
            actual = actual.siguiente;
        }
        return resultados;
    }

    public void cargarDesdeArchivo(File archivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean primera = true;
            while ((linea = br.readLine()) != null) {
                if (primera) {
                    primera = false; // omitir encabezado
                    continue;
                }
                String[] partes = linea.split(",");
                if (partes.length >= 4) {
                    Multa m = new Multa(partes[0], partes[1], partes[2], Double.parseDouble(partes[3]));
                    agregarMulta(m);
                }
            }
        }
    }
}
