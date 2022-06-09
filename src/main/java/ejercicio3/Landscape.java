/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author ajbazan01
 */
public class Landscape {

    private boolean estadoIsla;
    private boolean estadoTierra;
    private int ejeX;
    private int ejeY;

    public Landscape(boolean estadoTierra, boolean estadoIsla, int ejeX, int ejeY) {

        this.estadoTierra = estadoTierra;
        this.estadoIsla = estadoIsla;
        this.ejeX = ejeX;
        this.ejeY = ejeY;

    }

    public boolean isEstadoIsla() {
        return estadoIsla;
    }

    public void setEstadoIsla(boolean estadoIsla) {
        this.estadoIsla = estadoIsla;
    }

    public boolean isEstadoTierra() {
        return estadoTierra;
    }

    public void setEstadoTierra(boolean estadoTierra) {
        this.estadoTierra = estadoTierra;
    }

    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }
    
    

    @Override
    public String toString() {

        if (estadoIsla) {
            return "I{" + ejeX + " - " + ejeY + "}";
        } else if (estadoTierra) {
            return "X{" + ejeX + " - " + ejeY + "}";
        } else {
            return "A{" + ejeX + " - " + ejeY + "}";
        }

    }

}
