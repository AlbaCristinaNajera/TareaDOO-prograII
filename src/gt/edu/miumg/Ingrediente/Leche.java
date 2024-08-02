package gt.edu.miumg.Ingrediente;

public class Leche implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Leche(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public void ObtenerNombre() {

    }

    @Override
    public void ObtenerCantidad() {

    }
}
