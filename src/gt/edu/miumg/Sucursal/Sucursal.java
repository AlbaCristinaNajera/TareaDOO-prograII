package gt.edu.miumg.Sucursal;

import gt.edu.miumg.Cafe.Cafe;
import gt.edu.miumg.Ingrediente.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public abstract class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados;
    private List<Ingrediente> ingredientes;
    private List<Equipo> equipos;
    private List<Cafe> especialidades;


    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    public void addEspecialidad(Cafe cafe) {
        especialidades.add(cafe);
    }

    public List<Cafe> getEspecialidades() {
        return especialidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void setEspecialidades(List<Cafe> especialidades) {
        this.especialidades = especialidades;
    }

    public abstract void agregarEmpleado();

    public abstract void agregarIngrediente();

    public abstract void agregarEquipo();

    public abstract void agregarEspecialidad();
}
