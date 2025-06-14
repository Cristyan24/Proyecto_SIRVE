
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
    public ListaTraspasosCircular listaTraspasos = new ListaTraspasosCircular();
    DefaultTableModel modelo;
    public File carpetaSeleccionada;


    
    public principal() {
        initComponents();
        modelo = (DefaultTableModel) TablaVehiculos.getModel();
        PanelContenido.setVisible(false);
        VehiculoIng.setVisible(false);
        BuscarVehiculo.setVisible(false);
        MultaIng.setVisible(false);
        BuscarMulta.setVisible(false);
        TraspasoIng.setVisible(false);
        BuscarTraspaso.setVisible(false);
        PanelMultas.setVisible(false);
        PanelTraspasos.setVisible(false);



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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MultasTabla = new javax.swing.JButton();
        AgregarMulta = new javax.swing.JButton();
        EliminarMulta = new javax.swing.JButton();
        ModificarMulta = new javax.swing.JButton();
        LabelBuscar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TraspasosTabla = new javax.swing.JButton();
        AgregarTraspaso = new javax.swing.JButton();
        EliminarTraspaso = new javax.swing.JButton();
        ModificarTraspaso = new javax.swing.JButton();
        VehiculoIng = new javax.swing.JTextField();
        BuscarVehiculo = new javax.swing.JButton();
        MultaIng = new javax.swing.JTextField();
        BuscarMulta = new javax.swing.JButton();
        TraspasoIng = new javax.swing.JTextField();
        BuscarTraspaso = new javax.swing.JButton();
        comboDepartamento = new javax.swing.JComboBox<>();
        PanelRegistros = new javax.swing.JPanel();
        TiempoABB = new javax.swing.JTextField();
        TiempoAVL = new javax.swing.JTextField();
        LabelTiempoAVL = new javax.swing.JLabel();
        LabelTiempoABB = new javax.swing.JLabel();
        LabelArbol = new javax.swing.JLabel();
        MostrarABB = new javax.swing.JButton();
        MostrarAVL = new javax.swing.JButton();
        PanelContenido = new javax.swing.JPanel();
        PanelTraspasos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaTraspasos = new javax.swing.JTable();
        PanelMultas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaMultas = new javax.swing.JTable();
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Multas");

        MultasTabla.setText("Multas");
        MultasTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultasTablaActionPerformed(evt);
            }
        });

        AgregarMulta.setText("Nueva Multa");
        AgregarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMultaActionPerformed(evt);
            }
        });

        EliminarMulta.setText("Pagar Multa");

        ModificarMulta.setText("Modificar Multa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(EliminarMulta)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(MultasTabla))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(AgregarMulta))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ModificarMulta)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(MultasTabla)
                .addGap(18, 18, 18)
                .addComponent(AgregarMulta)
                .addGap(18, 18, 18)
                .addComponent(EliminarMulta)
                .addGap(18, 18, 18)
                .addComponent(ModificarMulta)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 170, 220));

        LabelBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelBuscar.setForeground(new java.awt.Color(204, 255, 255));
        LabelBuscar.setText("Buscar: ");
        jPanel1.add(LabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Traspasos");

        TraspasosTabla.setText("Traspasos");
        TraspasosTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraspasosTablaActionPerformed(evt);
            }
        });

        AgregarTraspaso.setText("Agregar Traspaso");

        EliminarTraspaso.setText("Eliminar Traspaso");

        ModificarTraspaso.setText("Modificar Traspaso");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(45, 45, 45))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(TraspasosTabla))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EliminarTraspaso)
                            .addComponent(AgregarTraspaso)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ModificarTraspaso)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TraspasosTabla)
                .addGap(18, 18, 18)
                .addComponent(AgregarTraspaso)
                .addGap(18, 18, 18)
                .addComponent(EliminarTraspaso)
                .addGap(18, 18, 18)
                .addComponent(ModificarTraspaso)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, 240));
        jPanel1.add(VehiculoIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 180, -1));

        BuscarVehiculo.setText("Buscar");
        BuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 80, -1, -1));
        jPanel1.add(MultaIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 180, -1));

        BuscarMulta.setText("Buscar");
        BuscarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMultaActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 80, -1, -1));
        jPanel1.add(TraspasoIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 180, -1));

        BuscarTraspaso.setText("Buscar");
        BuscarTraspaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTraspasoActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarTraspaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 80, -1, -1));

        comboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        PanelRegistros.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout PanelRegistrosLayout = new javax.swing.GroupLayout(PanelRegistros);
        PanelRegistros.setLayout(PanelRegistrosLayout);
        PanelRegistrosLayout.setHorizontalGroup(
            PanelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        PanelRegistrosLayout.setVerticalGroup(
            PanelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
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
        jPanel1.add(LabelArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 250, 130));

        MostrarABB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MostrarABB.setText("Arbol ABB");
        MostrarABB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarABBActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarABB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 110, 40));

        MostrarAVL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MostrarAVL.setText("Arbol AVL");
        MostrarAVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarAVLActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarAVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 110, 40));

        PanelContenido.setBackground(new java.awt.Color(51, 255, 51));

        PanelTraspasos.setBackground(new java.awt.Color(51, 255, 51));

        TablaTraspasos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "DPI Anterior", "Nombre Anterior", "Fecha", "DPI Nuevo", "Nombre Nuevo"
            }
        ));
        jScrollPane3.setViewportView(TablaTraspasos);

        javax.swing.GroupLayout PanelTraspasosLayout = new javax.swing.GroupLayout(PanelTraspasos);
        PanelTraspasos.setLayout(PanelTraspasosLayout);
        PanelTraspasosLayout.setHorizontalGroup(
            PanelTraspasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTraspasosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTraspasosLayout.setVerticalGroup(
            PanelTraspasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTraspasosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelMultas.setBackground(new java.awt.Color(51, 255, 51));

        TablaMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Placa", "Fecha", "Descripcion", "Monto"
            }
        ));
        jScrollPane2.setViewportView(TablaMultas);

        javax.swing.GroupLayout PanelMultasLayout = new javax.swing.GroupLayout(PanelMultas);
        PanelMultas.setLayout(PanelMultasLayout);
        PanelMultasLayout.setHorizontalGroup(
            PanelMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMultasLayout.setVerticalGroup(
            PanelMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMultasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

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
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelMultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelContenidoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelTraspasos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenidoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelContenidoLayout.createSequentialGroup()
                    .addComponent(PanelMultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelContenidoLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(PanelTraspasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
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
    PanelContenido.setVisible(true);
    PanelMultas.setVisible(false);
    PanelTraspasos.setVisible(false);
    jScrollPane1.setVisible(true); 

    VehiculoIng.setVisible(true);
    BuscarVehiculo.setVisible(true);
    MultaIng.setVisible(false);
    BuscarMulta.setVisible(false);
    TraspasoIng.setVisible(false);
    BuscarTraspaso.setVisible(false);

    PanelRegistros.removeAll();
    PanelRegistros.revalidate();
    PanelRegistros.repaint();

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
        carpetaSeleccionada = fileChooser.getSelectedFile();
        cargarTodosLosArchivos(carpetaSeleccionada);
        JOptionPane.showMessageDialog(this, "Archivos cargados en ABB y AVL.");
    }
    }//GEN-LAST:event_CargaABByAVLActionPerformed

    private void TiempoAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoAVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempoAVLActionPerformed

    private void AgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVehiculoActionPerformed
    NuevoVehiculo panel = new NuevoVehiculo(this); 

    List<String> departamentos = new ArrayList<>();
    for (int i = 0; i < comboDepartamento.getItemCount(); i++) {
        departamentos.add(comboDepartamento.getItemAt(i));
    }
    panel.setDepartamentos(departamentos); 

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
            ModificarVehiculo panel = new ModificarVehiculo(
                this,
                encontrado.getPlaca(),
                encontrado.getModelo(),
                encontrado.getMarca(),
                String.valueOf(encontrado.getAño())
            );

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
        return; 
    }

    int confirm = JOptionPane.showConfirmDialog(this,
            "¿Está seguro de que desea eliminar el vehículo con placa: " + placa + "?",
            "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirm != JOptionPane.YES_OPTION) {
        return; 
    }

    placa = placa.trim();
    Vehiculo v = avl.buscar(placa);
    if (v == null) {
        JOptionPane.showMessageDialog(this, "Vehículo no encontrado.");
        return;
    }

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

        abb.eliminar(placa);
        avl.eliminar(placa);

        JOptionPane.showMessageDialog(this, "Vehículo eliminado correctamente.");
        recargarTabla();

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar el vehículo del archivo.");
    }
    }//GEN-LAST:event_EliminarVehiculoActionPerformed

    private void BuscarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMultaActionPerformed
    String placa = MultaIng.getText().trim();
    String dep = comboDepartamento.getSelectedItem().toString();

    if (placa.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese una placa para buscar.");
        return;
    }

    File archivo = new File(carpetaSeleccionada, dep + "/" + dep + "_multas.txt");
    ListaMultasDoble lista = new ListaMultasDoble();

    try {
        lista.cargarDesdeArchivo(archivo);
        List<Multa> resultados = lista.buscarPorPlaca(placa);

        DefaultTableModel modeloMulta = (DefaultTableModel) TablaMultas.getModel();
        modeloMulta.setRowCount(0);

        for (Multa m : resultados) {
            modeloMulta.addRow(new Object[]{
                m.getPlaca(), m.getFecha(), m.getDescripcion(), m.getMonto()
            });
        }

        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron multas para esa placa.");
        }
        
        MultaIng.setText("");

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo de multas.");
    }
    }//GEN-LAST:event_BuscarMultaActionPerformed

    private void MultasTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultasTablaActionPerformed
    String departamento = (String) comboDepartamento.getSelectedItem();
    File archivo = new File(carpetaSeleccionada, departamento + "/" + departamento + "_multas.txt");

    DefaultTableModel modeloMultas = (DefaultTableModel) TablaMultas.getModel();
    modeloMultas.setRowCount(0); // Limpiar

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.toLowerCase().contains("placa") && linea.toLowerCase().contains("fecha")) continue;

            String[] partes = linea.split(",");
            if (partes.length == 4) {
                modeloMultas.addRow(new Object[]{partes[0], partes[1], partes[2], partes[3]});
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer archivo de multas.");
    }      
        
    PanelContenido.setVisible(true);
    PanelMultas.setVisible(true);
    PanelTraspasos.setVisible(false);
    jScrollPane1.setVisible(false); // Oculta tabla vehículos
    PanelRegistros.removeAll();
    
    VehiculoIng.setVisible(false);
    BuscarVehiculo.setVisible(false);
    MultaIng.setVisible(true);
    BuscarMulta.setVisible(true);
    TraspasoIng.setVisible(false);
    BuscarTraspaso.setVisible(false);
    }//GEN-LAST:event_MultasTablaActionPerformed

    private void TraspasosTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraspasosTablaActionPerformed
    String departamento = (String) comboDepartamento.getSelectedItem();
    File archivo = new File(carpetaSeleccionada, departamento + "/" + departamento + "_traspasos.txt");

    DefaultTableModel modeloTraspasos = (DefaultTableModel) TablaTraspasos.getModel();
    modeloTraspasos.setRowCount(0); // Limpiar la tabla antes de cargar

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.toLowerCase().contains("placa") && linea.toLowerCase().contains("fecha")) continue;

            String[] partes = linea.split(",");
            if (partes.length == 6) {
                modeloTraspasos.addRow(new Object[]{
                    partes[0], partes[1], partes[2],
                    partes[3], partes[4], partes[5]
                });
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer archivo de traspasos.");
    }
        
    PanelContenido.setVisible(true);
    PanelMultas.setVisible(false);
    PanelTraspasos.setVisible(true);
    jScrollPane1.setVisible(false); // Oculta tabla vehículos
    PanelRegistros.removeAll();
    
    VehiculoIng.setVisible(false);
    BuscarVehiculo.setVisible(false);
    MultaIng.setVisible(false);
    BuscarMulta.setVisible(false);
    TraspasoIng.setVisible(true);
    BuscarTraspaso.setVisible(true);
    }//GEN-LAST:event_TraspasosTablaActionPerformed

    private void BuscarTraspasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTraspasoActionPerformed
    String placaBuscar = TraspasoIng.getText().trim();
    String departamentoActual = comboDepartamento.getSelectedItem().toString();

    if (placaBuscar.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese una placa para buscar.");
        return;
    }

    DefaultTableModel modeloTraspasos = (DefaultTableModel) TablaTraspasos.getModel();
    modeloTraspasos.setRowCount(0);

    boolean encontrado = false;
    
    List<Traspaso> resultados = listaTraspasos.buscarPorPlaca(placaBuscar);

    for (Traspaso t : resultados) {
        if (t.getDepartamento().equalsIgnoreCase(departamentoActual)) {
            modeloTraspasos.addRow(new Object[]{
                t.getPlaca(),
                t.getDpiAnterior(),
                t.getNombreAnterior(),
                t.getFecha(),
                t.getDpiNuevo(),
                t.getNombreNuevo()
            });
            encontrado = true;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "No hay traspasos para esta placa en este departamento.");
    }

    TraspasoIng.setText("");
    }//GEN-LAST:event_BuscarTraspasoActionPerformed

    private void MostrarAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarAVLActionPerformed
       avl.MostrarArbolAVL();
    }//GEN-LAST:event_MostrarAVLActionPerformed

    private void MostrarABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarABBActionPerformed
        abb.MostrarArbolABB();
    }//GEN-LAST:event_MostrarABBActionPerformed

    private void AgregarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMultaActionPerformed
    NuevaMulta panel = new NuevaMulta(this); // le pasas la instancia principal
    panel.setVisible(true);

    PanelRegistros.removeAll();
    PanelRegistros.add(panel);
    PanelRegistros.revalidate();
    PanelRegistros.repaint();
    }//GEN-LAST:event_AgregarMultaActionPerformed
        
   
    public void cargarTodosLosArchivos(File carpetaRaiz) {
    File[] carpetas = carpetaRaiz.listFiles(File::isDirectory);

    if (carpetas != null) {
        comboDepartamento.removeAllItems(); 

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
                                abb.insertar(v); 
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
                                avl.insertar(v);
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

    String seleccionado = (String) comboDepartamento.getSelectedItem();

    long inicio = System.nanoTime();
    Vehiculo encontrado = avl.buscar(placaBuscar);
    long fin = System.nanoTime();

    modelo.setRowCount(0);

    if (encontrado != null) {
        if (encontrado.getDepartamento().equalsIgnoreCase(seleccionado)) {
            modelo.addRow(new Object[]{
                encontrado.getPlaca(), encontrado.getDpi(), encontrado.getNombre(),
                encontrado.getMarca(), encontrado.getModelo(), encontrado.getAño(),
                encontrado.getMultas(), encontrado.getTraspasos()
            });

            JOptionPane.showMessageDialog(this, "Vehiculo encontrado");
        } else {
            JOptionPane.showMessageDialog(this, "Vehiculo encontrado, pero pertenece al departamento: " + encontrado.getDepartamento());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Vehiculo no encontrado.");
    }
    VehiculoIng.setText(""); 

}
       
    public void recargarTabla() {
    String seleccionado = (String) comboDepartamento.getSelectedItem();
    List<Vehiculo> lista = new ArrayList<>();
    avl.inorden(lista); 

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
    private javax.swing.JButton AgregarMulta;
    private javax.swing.JButton AgregarTraspaso;
    private javax.swing.JButton AgregarVehiculo;
    private javax.swing.JButton BuscarMulta;
    private javax.swing.JButton BuscarTraspaso;
    private javax.swing.JButton BuscarVehiculo;
    private javax.swing.JButton CargaABByAVL;
    private javax.swing.JButton EliminarMulta;
    private javax.swing.JButton EliminarTraspaso;
    private javax.swing.JButton EliminarVehiculo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelArbol;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelTiempoABB;
    private javax.swing.JLabel LabelTiempoAVL;
    private javax.swing.JButton ModificarMulta;
    private javax.swing.JButton ModificarTraspaso;
    private javax.swing.JButton ModificarVehiculo;
    private javax.swing.JButton MostrarABB;
    private javax.swing.JButton MostrarAVL;
    private javax.swing.JTextField MultaIng;
    private javax.swing.JButton MultasTabla;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelMultas;
    private javax.swing.JPanel PanelRegistros;
    private javax.swing.JPanel PanelTraspasos;
    private javax.swing.JTable TablaMultas;
    private javax.swing.JTable TablaTraspasos;
    private javax.swing.JTable TablaVehiculos;
    private javax.swing.JTextField TiempoABB;
    private javax.swing.JTextField TiempoAVL;
    private javax.swing.JTextField TraspasoIng;
    private javax.swing.JButton TraspasosTabla;
    private javax.swing.JTextField VehiculoIng;
    private javax.swing.JButton VehiculosTabla;
    private javax.swing.JComboBox<String> comboDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
