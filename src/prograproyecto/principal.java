
package prograproyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class principal extends javax.swing.JFrame {
    
    ArbolABB abb = new ArbolABB();
    ArbolAVL avl = new ArbolAVL();
    DefaultTableModel modelo;

    
    public principal() {
        initComponents();
        modelo = (DefaultTableModel) TablaVehiculos.getModel();

        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        VehiculosABB = new javax.swing.JButton();
        AgregarVehiculo = new javax.swing.JButton();
        EliminarVehiculo = new javax.swing.JButton();
        ModificarVehiculo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CargaABByAVL = new javax.swing.JButton();
        LabelBuscar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        comboDepartamento = new javax.swing.JComboBox<>();
        TiempoABB = new javax.swing.JTextField();
        TiempoAVL = new javax.swing.JTextField();
        LabelTiempoAVL = new javax.swing.JLabel();
        LabelTiempoABB = new javax.swing.JLabel();
        PanelContenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVehiculos = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VehiculosABB.setText("Vehiculos");
        VehiculosABB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculosABBActionPerformed(evt);
            }
        });

        AgregarVehiculo.setText("Nuevo Vehiculo");
        AgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVehiculoActionPerformed(evt);
            }
        });

        EliminarVehiculo.setText("Eliminar vehiculo");

        ModificarVehiculo.setText("Modificar vehiculo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Vehiculos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ModificarVehiculo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EliminarVehiculo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AgregarVehiculo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VehiculosABB)
                            .addComponent(jLabel2))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(VehiculosABB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgregarVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EliminarVehiculo)
                .addGap(18, 18, 18)
                .addComponent(ModificarVehiculo)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 220));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROGRAMA SIRVE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, -1));

        CargaABByAVL.setText("Cargar Archivos");
        CargaABByAVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaABByAVLActionPerformed(evt);
            }
        });
        jPanel1.add(CargaABByAVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        LabelBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelBuscar.setForeground(new java.awt.Color(204, 255, 255));
        LabelBuscar.setText("Buscar: ");
        jPanel1.add(LabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 180, -1));

        comboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));
        jPanel1.add(TiempoABB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, 80, -1));

        TiempoAVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoAVLActionPerformed(evt);
            }
        });
        jPanel1.add(TiempoAVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 80, -1));

        LabelTiempoAVL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelTiempoAVL.setForeground(new java.awt.Color(255, 255, 255));
        LabelTiempoAVL.setText("Tiempo de ejecucion en AVL:");
        jPanel1.add(LabelTiempoAVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, -1, -1));

        LabelTiempoABB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelTiempoABB.setForeground(new java.awt.Color(255, 255, 255));
        LabelTiempoABB.setText("Tiempo de ejecucion en ABB:");
        jPanel1.add(LabelTiempoABB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        PanelContenido.setBackground(new java.awt.Color(51, 255, 51));

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

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(PanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 720, 220));

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

    private void VehiculosABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculosABBActionPerformed
        String seleccionado = (String) comboDepartamento.getSelectedItem();
    List<Vehiculo> lista = new ArrayList<>();
    abb.inorden(lista);

    modelo.setRowCount(0);
    for (Vehiculo v : lista) {
        if (v.getDepartamento().equalsIgnoreCase(seleccionado)) {
            modelo.addRow(new Object[]{
                v.getPlaca(), v.getDpi(), v.getNombre(),
                v.getMarca(), v.getModelo(), v.getAño(),
                v.getMultas(), v.getTraspasos()
            });
        }
    }

    }//GEN-LAST:event_VehiculosABBActionPerformed

    private void CargaABByAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaABByAVLActionPerformed
        JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int seleccion = fileChooser.showOpenDialog(this);

    if (seleccion == JFileChooser.APPROVE_OPTION) {
        File carpetaSeleccionada = fileChooser.getSelectedFile();
        cargarTodosLosArchivos(carpetaSeleccionada);
        JOptionPane.showMessageDialog(this, "Archivos cargados en ABB y AVL.");
    }
    }//GEN-LAST:event_CargaABByAVLActionPerformed

    private void TiempoAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoAVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempoAVLActionPerformed

    private void AgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarVehiculoActionPerformed
        
   
    public void cargarTodosLosArchivos(File carpetaRaiz) {
    File[] carpetas = carpetaRaiz.listFiles(File::isDirectory);

    if (carpetas != null) {
        comboDepartamento.removeAllItems(); // Limpia combo previo

        // ⏱️ MEDIR TIEMPO EN ABB
        long inicioABB = System.nanoTime();

        for (File carpeta : carpetas) {
            String nombreDepartamento = carpeta.getName();
            comboDepartamento.addItem(nombreDepartamento);

            File[] archivos = carpeta.listFiles((dir, name) -> name.endsWith("_vehiculos.txt"));
            if (archivos != null) {
                for (File archivo : archivos) {
                    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            if (linea.toLowerCase().contains("placa") && linea.toLowerCase().contains("modelo")) continue;

                            String[] datos = linea.split(",");
                            if (datos.length >= 6) {
                                Vehiculo v = new Vehiculo(datos, nombreDepartamento);
                                abb.insertar(v); // Solo ABB en este bloque
                            }
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error al leer: " + archivo.getName());
                    }
                }
            }
        }

        long finABB = System.nanoTime();
        TiempoABB.setText((finABB - inicioABB) / 1_000_000 + " ms");

        // ⏱️ MEDIR TIEMPO EN AVL
        long inicioAVL = System.nanoTime();

        for (File carpeta : carpetas) {
            String nombreDepartamento = carpeta.getName();

            File[] archivos = carpeta.listFiles((dir, name) -> name.endsWith("_vehiculos.txt"));
            if (archivos != null) {
                for (File archivo : archivos) {
                    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            if (linea.toLowerCase().contains("placa") && linea.toLowerCase().contains("modelo")) continue;

                            String[] datos = linea.split(",");
                            if (datos.length >= 6) {
                                Vehiculo v = new Vehiculo(datos, carpeta.getName());
                                avl.insertar(v); // Solo AVL en este bloque
                            }
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error al leer: " + archivo.getName());
                    }
                }
            }
        }

        long finAVL = System.nanoTime();
        TiempoAVL.setText((finAVL - inicioAVL) / 1_000_000 + " ms");
    }
}








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
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVehiculo;
    private javax.swing.JButton CargaABByAVL;
    private javax.swing.JButton EliminarVehiculo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelTiempoABB;
    private javax.swing.JLabel LabelTiempoAVL;
    private javax.swing.JButton ModificarVehiculo;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JTable TablaVehiculos;
    private javax.swing.JTextField TiempoABB;
    private javax.swing.JTextField TiempoAVL;
    private javax.swing.JButton VehiculosABB;
    private javax.swing.JComboBox<String> comboDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
