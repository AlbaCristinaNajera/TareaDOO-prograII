package gt.edu.miumg.Sucursal;

public class Equipo {
    private static String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender(){
        System.out.println("Ecendiendo el equipo " + tipo + "...");

    }

    public void apagar(){
        System.out.println("Apagando el equipo" + tipo + "...");

    }

    public static void reparar(){
        System.out.println("Reparando el equipo...");

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        Equipo.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
