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

    public Landscape(boolean estadoTierra, boolean estadoIsla) {

        this.estadoTierra = estadoTierra;
        this.estadoIsla = estadoIsla;

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

    @Override
    public String toString() {

        /*if (estadoTierra) {
            return "Tierra";
        } else if (estadoIsla) {
            return "Isla";
        } else {
            return "Agua";
        }*/
        if (estadoIsla) {
            return "I";
        } else if (estadoTierra) {
            return "X";
        } else {
            return "A";
        }

    }

}
