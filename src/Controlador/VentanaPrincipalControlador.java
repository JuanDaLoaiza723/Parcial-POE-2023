package Controlador;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01
 *    Profesor: Luis Romo Portilla 
 *
 *    Archivo:  VentanaPrincipalControlador.java
 *    Licencia: GNU-GPL 
 *    @version  1.0
 *    
 *    @author   Alejandro Guerrero Cano           (202179652-3743) {@literal <"alejandro.cano@correounivalle.edu.co">}
 *    @author   Juan David Loaiza Santiago        (202177570-3743) {@literal <"juan.loaiza.santiago@correounivalle.edu.co">}
 * 
*/

import Modelo.*;
import Vista.*;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import java.lang.NumberFormatException;
import javax.swing.JOptionPane;

public class VentanaPrincipalControlador {
    
    int selectedRow = 0;
    int selectedAnio = 0;
    int cantidadAños = 0;
    
    VentanaPrincipalModelo modelo = new VentanaPrincipalModelo();
    VentanaPrincipalVista vista = new VentanaPrincipalVista();

    public VentanaPrincipalControlador(VentanaPrincipalModelo modelo, VentanaPrincipalVista vista) {
        
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setVisible(true);
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        
        vista.addActionAgregarAño(oyenteAgregar);
        vista.addModificarAño(oyenteModificar);
        vista.addActionBorrarAño(oyenteEliminar);
        vista.addActionNuevoPronostico(oyenteNuevoPronostico);
        vista.addActionTable1(oyenteFila);
        vista.addActionAñosPronostico(keyguardPronostico);
        vista.addActionCantidadDeVentas(keyguardVenta);
        
        vista.setCantidadAños("5");
    }
    
    public void cargarTabla1(){
        
        vista.limpiarTabla1();
        
        for(int i = 0; i < modelo.getCantidadMisVentas(); i++){
            int x = modelo.getMiX(i);
            double y = modelo.getMiY(i);
            int x2 = modelo.getMiX2(i);
            double y2 = modelo.getMiY2(i);
            double xy = modelo.getMiXY(i);
            
            vista.nuevaFilaVentas(x, y, x2, y2, xy);
        }
    }
    
    public void cargarTabla2(){
        
        vista.limpiarTabla2();
        
        int cantidadVentas = modelo.getCantidadMisVentas();
        
        if(cantidadVentas >= 3){
                
            if(cantidadAños <= 2)
                cantidadAños = 2;
            
            modelo.setAniosPronostico(cantidadAños);
            
            for(int i = cantidadVentas+1; i <= cantidadVentas + cantidadAños; i++){
                // A, B, C
                double b = modelo.getB();
                double a = modelo.getA();
                double c = modelo.getC();
                int y = (int)Math.round(a + (b*i));
                
                vista.nuevaFilaPronostico(i, y);
                
                cargarPorcentaje();
            }
        }
    }
    
    public void cargarSumatorias() {
        // Sumatorias
        if(!(modelo.getCantidadMisVentas() >= 1)){
            vista.limpiarCamposSumatoria();
        }
        String sumx = Integer.toString(modelo.getSumatoriaX());
        String sumy = Double.toString(modelo.getSumatoriaY());
        String sumx2 = Integer.toString(modelo.getSumatoriaX2());
        String sumy2 = Double.toString(modelo.getSumatoriaY2());
        String sumxy = Double.toString(modelo.getSumatoriaXY());
        
        vista.setXVenta(sumx);
        vista.setYVenta(sumy);
        vista.setX2Venta(sumx2);
        vista.setY2Venta(sumy2);
        vista.setXYVenta(sumxy);
    }
    
    public void cargarPorcentaje(){
        double c = modelo.getC();
        double porcentaje = Math.round((c*100) * 10.0)/10.0;
        vista.setCrecimientoPromedio(porcentaje + "%");
    }
        
    public void recargarTodo(){
        cargarTabla1();
        cargarSumatorias();
        cargarTabla2();
        vista.limpiarCampos();
    }
    
    public void actualizarCantidadDeAños(){
        try{
                cantidadAños = Integer.parseInt(vista.getCantidadAños());
                modelo.setAniosPronostico(cantidadAños);
            } catch(NumberFormatException e){
                modelo.setAniosPronostico(2);
                JOptionPane.showMessageDialog(null, "Recuerda escribir un numero en el campo de cantidad de años a pronosticar para ver el pronostico");
            }
    }
    
    
    
    //              LISTENERS               //
    ActionListener oyenteAgregar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent evt) {
            actualizarCantidadDeAños();
            try{
            modelo.agregarAnio(Double.parseDouble(vista.getCantidadVentas()));
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, 
                        "Debe escribir un numero en el campo de Cantidad de venta",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            recargarTodo();
        }
        
    };
    
    ActionListener oyenteModificar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent evt) {
            int cantidadVentas = 0;
            try{
            cantidadVentas = Integer.parseInt(vista.getCantidadVentas());
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, 
                        "Debe escribir un numero en el campo de Cantidad de venta",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            modelo.modificarAnio(cantidadVentas);
            recargarTodo();
        }
    };
    
    /**
     * El año a eliminar se seleccciona automaticamente en el oyente de filas
     */
    ActionListener oyenteEliminar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            modelo.eliminarAnio();
            recargarTodo();
        }
    };
    
    /**
     * Solo eliminar todo
     */
    ActionListener oyenteNuevoPronostico = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            modelo.eliminarTodo();
            recargarTodo();
        }
        
    };
    
    MouseListener oyenteFila = new MouseListener() {
        @Override
        public void mousePressed(MouseEvent Mouse_evt) {
            JTable table = (JTable) Mouse_evt.getSource();
            selectedRow = table.getSelectedRow();
            Point point = Mouse_evt.getPoint();
            int row = table.rowAtPoint(point);
            
            try {
                selectedAnio = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
                modelo.setSelectedAnio(selectedAnio);
            } catch (NumberFormatException e) {
            }

            if (Mouse_evt.getClickCount() == 1) {
            }
            String cantidadVentas = Double.toString(modelo.getCantidadVentasAnio(selectedAnio));
            vista.setCantidadVentas(cantidadVentas);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    };
    
    KeyListener keyguardPronostico = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent evt) { 
            
            int tecla = evt.getKeyChar();
            char caracter = evt.getKeyChar();
            boolean esNumero = tecla == 8 || tecla >= 48 && tecla <= 57;
            boolean esBackspace = caracter == 8;
            boolean campoCantidadEstaVacio = false;
            
            // Configurar valor de campo vacio
            if (esBackspace) {
                campoCantidadEstaVacio = vista.getCantidadAños().length() == 0;   
            }
            // Verificacion de tecla presionada
            if(!esNumero)
                evt.consume();
            if(!campoCantidadEstaVacio){
                recargarTodo();
            }   
            try{
                String datoViejo = vista.getCantidadAños();
                String datoNuevo = datoViejo + caracter;
                cantidadAños = Integer.parseInt(datoNuevo);
            } catch(NumberFormatException e){
            }
            
            recargarTodo();
        }

        @Override
        public void keyPressed(KeyEvent evt) {
            boolean flechaPresionada = evt.getExtendedKeyCode()== KeyEvent.VK_LEFT;
            
            if(flechaPresionada){
                evt.consume();
            }
        }

        @Override
        public void keyReleased(KeyEvent evt) { 
        }
    };
    
    KeyListener keyguardVenta = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent evt) { 
            
            int tecla = evt.getKeyChar();
            char caracter = evt.getKeyChar();
            int punto = 46;
            boolean esNumero = tecla == punto || tecla == 8 || tecla >= 48 && tecla <= 57;
            boolean esBackspace = caracter == 8;
            boolean campoCantidadEstaVacio = false;
            
            // Configurar valor de campo vacio
            if (esBackspace) {
                campoCantidadEstaVacio = vista.getCantidadAños().length() == 0;   
            }
            // Verificacion de tecla presionada
            if(!esNumero)
                evt.consume();
        }

        @Override
        public void keyPressed(KeyEvent evt) {
        }

        @Override
        public void keyReleased(KeyEvent evt) { 
        }
    };
}
