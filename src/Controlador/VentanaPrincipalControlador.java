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

import Vista.*;
import Modelo.*;

public class VentanaPrincipalControlador {
    protected VentanaPrincipalModelo modelo = new VentanaPrincipalModelo();
    protected VentanaPrincipalVista vista = new VentanaPrincipalVista();
    
    public VentanaPrincipalControlador(VentanaPrincipalModelo modelo, VentanaPrincipalVista vista){
        this.vista = vista;
        this.modelo = modelo;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
    }

}
