package Modelo;

/**
 *    Fundamentos de programación orientada a eventos 750014C-01
 *    Profesor: Luis Romo Portilla 
 *
 *    Archivo:  Venta.java
 *    Licencia: GNU-GPL 
 *    @version  1.0
 *    
 *    @author   Alejandro Guerrero Cano           (202179652-3743) {@literal <"alejandro.cano@correounivalle.edu.co">}
 *    @author   Juan David Loaiza Santiago        (202177570-3743) {@literal <"juan.loaiza.santiago@correounivalle.edu.co">}
 * 
*/

public class Venta {
    int x;
    double y;
    int x2;
    double y2;
    double xy;

    public Venta(int x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void calcularTodo(){
        x2 = x*x;
        y2 = y*y;
        xy = x*y;
    }

    public int getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getXY() {
        return xy;
    }

    public void setX(int x) {
        this.x = x;
        calcularTodo();
    }

    public void setY(double y) {
        this.y = y;
        calcularTodo();
    }
}
