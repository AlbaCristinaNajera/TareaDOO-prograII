package gt.edu.miumg.Cafe;

import gt.edu.miumg.Ingrediente.Agua;
import gt.edu.miumg.Ingrediente.Azucar;
import gt.edu.miumg.Ingrediente.Granos;
import gt.edu.miumg.Ingrediente.Leche;

public abstract class Cafe {
    private String nombre;
    private String tamano;
    private double precio;
    private Agua agua;
    private Granos granos;
    private Leche leche;
    private Azucar azucar;


    public Cafe(String nombre, String tamano, double precio, Granos granos, Agua agua, Leche leche, Azucar azucar) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
        this.granos = granos;
        this.agua = agua;
        this.leche = leche;
        this.azucar = azucar;
    }

    public abstract void preparar();

    public abstract void servir();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Agua getAgua() {
        return agua;
    }

    public void setAgua(Agua agua) {
        this.agua = agua;
    }

    public Granos getGranos() {
        return granos;
    }

    public void setGranos(Granos granos) {
        this.granos = granos;
    }

    public Leche getLeche() {
        return leche;
    }

    public void setLeche(Leche leche) {
        this.leche = leche;
    }

    public Azucar getAzucar() {
        return azucar;
    }

    public void setAzucar(Azucar azucar) {
        this.azucar = azucar;
    }
}
