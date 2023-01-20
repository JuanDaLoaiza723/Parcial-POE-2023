package Vista;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01
 *    Profesor: Luis Romo Portilla 
 *
 *    Archivo:  VentanaPrincipalVista.java
 *    Licencia: GNU-GPL 
 *    @version  1.0
 *    
 *    @author   Alejandro Guerrero Cano           (202179652-3743) {@literal <"alejandro.cano@correounivalle.edu.co">}
 *    @author   Juan David Loaiza Santiago        (202177570-3743) {@literal <"juan.loaiza.santiago@correounivalle.edu.co">}
 * 
*/

public class VentanaPrincipalVista extends javax.swing.JFrame {

    /**
     * Creacion de un modelo de tabla NO editable
     */
    private DefaultTableModel modeloTabla1 = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
    
    /**
     * Creacion de un modelo de tabla NO editable
     */
    private DefaultTableModel modeloTabla2 = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
    
    public VentanaPrincipalVista() {
        initComponents();
        table_historicoVentas.setModel(modeloTabla1);
        table_pronosticoVentas.setModel(modeloTabla2);
        configurarTabla1();
        configurarTabla2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_datosVentas = new javax.swing.JLabel();
        lbl_cantidadVenta = new javax.swing.JLabel();
        txtF_cantidadVentas = new javax.swing.JTextField();
        lbl_añosPronostico = new javax.swing.JLabel();
        lbl_cantidadAños = new javax.swing.JLabel();
        txtF_cantidadAños = new javax.swing.JTextField();
        lbl_controles = new javax.swing.JLabel();
        btn_agregarAño = new javax.swing.JButton();
        btn_borrarAño = new javax.swing.JButton();
        btn_modificarAño = new javax.swing.JButton();
        btn_nuevoPronostico = new javax.swing.JButton();
        lbl_historicoVentas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_historicoVentas = new javax.swing.JTable();
        lbl_pronosticoVentas = new javax.swing.JLabel();
        lbl_crecimientoPromedio = new javax.swing.JLabel();
        txtF_crecimientoPromedio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pronosticoVentas = new javax.swing.JTable();
        lbl_año = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtF_x = new javax.swing.JTextField();
        txtF_y = new javax.swing.JTextField();
        txtF_x2 = new javax.swing.JTextField();
        txtF_y2 = new javax.swing.JTextField();
        txtF_xy = new javax.swing.JTextField();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 560));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_titulo.setText("Pronóstico de ventas");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        lbl_datosVentas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_datosVentas.setText("Datos de venta");
        jPanel1.add(lbl_datosVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lbl_cantidadVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cantidadVenta.setText("Cantidad de venta:");
        jPanel1.add(lbl_cantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        jPanel1.add(txtF_cantidadVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 100, -1));
        txtF_cantidadVentas.getAccessibleContext().setAccessibleName("Cantidad de Ventas");

        lbl_añosPronostico.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_añosPronostico.setText("Años a pronosticar");
        jPanel1.add(lbl_añosPronostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        lbl_cantidadAños.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cantidadAños.setText("Cantidad:");
        lbl_cantidadAños.setToolTipText("");
        jPanel1.add(lbl_cantidadAños, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        jPanel1.add(txtF_cantidadAños, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 70, -1));

        lbl_controles.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_controles.setText("Controles");
        jPanel1.add(lbl_controles, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        btn_agregarAño.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_agregarAño.setText("Agregar año");
        jPanel1.add(btn_agregarAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        btn_borrarAño.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_borrarAño.setText("Borrar año");
        jPanel1.add(btn_borrarAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        btn_modificarAño.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_modificarAño.setText("Modificar año");
        jPanel1.add(btn_modificarAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        btn_nuevoPronostico.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_nuevoPronostico.setText("Nuevo pronóstico");
        jPanel1.add(btn_nuevoPronostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        lbl_historicoVentas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_historicoVentas.setText("Histórico de ventas");
        jPanel1.add(lbl_historicoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        table_historicoVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(table_historicoVentas);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 460, 190));

        lbl_pronosticoVentas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_pronosticoVentas.setText("Pronóstico de ventas");
        jPanel1.add(lbl_pronosticoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        lbl_crecimientoPromedio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_crecimientoPromedio.setText("Crecimiento en promedio:");
        jPanel1.add(lbl_crecimientoPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        txtF_crecimientoPromedio.setEditable(false);
        jPanel1.add(txtF_crecimientoPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 100, -1));

        table_pronosticoVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_pronosticoVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, 200));

        lbl_año.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_año.setText("Año");
        jPanel1.add(lbl_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Cantidad ventas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 290, -1, -1));

        txtF_x.setEditable(false);
        jPanel1.add(txtF_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 93, -1));

        txtF_y.setEditable(false);
        jPanel1.add(txtF_y, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 93, -1));

        txtF_x2.setEditable(false);
        jPanel1.add(txtF_x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 93, -1));

        txtF_y2.setEditable(false);
        jPanel1.add(txtF_y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 93, -1));

        txtF_xy.setEditable(false);
        jPanel1.add(txtF_xy, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 93, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipalVista().setVisible(true);
            }
        });
    }
    
    
    //              GETTERS Y SETTERS               //
    
    /**
     * Asigna un texto al txtF_cantidadVentas
     * @param texto El texto que se asignara al campo (String)
     */
    public void setCantidadVentas(String texto){
        txtF_cantidadVentas.setText(texto);
    }
    
    /**
     * Obtiene la cantidad de ventas del campo de texto
     * @return la cantidad de ventas (int)
     */
    public String getCantidadVentas(){
        return txtF_cantidadVentas.getText();
    }
    
    /**
     * Asigna un texto al txtF_cantidadAños
     * @param texto El texto que se asignara al campo (String)
     */
    public void setCantidadAños(String texto){
        txtF_cantidadAños.setText(texto);
    }
    
    /**
     * Obtiene la cantidad de años del campo de texto
     * @return la cantidad de años (int)
     */
    public String getCantidadAños(){
        return txtF_cantidadAños.getText();
    }
    
    /**
     * Asigna un texto al txtF_crecimientoPromedio
     * @param texto El texto que se asignara al campo (String)
     */
    public void setCrecimientoPromedio(String texto){
        txtF_crecimientoPromedio.setText(texto);
    }
    
    /**
     * Obtiene el crecimiento promedio del campo de texto
     * @return el crecimiento promedio (int)
     */
    public String getCrecimientoPromedio(){
        return txtF_crecimientoPromedio.getText();
    }
    
    /**
     * Asigna un texto al txtF_x
     * @param texto El texto que se asignara al campo (String)
     */
    public void setXVenta(String texto){
        txtF_x.setText(texto);
    }
    
    /**
     * Obtiene el crecimiento promedio del campo de texto
     * @return La x (int)
     */
    public String getXVenta(){
        return txtF_x.getText();
    }
    
    /**
     * Asigna un texto al txtF_y
     * @param texto El texto que se asignara al campo (String)
     */
    public void setYVenta(String texto){
        txtF_y.setText(texto);
    }
    
    /**
     * Obtiene el crecimiento promedio del campo de texto
     * @return La y (int)
     */
    public String getYVenta(){
        return txtF_y.getText();
    }
    
    /**
     * Asigna un texto al txtF_x2
     * @param texto El texto que se asignara al campo (String)
     */
    public void setX2Venta(String texto){
        txtF_x2.setText(texto);
    }
    
    /**
     * Obtiene el crecimiento promedio del campo de texto
     * @return La x^2 (int)
     */
    public String getX2Venta(){
        return txtF_x2.getText();
    }
    
    /**
     * Asigna un texto al txtF_y2
     * @param texto El texto que se asignara al campo (String)
     */
    public void setY2Venta(String texto){
        txtF_y2.setText(texto);
    }
    
    /**
     * Obtiene el crecimiento promedio del campo de texto
     * @return La y^2 (int)
     */
    public String getY2Venta(){
        return txtF_y2.getText();
    }
    
    /**
     * Asigna un texto al txtF_xy
     * @param texto El texto que se asignara al campo (String)
     */
    public void setXYVenta(String texto){
        txtF_xy.setText(texto);
    }
    
    /**
     * Obtiene el crecimiento promedio del campo de texto
     * @return La x*y (int)
     */
    public String getXYVenta(){
        return txtF_xy.getText();
    }
    
    /**
     * Crea los titulos de la tabla histórico de ventas
     */
    public void configurarTabla1() {
        String[] titulosTabla1 = new String[]{"X","Y","X^2","Y^2","X*Y"};
        modeloTabla1.setColumnIdentifiers(titulosTabla1);
    }
    
    /**
     * Crea los titulos de la tabla pronóstico de ventas
     */
    public void configurarTabla2() {
        String[] titulosTabla2 = new String[]{"AÑO","PRONÓSTICO VENTAS"};
        modeloTabla2.setColumnIdentifiers(titulosTabla2);
    }
    
    
    /**
     * Añade una nueva fila con los datos históricos de las ventas
     * @param x Los años de ventas(int)
     * @param y La cantidad de ventas (String)
     * 
     */
    public void nuevaFilaVentas(int x, double y, int x2, double y2,double xy) {
        modeloTabla1.addRow(new Object[]{
            x, y, x2, y2, xy
        });
    }
    
    /**
     * Añade una nueva fila con los datos históricos de las ventas
     * @param año Los años de ventas siguientes(int)
     * @param pronostico La ventas previstas (String)
     * 
     */
    public void nuevaFilaPronostico(int año, int pronostico) {
        modeloTabla1.addRow(new Object[]{
            año, pronostico
        });
    }
    
    
    //              FUNCIONES DE LIMPIEZA                   //
    
    /**
     * Elimina todas las filas de la tabla histórico de ventas
     */
    public void limpiarTabla1() {
        int filasTabla1 = modeloTabla1.getRowCount();
        for (int i = 0; i < filasTabla1; i++) {
            modeloTabla1.removeRow(0);
        }
    }
    
    /**
     * Elimina todas las filas de la tabla pronóstico de ventas
     */
    public void limpiarTabla2() {
        int filasTabla2 = modeloTabla2.getRowCount();
        for (int i = 0; i < filasTabla2; i++) {
            modeloTabla2.removeRow(0);
        }
    }
    
    /**
     * Elimina una fila específica de la tabla histórico de ventas
     *
     * @param fila La Fila a eliminar
     */
    public void eliminarFilaTabla1(int fila) {
        modeloTabla1.removeRow(fila);
    }
    
    /**
     * Vacía los textos en los campos de id y nombre
     */
    public void limpiarCampos() {
        txtF_cantidadVentas.setText("");
        txtF_cantidadAños.setText("");
    }
    
    //              HABILITAR/DESHABILITAR BOTONES          //
    
    /**
     * Habilita el boton de agregar año
     */
    public void habilitarAgregarAño() {
        btn_agregarAño.setEnabled(true);
    }
    
    /**
     * Deshabilita el boton de agregar año
     */
    public void deshabilitarAgregarAño() {
        btn_agregarAño.setEnabled(false);
    }
    
    /**
     * Habilita el boton de borrar año
     */
    public void habilitarBorrarAño() {
        btn_borrarAño.setEnabled(true);
    }
    
    /**
     * Deshabilita el boton de borrar año
     */
    public void deshhabilitarBorrarAño() {
        btn_borrarAño.setEnabled(false);
    }
    
    /**
     * Habilita el boton de modificar año
     */
    public void habilitarModificarAño() {
        btn_modificarAño.setEnabled(true);
    }
    
    /**
     * Deshabilita el boton de modificar año
     */
    public void deshabilitarModificarAño() {
        btn_modificarAño.setEnabled(false);
    }
    
    /**
     * Habilita el boton de nuevo pronóstico
     */
    public void habilitarNuevoPronostico() {
        btn_nuevoPronostico.setEnabled(true);
    }
    
    /**
     * Deshabilita el boton de nuevo pronóstico
     */
    public void deshabilitarNuevoPronostico() {
        btn_nuevoPronostico.setEnabled(false);
    }
    
    
    
    //              LISTENERS            //
    
    /**
     * Añade un ActionListener a btn_agregarAño
     * @param listener El listener (ActionListener)
     */
    public void addActionAgregarAño(ActionListener listener){
        btn_agregarAño.addActionListener(listener);
    }
    
    /**
     * Añade un ActionListener a btn_borrarAño
     * @param listener El listener (ActionListener)
     */
    public void addActionBorrarAño(ActionListener listener){
        btn_borrarAño.addActionListener(listener);
    }
        
    /**
     * Añade un ActionListener a btn_modificarAño
     * @param listener El listener (ActionListener)
     */
    public void addModificarAño(ActionListener listener){
        btn_modificarAño.addActionListener(listener);
    }
    
    /**
     * Añade un ActionListener a btn_nuevoPronostico
     * @param listener El listener (ActionListener)
     */
    public void addActionNuevoPronostico(ActionListener listener){
        btn_nuevoPronostico.addActionListener(listener);
    }
    
    /**
     * Agrega un MouseListener a la tabla histórico de ventas
     * @param listener El MouseListener
     */
    public void addActionTable1(MouseListener listener) {
        table_historicoVentas.addMouseListener(listener);
    }
    
    /**
     * Agrega un MouseListener a la tabla pronóstico de ventas
     * @param listener El MouseListener
     */
    public void addActionTable2(MouseListener listener) {
        table_pronosticoVentas.addMouseListener(listener);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarAño;
    private javax.swing.JButton btn_borrarAño;
    private javax.swing.JButton btn_modificarAño;
    private javax.swing.JButton btn_nuevoPronostico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_año;
    private javax.swing.JLabel lbl_añosPronostico;
    private javax.swing.JLabel lbl_cantidadAños;
    private javax.swing.JLabel lbl_cantidadVenta;
    private javax.swing.JLabel lbl_controles;
    private javax.swing.JLabel lbl_crecimientoPromedio;
    private javax.swing.JLabel lbl_datosVentas;
    private javax.swing.JLabel lbl_historicoVentas;
    private javax.swing.JLabel lbl_pronosticoVentas;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable table_historicoVentas;
    private javax.swing.JTable table_pronosticoVentas;
    private javax.swing.JTextField txtF_cantidadAños;
    private javax.swing.JTextField txtF_cantidadVentas;
    private javax.swing.JTextField txtF_crecimientoPromedio;
    private javax.swing.JTextField txtF_x;
    private javax.swing.JTextField txtF_x2;
    private javax.swing.JTextField txtF_xy;
    private javax.swing.JTextField txtF_y;
    private javax.swing.JTextField txtF_y2;
    // End of variables declaration//GEN-END:variables

}
