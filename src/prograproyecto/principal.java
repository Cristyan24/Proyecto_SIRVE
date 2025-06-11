
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
        jLabel1 = new javax.swing.JLabel();
        VehiculosAVL = new javax.swing.JButton();
        CargaABByAVL = new javax.swing.JButton();
        VehiculosABB = new javax.swing.JButton();
        PanelContenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVehiculos = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROGRAMA SIRVE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        VehiculosAVL.setText("Vehiculos en AVL");
        jPanel1.add(VehiculosAVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        CargaABByAVL.setText("Cargar Archivos");
        CargaABByAVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaABByAVLActionPerformed(evt);
            }
        });
        jPanel1.add(CargaABByAVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        VehiculosABB.setText("Vehiculos en ABB");
        VehiculosABB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculosABBActionPerformed(evt);
            }
        });
        jPanel1.add(VehiculosABB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

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

        jPanel1.add(PanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 720, 220));

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
        List<Vehiculo> lista = new ArrayList<>();
        abb.inorden(lista); // o avl.inorden(lista) si prefieres

        modelo.setRowCount(0); // Limpia la tabla

    for (Vehiculo v : lista) {
        modelo.addRow(new Object[]{
            v.getPlaca(), v.getDpi(), v.getNombre(),
            v.getMarca(), v.getModelo(), v.getAño(),
            v.getMultas(), v.getTraspasos()
        });
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
        
   
    public void cargarTodosLosArchivos(File carpetaRaiz) {
    File[] carpetas = carpetaRaiz.listFiles(File::isDirectory);

    if (carpetas != null) {
        for (File carpeta : carpetas) {
            File[] archivos = carpeta.listFiles((dir, name) -> name.endsWith("_vehiculos.txt"));

            if (archivos != null) {
                for (File archivo : archivos) {
                    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            if (linea.toLowerCase().contains("placa") && linea.toLowerCase().contains("modelo")) {
                                continue;
                            }

                            String[] datos = linea.split(",");
                            if (datos.length >= 6) {
                                Vehiculo v = new Vehiculo(datos);
                                abb.insertar(v);
                                avl.insertar(v);
                            }
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error al leer: " + archivo.getName());
                        e.printStackTrace();
                    }
                }
            }
        }
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
    private javax.swing.JButton CargaABByAVL;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JTable TablaVehiculos;
    private javax.swing.JButton VehiculosABB;
    private javax.swing.JButton VehiculosAVL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
