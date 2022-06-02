package ejercicio1;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author ajbazan01
 */
public class CruceroPOJO {
    
    private String nombre;
    private String[] destinos;
    private double precio;
    private int numeroNoches;
    private String puertoSalida;
    private String buque;

    public CruceroPOJO(String nombre, String[] destinos, double precio, int numeroNoches, String puertoSalida, String buque) {
        this.nombre = nombre;
        this.destinos = destinos;
        this.precio = precio;
        this.numeroNoches = numeroNoches;
        this.puertoSalida = puertoSalida;
        this.buque = buque;
    }

    public CruceroPOJO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getDestinos() {
        return destinos;
    }

    public void setDestinos(String[] destinos) {
        this.destinos = destinos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public String getPuertoSalida() {
        return puertoSalida;
    }

    public void setPuertoSalida(String puertoSalida) {
        this.puertoSalida = puertoSalida;
    }

    public String getBuque() {
        return buque;
    }

    public void setBuque(String buque) {
        this.buque = buque;
    }

    @Override
    public String toString() {
        return "cruceroPOJO{" + "nombre=" + nombre + ", destinos=" + Arrays.toString(destinos) + ", precio=" + precio + ", numeroNoches=" + numeroNoches + ", puertoSalida=" + puertoSalida + ", buque=" + buque + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Arrays.deepHashCode(this.destinos);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 13 * hash + this.numeroNoches;
        hash = 13 * hash + Objects.hashCode(this.puertoSalida);
        hash = 13 * hash + Objects.hashCode(this.buque);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CruceroPOJO other = (CruceroPOJO) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.numeroNoches != other.numeroNoches) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.puertoSalida, other.puertoSalida)) {
            return false;
        }
        if (!Objects.equals(this.buque, other.buque)) {
            return false;
        }
        return Arrays.deepEquals(this.destinos, other.destinos);
    }
    
    
    
}
