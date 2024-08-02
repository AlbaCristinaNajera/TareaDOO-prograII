package gt.edu.miumg.Cafe;

import gt.edu.miumg.Ingrediente.Agua;
import gt.edu.miumg.Ingrediente.Azucar;
import gt.edu.miumg.Ingrediente.Granos;
import gt.edu.miumg.Ingrediente.Leche;

public class CafeColombiano extends Cafe {
    private String tipoGrano;

    public String tipoGrano(){
        return tipoGrano;
    }

    public CafeColombiano(String nombre, String tamano, double precio, Granos granos, Agua agua, Leche leche, Azucar azucar, String tipoGrano) {
        super(nombre, tamano, precio, granos, agua, leche, azucar);
        this.tipoGrano = tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando café colombiano...");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo café colombiano...");

    }
}
