package InterfazUsuario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Inventario.Inventario;
import Producto.Producto;


public class InterfazUsuario {

    private Scanner scanner;
    private Inventario inventario;

    public InterfazUsuario() {
        this.inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        this.scanner = scanner;
    }

    public void inicializar(){
        System.out.println("Bienvenido a la tienda");
        mostrarMenuPrincipal();
    }

    private String getInput() {
        String input = this.scanner.nextLine();
        System.out.println(input);
        return input;
    }
   
    private void mostrarMenuPrincipal() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Agregar producto");
        System.out.println("2. Ver productos");
        System.out.println("3. Actualizar stock de un producto");
        System.out.println("4. Calcular valor total del inventario");
        System.out.println("5. Mostrar productos agotados");
        System.out.println("6. Buscar producto por nombre");
        System.out.println("0. Salir");
        System.out.print("Ingrese el número de una opción: ");
        String opcion = getInput();
        switch (opcion) {
            case "1":
                agregarProducto();
                break;
            case "2":
                verProductos();
                break;
            case "3":
                actualizarStock();
                break;
            case "4":
                getValorTotal();
                break;
            case "5":
                mostrarProductosAgotados();
                break;
            case "6":
                buscarProductoPorNombre();
                break;
            case "0":
                System.out.println("Saliendo...");
                System.exit(0);
                break; // Necesario?
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                mostrarMenuPrincipal();
        }
    }

    private void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = getInput();
        System.out.print("Ingrese el precio del producto: ");
        double precio = 0;
        while (true) {
            try {
                precio = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Intente de nuevo.");
                scanner.next(); // Limpiar el buffer
            }
        }
        System.out.print("Ingrese la cantidad en stock: ");
        int stock = 0;
        while (true) {
            try {
                stock = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Intente de nuevo.");
                scanner.next(); // Limpiar el buffer
            }
        }
        String mensaje = inventario.agregarProducto(nombre, precio, stock);
        System.out.println("\n"+mensaje);
        mostrarMenuPrincipal();
    }

    private void verProductos() {
        System.out.println("Listado de Productos:");
        for (Producto producto : inventario.getProductos()) {
            System.out.println("Nombre: " + producto.getNombre() +
                                "\n    Precio: " + producto.getPrecio() +
                                "\n    Stock: " + producto.getStock());
        }
        mostrarMenuPrincipal();
    }

    private void actualizarStock() {
        System.out.print("\nIngrese el nombre del producto: ");
        String nombre = getInput();
        System.out.print("\nIngrese la variación de stock (negativa si se retiraron productos): ");
        int variacionStock = 0;
        while (true) {
            try {
                variacionStock = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nEntrada no válida. Intente de nuevo.");
                scanner.next(); // Limpiar el buffer
            }
        }
        String mensaje = inventario.actualizarStock(nombre, variacionStock);
        System.out.println("\n"+mensaje);
        mostrarMenuPrincipal();
    }

    private void getValorTotal() {
        double valorTotal = inventario.getValorTotal();
        System.out.println("\nEl valor total del inventario es: $ " + valorTotal);
        mostrarMenuPrincipal();
    }

    private void mostrarProductosAgotados() {
        System.out.println("\n Productos agotados:\n");
        for (Producto producto : inventario.getProductosAgotados()) {
            System.out.println("Nombre: " + producto.getNombre() +
                                "\n    Precio: " + producto.getPrecio());
        }
        mostrarMenuPrincipal();
    }
    
    private void buscarProductoPorNombre() {
        System.out.print("\n Ingrese el nombre del producto: ");
        String nombre = getInput();
        ArrayList<Producto> resultados = inventario.buscarProductoPorNombre(nombre);
        if (resultados.isEmpty()) {
            System.out.println("\n No se encontraron productos con ese nombre.");
        } else {
            System.out.println("Resultados de la búsqueda:");
            for (Producto producto : resultados) {
                System.out.println("Nombre: " + producto.getNombre() +
                                    "\n    Precio: " + producto.getPrecio() +
                                    "\n    Stock: " + producto.getStock());
            }
        }
        mostrarMenuPrincipal();

    }


}
