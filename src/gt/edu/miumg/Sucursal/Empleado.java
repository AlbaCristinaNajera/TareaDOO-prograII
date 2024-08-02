package gt.edu.miumg.Sucursal;

public class Empleado {
    private static String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void trabajar(){
        System.out.println(nombre + "Está trabajando");

    }

    public void tomarOrden(){
        System.out.println(nombre + "está tomando la orden...");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        Empleado.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
