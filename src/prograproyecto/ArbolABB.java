/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograproyecto;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

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

    
    public void MostrarArbolABB() {
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("arbolABB.dot"));
        writer.write("digraph G {\n");
        writer.write("node [shape=ellipse, style=filled, color=lightblue];\n");

        if (raiz != null) {
            generarArbolABB(raiz, writer);
        }
        writer.write("}\n");

        writer.close();

        Process p = Runtime.getRuntime().exec("\"C:\\Program Files\\Graphviz\\bin\\dot.exe\" -Tpng arbolABB.dot -o arbolABB.png");
        p.waitFor();

        Desktop.getDesktop().open(new File("arbolABB.png"));
    } catch (IOException | InterruptedException e) {
        JOptionPane.showMessageDialog(null, "Error al generar el gráfico ABB: " + e.getMessage());
    }
}

    private void generarArbolABB(NodoABB nodo, BufferedWriter writer) throws IOException {
    if (nodo != null) {
        String etiqueta = nodo.vehiculo.getPlaca();
        writer.write("\"" + etiqueta + "\" [label=\"" + etiqueta + "\"];\n");

        if (nodo.izquierda != null) {
            writer.write("\"" + etiqueta + "\" -> \"" + nodo.izquierda.vehiculo.getPlaca() + "\";\n");
            generarArbolABB(nodo.izquierda, writer);
        }
        if (nodo.derecha != null) {
            writer.write("\"" + etiqueta + "\" -> \"" + nodo.derecha.vehiculo.getPlaca() + "\";\n");
               generarArbolABB(nodo.derecha, writer);
}

    }
}
    

    
}
