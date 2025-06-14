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

    public void eliminar(String placa) {
    raiz = eliminarRec(raiz, placa);
}

private NodoAVL eliminarRec(NodoAVL nodo, String placa) {
    if (nodo == null) return null;

    if (placa.compareToIgnoreCase(nodo.vehiculo.getPlaca()) < 0) {
        nodo.izquierda = eliminarRec(nodo.izquierda, placa);
    } else if (placa.compareToIgnoreCase(nodo.vehiculo.getPlaca()) > 0) {
        nodo.derecha = eliminarRec(nodo.derecha, placa);
    } else {
        // Nodo con solo un hijo o sin hijos
        if (nodo.izquierda == null) return nodo.derecha;
        else if (nodo.derecha == null) return nodo.izquierda;

        // Nodo con dos hijos: obtener el sucesor
        NodoAVL sucesor = encontrarMinimo(nodo.derecha);
        nodo.vehiculo = sucesor.vehiculo;
        nodo.derecha = eliminarRec(nodo.derecha, sucesor.vehiculo.getPlaca());
    }

    // Aquí puedes aplicar balanceo si es AVL
    return nodo;
}

private NodoAVL encontrarMinimo(NodoAVL nodo) {
    while (nodo.izquierda != null) {
        nodo = nodo.izquierda;
    }
    return nodo;
}

        public void generarDotAVL(NodoAVL nodo, BufferedWriter writer) throws IOException {
    if (nodo != null) {
        String etiqueta = nodo.vehiculo.getPlaca();
        writer.write("\"" + etiqueta + "\" [label=\"" + etiqueta + "\"];\n");

        if (nodo.izquierda != null) {
            writer.write("\"" + etiqueta + "\" -> \"" + nodo.izquierda.vehiculo.getPlaca() + "\";\n");
            generarDotAVL(nodo.izquierda, writer);
        }
        if (nodo.derecha != null) {
            writer.write("\"" + etiqueta + "\" -> \"" + nodo.derecha.vehiculo.getPlaca() + "\";\n");
            generarDotAVL(nodo.derecha, writer);
        }
    }
}
        
        public void exportarAVLComoImagen() {
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("arbolAVL.dot"));
        writer.write("digraph G {\n");
        writer.write("node [shape=ellipse, style=filled, color=lightgreen];\n");

        if (raiz != null) {
            generarDotAVL(raiz, writer);
        }

        writer.write("}\n");
        writer.close();

        // Llamar a Graphviz
        Process p = Runtime.getRuntime().exec("\"C:\\Program Files\\Graphviz\\bin\\dot.exe\" -Tpng arbolAVL.dot -o arbolAVL.png");

        p.waitFor();

        // Abrir la imagen
        Desktop.getDesktop().open(new File("arbolAVL.png"));
    } catch (IOException | InterruptedException e) {
        JOptionPane.showMessageDialog(null, "Error al generar el gráfico AVL: " + e.getMessage());
    }
}



    

    private String getEtiquetaNodo(NodoAVL nodo) {
    return "\"" + nodo.vehiculo.getPlaca() + "\" [label=\"" +
           nodo.vehiculo.getPlaca() + "\\n" +
           nodo.vehiculo.getModelo() + "\\n" +
           nodo.vehiculo.getAño() + "\"];";
}





    
}
