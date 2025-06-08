
package prograproyecto;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CargarArchivos = new javax.swing.JButton();
        PanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVehiculos = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROGRAMA SIRVE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        CargarArchivos.setText("Cargar Archivos");
        CargarArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarArchivosActionPerformed(evt);
            }
        });
        jPanel1.add(CargarArchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        TablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "DPI", "Nombre", "Marca", "Modelo", "Año", "Multas", "Traspasos"
            }
        ));
        jScrollPane1.setViewportView(TablaVehiculos);

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 710, 240));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/carro.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarArchivosActionPerformed
         JFileChooser fileChooser = new JFileChooser();
fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Solo carpetas
int seleccion = fileChooser.showOpenDialog(this);

if (seleccion == JFileChooser.APPROVE_OPTION) {
    File carpetaSeleccionada = fileChooser.getSelectedFile();
    String rutaCarpeta = carpetaSeleccionada.getAbsolutePath();
    
    System.out.println("Carpeta seleccionada: " + rutaCarpeta); // Debug

    ABB arbolVehiculos = CargadorVehiculos.cargarVehiculosDesdeCarpetas(rutaCarpeta);

    DefaultTableModel modelo = (DefaultTableModel) TablaVehiculos.getModel();
    modelo.setRowCount(0);

    arbolVehiculos.inOrden(vehiculo -> {
        Object[] fila = {
            vehiculo.placa,
            vehiculo.dpi,
            vehiculo.nombre,
            vehiculo.marca,
            vehiculo.modelo,
            vehiculo.anio,
            vehiculo.multas,
            vehiculo.traspasos
        };
        modelo.addRow(fila);
    });
}
    }//GEN-LAST:event_CargarArchivosActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    
 public class CargadorVehiculos {

    public static ABB cargarVehiculosDesdeCarpetas(String rutaCarpeta) {
        ABB arbol = new ABB();

        File carpetaPrincipal = new File(rutaCarpeta);
        File[] carpetasDepartamentos = carpetaPrincipal.listFiles(File::isDirectory);

        if (carpetasDepartamentos != null) {
            for (File carpeta : carpetasDepartamentos) {
                File[] archivos = carpeta.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
                if (archivos != null) {
                    for (File archivo : archivos) {
                        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                            String linea;
                            while ((linea = br.readLine()) != null) {
                                String[] partes = linea.split(",");
                                if (partes.length == 8) {
                                    String placa = partes[0];
                                    String dpi = partes[1];
                                    String nombre = partes[2];
                                    String marca = partes[3];
                                    String modelo = partes[4];
                                    int anio = Integer.parseInt(partes[5]);
                                    int multas = Integer.parseInt(partes[6]);
                                    int traspasos = Integer.parseInt(partes[7]);

                                    Vehiculos vehiculo = new Vehiculos(placa, dpi, nombre, marca, modelo, anio, multas, traspasos);
                                    arbol.insertar(vehiculo);
                                }
                            }
                        } catch (IOException | NumberFormatException e) {
                            System.out.println("Error leyendo archivo: " + archivo.getName());
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        return arbol;
    }
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarArchivos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JTable TablaVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
