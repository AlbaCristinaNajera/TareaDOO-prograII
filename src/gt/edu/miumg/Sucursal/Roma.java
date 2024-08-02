package gt.edu.miumg.Sucursal;

import gt.edu.miumg.Cafe.Cafe;
import gt.edu.miumg.Cafe.CafeColombiano;
import gt.edu.miumg.Cafe.EspressoItaliano;
import gt.edu.miumg.Ingrediente.Agua;
import gt.edu.miumg.Ingrediente.Azucar;
import gt.edu.miumg.Ingrediente.Granos;
import gt.edu.miumg.Ingrediente.Leche;

import java.util.Scanner;

public class Roma extends Sucursal{
    public Roma(String nombre, String direccion) {
        super(nombre, direccion);
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void agregarEmpleado() {
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el puesto del empleado:");
        String puesto = scanner.nextLine();
        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        Empleado empleado = new Empleado(nombre, puesto, salario);
        // Añadir el empleado a la lista
        this.getEmpleados().add(empleado);

    }


    @Override
    public void agregarIngrediente() {
        System.out.println("Ingrese el tipo de ingrediente (agua, azucar, granos, leche):");
        String tipo = scanner.nextLine();
        System.out.println("Ingrese la cantidad:");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (tipo.toLowerCase()) {
            case "agua":
                Agua agua = new Agua(cantidad);
                this.getIngredientes().add(agua);
                break;
            case "azucar":
                System.out.println("Ingrese el nombre del azúcar:");
                String nombreAzucar = scanner.nextLine();
                Azucar azucar = new Azucar(nombreAzucar, cantidad);
                this.getIngredientes().add(azucar);
                break;
            case "granos":
                System.out.println("Ingrese el tipo de granos:");
                String tipoGranos = scanner.nextLine();
                Granos granos = new Granos(tipoGranos, cantidad);
                this.getIngredientes().add(granos);
                break;
            case "leche":
                System.out.println("Ingrese el tipo de leche:");
                String tipoLeche = scanner.nextLine();
                Leche leche = new Leche(tipoLeche, cantidad);
                this.getIngredientes().add(leche);
                break;
            default:
                System.out.println("Tipo de ingrediente no reconocido.");

        }   }

    @Override
    public void agregarEquipo() {
        System.out.println("Ingrese el tipo de equipo:");
        String tipo = scanner.nextLine();
        System.out.println("Ingrese el estado del equipo:");
        String estado = scanner.nextLine();
        Equipo equipo = new Equipo(tipo, estado);
        this.getEquipos().add(equipo);
    }

    @Override
    public void agregarEspecialidad() {
        System.out.println("Ingrese el nombre del café:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el tamaño del café:");
        String tamano = scanner.nextLine();
        System.out.println("Ingrese el precio del café:");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.println("Ingrese el tipo de café (Colombiano, Espresso):");
        String tipoCafe = scanner.nextLine();

        System.out.println("Ingrese el tipo de grano:");
        String tipoGrano = scanner.nextLine();

        System.out.println("Ingrese el tipo de leche:");
        String tipoLeche = scanner.nextLine();

        System.out.println("Ingrese el nombre del azúcar:");
        String nombreAzucar = scanner.nextLine();

        Agua agua = new Agua(500); // Ejemplo de cantidad, ajustar según necesidades
        Granos granos = new Granos(tipoGrano, 100); // Ejemplo de cantidad
        Leche leche = new Leche(tipoLeche, 200); // Ejemplo de cantidad
        Azucar azucar = new Azucar(nombreAzucar, 50); // Ejemplo de cantidad

        Cafe cafe;
        if (tipoCafe.equalsIgnoreCase("Colombiano")) {
            cafe = new CafeColombiano(nombre, tamano, precio, granos, agua, leche, azucar, tipoGrano);
        } else if (tipoCafe.equalsIgnoreCase("Espresso")) {
            System.out.println("Ingrese la intensidad del espresso:");
            String intensidad = scanner.nextLine();
            cafe = new EspressoItaliano(nombre, tamano, precio, granos, agua, leche, azucar, intensidad);
        } else {
            System.out.println("Tipo de café no reconocido.");
            return;
        }

        this.addEspecialidad(cafe);

    }

}
