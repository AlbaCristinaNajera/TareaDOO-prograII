import java.util.Arrays;
import java.util.Scanner;

import gt.edu.miumg.Cafe.CafeColombiano;
import gt.edu.miumg.Cafe.EspressoItaliano;
import gt.edu.miumg.Ingrediente.Agua;
import gt.edu.miumg.Ingrediente.Azucar;
import gt.edu.miumg.Ingrediente.Granos;
import gt.edu.miumg.Ingrediente.Leche;
import gt.edu.miumg.Sucursal.Bogota;
import gt.edu.miumg.Sucursal.Roma;
import gt.edu.miumg.Sucursal.Sucursal;

public class ParacticaCafeteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // instancias de las sucursales
        Roma roma = new Roma("Sucursal Roma", "Calle 123, Roma");
        Bogota bogota = new Bogota("Sucursal Bogota", "Avenida 245, Bogotá");

        //Instancias de Ingredintes
        Granos granosColombianos = new Granos("Colombiano", 1000);
        Agua agua = new Agua(2000);
        Leche leche = new Leche("Entera", 500);
        Azucar azucar = new Azucar("Azúcar", 300);

        // Instancias de especialidades
        CafeColombiano cafeColombiano = new CafeColombiano("Capuccino Colombiano", "Grande", 3.50, granosColombianos, agua, leche, azucar, "Arabica");
        EspressoItaliano espressoItaliano = new EspressoItaliano("Latte Italiano", "Pequeño", 2.50, granosColombianos, agua, leche, azucar, "Alta");


        while (true) {
            System.out.println("**** BIENVENIDO A SUCURSAL DE CAFETERIA VIRTUAL ****");
            System.out.println("A continuación aparecen las sucursales existentes, ingresa el numero de la poción que deseas hacer funcionar: ");
            System.out.println("1. Roma");
            System.out.println("2. Bogotá");
            System.out.println("3. Salir");
            System.out.print("Seleccione la sucursal: ");

            int sucursalOpcion = scanner.nextInt();
            scanner.nextLine();

            if (sucursalOpcion == 3) {
                System.out.println("VUELVA PRONTO, Saliendo...");
                break;
            }

            Sucursal sucursal = null;
            switch (sucursalOpcion) {
                case 1:
                    sucursal = roma;
                    break;
                case 2:
                    sucursal = bogota;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
            }

            while (true) {

                System.out.println("\n1. Agregar empleado");
                System.out.println("2. Agregar ingrediente");
                System.out.println("3. Agregar equipo");
                System.out.println("4. Agregar especialidad");
                System.out.println("5. Volver a seleccionar sucursal");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción para la " + sucursal.getNombre() + ":");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                switch (opcion) {
                    case 1:
                        sucursal.agregarEmpleado();
                        System.out.println("Empleado agregado exitosamente a " + sucursal.getNombre());
                        break;
                    case 2:
                        sucursal.agregarIngrediente();
                        System.out.println("Ingrediente agregado exitosamente a " + sucursal.getNombre());
                        break;
                    case 3:
                        sucursal.agregarEquipo();
                        System.out.println("Equipo agregado exitosamente a " + sucursal.getNombre());
                        break;
                    case 4:
                        sucursal.agregarEspecialidad();
                        System.out.println("Especialidad agregada exitosamente a " + sucursal.getNombre());
                        break;
                    case 5:
                        // Salir del menú actual para seleccionar una nueva sucursal
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }

                if (opcion == 5) {
                    break;
                }
            }
        }

        scanner.close();
    }
}
