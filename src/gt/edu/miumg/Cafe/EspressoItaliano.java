package gt.edu.miumg.Cafe;

import gt.edu.miumg.Ingrediente.Agua;
import gt.edu.miumg.Ingrediente.Azucar;
import gt.edu.miumg.Ingrediente.Granos;
import gt.edu.miumg.Ingrediente.Leche;

public class EspressoItaliano extends Cafe {
    private String intensidad;

    public String getIntensidad() {
        return intensidad;
    }

    public EspressoItaliano(String nombre, String tamano, double precio, Granos granos, Agua agua, Leche leche, Azucar azucar, String intensidad) {
        super(nombre, tamano, precio, granos, agua, leche, azucar);
        this.intensidad = intensidad;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Expresso Italiano...");

    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Expresso Italiano");

    }
}
