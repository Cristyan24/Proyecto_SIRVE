
package prograproyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
    public File carpetaSeleccionada;


    
    public principal() {
        initComponents();
        modelo = (DefaultTableModel) TablaVehiculos.getModel();

    }
    
    public File getCarpetaSeleccionada() {
        return carpetaSeleccionada;
    }

    public String getDepartamentoSeleccionado() {
    return comboDepartamento.getSelectedItem().toString();
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        VehiculosTabla = new javax.swing.JButton();
        AgregarVehiculo = new javax.swing.JButton();
        EliminarVehiculo = new javax.swing.JButton();
        ModificarVehiculo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CargaABByAVL = new javax.swing.JButton();
        LabelBuscar = new javax.swing.JLabel();
        VehiculoIng = new javax.swing.JTextField();
        BuscarVehiculo = new javax.swing.JButton();
        comboDepartamento = new javax.swing.JComboBox<>();
        PanelRegistros = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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

        VehiculosTabla.setText("Vehiculos");
        VehiculosTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculosTablaActionPerformed(evt);
            }
        });

        AgregarVehiculo.setText("Nuevo Vehiculo");
        AgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVehiculoActionPerformed(evt);
            }
        });

        EliminarVehiculo.setText("Eliminar vehiculo");
        EliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarVehiculoActionPerformed(evt);
            }
        });

        ModificarVehiculo.setText("Modificar vehiculo");
        ModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarVehiculoActionPerformed(evt);
            }
        });

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
                            .addComponent(VehiculosTabla)
                            .addComponent(jLabel2))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(VehiculosTabla)
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
        jPanel1.add(VehiculoIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 180, -1));

        BuscarVehiculo.setText("Buscar");
        BuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 80, -1, -1));

        comboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cris.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelRegistrosLayout = new javax.swing.GroupLayout(PanelRegistros);
        PanelRegistros.setLayout(PanelRegistrosLayout);
        PanelRegistrosLayout.setHorizontalGroup(
            PanelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelRegistrosLayout.setVerticalGroup(
            PanelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrosLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(PanelRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 720, 250));
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

    private void VehiculosTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculosTablaActionPerformed
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

    }//GEN-LAST:event_VehiculosTablaActionPerformed

    private void CargaABByAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaABByAVLActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
        carpetaSeleccionada = fileChooser.getSelectedFile(); // <== IMPORTANTE
        cargarTodosLosArchivos(carpetaSeleccionada);
        JOptionPane.showMessageDialog(this, "Archivos cargados en ABB y AVL.");
    }
    }//GEN-LAST:event_CargaABByAVLActionPerformed

    private void TiempoAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoAVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempoAVLActionPerformed

    private void AgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVehiculoActionPerformed
    NuevoVehiculo panel = new NuevoVehiculo(this); // creas el panel

    // Cargar lista de departamentos reales
    List<String> departamentos = new ArrayList<>();
    for (int i = 0; i < comboDepartamento.getItemCount(); i++) {
        departamentos.add(comboDepartamento.getItemAt(i));
    }
    panel.setDepartamentos(departamentos); // pasar al formulario

    //  Mostrar el panel en PanelRegistros
    PanelRegistros.removeAll();
    PanelRegistros.setLayout(new java.awt.BorderLayout());
    PanelRegistros.add(panel);
    PanelRegistros.revalidate();
    PanelRegistros.repaint();
    }//GEN-LAST:event_AgregarVehiculoActionPerformed

    private void BuscarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarVehiculoActionPerformed
        buscarVehiculoPorPlacaEnAVL();
    }//GEN-LAST:event_BuscarVehiculoActionPerformed

    private void ModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarVehiculoActionPerformed
            String placa = JOptionPane.showInputDialog(this, "Ingrese la placa del vehículo a modificar:");

    if (placa != null && !placa.trim().isEmpty()) {
        Vehiculo encontrado = avl.buscar(placa.trim());

        if (encontrado != null) {
            // Crear el panel con los datos del vehículo
            ModificarVehiculo panel = new ModificarVehiculo(
                this,
                encontrado.getPlaca(),
                encontrado.getModelo(),
                encontrado.getMarca(),
                String.valueOf(encontrado.getAño())
            );

            // Asegurar que sea visible y se coloque en el contenedor
            panel.setVisible(true);
            PanelRegistros.removeAll();
            PanelRegistros.setLayout(new java.awt.BorderLayout()); // asegúrate del layout
            PanelRegistros.add(panel, java.awt.BorderLayout.CENTER);
            PanelRegistros.revalidate();
            PanelRegistros.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "Vehículo no encontrado.");
        }
    }

    }//GEN-LAST:event_ModificarVehiculoActionPerformed

    private void EliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarVehiculoActionPerformed
        String placa = JOptionPane.showInputDialog(this, "Ingrese la placa del vehículo a eliminar:");

    if (placa == null || placa.trim().isEmpty()) {
        return; // Cancelado o vacío: no hace nada
    }

    // Confirmar solo una vez
    int confirm = JOptionPane.showConfirmDialog(this,
            "¿Está seguro de que desea eliminar el vehículo con placa: " + placa + "?",
            "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirm != JOptionPane.YES_OPTION) {
        return; // Si elige NO, no hace nada más
    }

    placa = placa.trim();
    Vehiculo v = avl.buscar(placa);
    if (v == null) {
        JOptionPane.showMessageDialog(this, "Vehículo no encontrado.");
        return;
    }

    // Eliminar del archivo
    File archivo = new File(carpetaSeleccionada, v.getDepartamento() + "/" + v.getDepartamento() + "_vehiculos.txt");

    try {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.toLowerCase().startsWith(placa.toLowerCase() + ",")) {
                    lineas.add(linea);
                }
            }
        }

        try (FileWriter fw = new FileWriter(archivo, false)) {
            for (String l : lineas) {
                fw.write(l + "\n");
            }
        }

        // Eliminar de los árboles
        abb.eliminar(placa);
        avl.eliminar(placa);

        JOptionPane.showMessageDialog(this, "Vehículo eliminado correctamente.");
        recargarTabla();

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar el vehículo del archivo.");
    }
    }//GEN-LAST:event_EliminarVehiculoActionPerformed
        
   
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
    
    private void buscarVehiculoPorPlacaEnAVL() {
    String placaBuscar = VehiculoIng.getText().trim();
    if (placaBuscar.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese una placa para buscar.");
        return;
    }

    String seleccionado = (String) comboDepartamento.getSelectedItem(); // <- Departamento activo

    long inicio = System.nanoTime();
    Vehiculo encontrado = avl.buscar(placaBuscar);
    long fin = System.nanoTime();

    modelo.setRowCount(0); // Limpiar tabla antes de mostrar

    if (encontrado != null) {
        if (encontrado.getDepartamento().equalsIgnoreCase(seleccionado)) {
            modelo.addRow(new Object[]{
                encontrado.getPlaca(), encontrado.getDpi(), encontrado.getNombre(),
                encontrado.getMarca(), encontrado.getModelo(), encontrado.getAño(),
                encontrado.getMultas(), encontrado.getTraspasos()
            });

            JOptionPane.showMessageDialog(this, "Vehículo encontrado");
        } else {
            JOptionPane.showMessageDialog(this, "Vehículo encontrado, pero pertenece al departamento: " + encontrado.getDepartamento());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Vehículo no encontrado.");
    }
    VehiculoIng.setText(""); // Limpia el campo después de la búsqueda

}
    
    public void recargarTabla() {
    String seleccionado = (String) comboDepartamento.getSelectedItem();
    List<Vehiculo> lista = new ArrayList<>();
    avl.inorden(lista); // O abb.inorden(lista), según uses

    modelo.setRowCount(0); // Limpiar tabla

    for (Vehiculo v : lista) {
        if (v.getDepartamento().equalsIgnoreCase(seleccionado)) {
            modelo.addRow(new Object[]{
                v.getPlaca(), v.getDpi(), v.getNombre(),
                v.getMarca(), v.getModelo(), v.getAño(),
                v.getMultas(), v.getTraspasos()
            });
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
    private javax.swing.JButton AgregarVehiculo;
    private javax.swing.JButton BuscarVehiculo;
    private javax.swing.JButton CargaABByAVL;
    private javax.swing.JButton EliminarVehiculo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelTiempoABB;
    private javax.swing.JLabel LabelTiempoAVL;
    private javax.swing.JButton ModificarVehiculo;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelRegistros;
    private javax.swing.JTable TablaVehiculos;
    private javax.swing.JTextField TiempoABB;
    private javax.swing.JTextField TiempoAVL;
    private javax.swing.JTextField VehiculoIng;
    private javax.swing.JButton VehiculosTabla;
    private javax.swing.JComboBox<String> comboDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
