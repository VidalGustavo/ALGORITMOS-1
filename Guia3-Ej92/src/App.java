import java.util.ArrayList;

import InterfazUsuario.InterfazUsuario;
import Inventario.Inventario;
import Producto.Producto;


// Diseñar un sistema de inventario simplificado para un negocio. El negocio vende
// productos que tienen un nombre, un precio y una cantidad en stock. Implementar las
// siguientes funcionalidades:
// a) Agregar productos al inventario.
// b) Actualizar la cantidad en stock de un producto después de una venta.
// c) Calcular el valor total del inventario.
// d) Mostrar una lista de productos agotados (con cantidad en stock igual a cero).
// e) Permitir la búsqueda de productos por nombre y mostrar su información
// detallada.
// f) Permitir la búsqueda de productos por nombre parcial y mostrar su información
// detallada.
public class App {
    public static void main(String[] args) throws Exception {

        InterfazUsuario interfaz = new InterfazUsuario();        
        interfaz.inicializar();

        // ESTO ES TESTEO SIN LA INTERFAZ:
        // Se espera que imprima lo siguiente:
            // valor Total Actual: 11000.0
            // valor Total Actual: 1000.0
            // Producto agotado: Laptop
            // Producto encontrado: Laptop, Precio: 1000.0, Stock: 0
            // Producto encontrado por nombre parcial: Laptop, Precio: 1000.0, Stock: 0

        // Inventario inventario = new Inventario();

        // inventario.agregarProducto("Laptop", 1000.0, 10);
        // inventario.agregarProducto("Mouse", 20.0, 50);

        // System.out.println("valor Total Actual: " + inventario.getValorTotal());

        // inventario.actualizarStock("Laptop", -10);
        // System.out.println("valor Total Actual: " + inventario.getValorTotal());

        // ArrayList<Producto> agotados = inventario.getProductosAgotados();
        // for (Producto producto : agotados) {
        //     System.out.println("Producto agotado: " + producto.getNombre());
        // }

        // ArrayList<Producto> encontrados = inventario.buscarProductoPorNombre("Laptop");
        // for (Producto producto : encontrados) {
        //     System.out.println("Producto encontrado: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Stock: " + producto.getStock());
        // }

        // ArrayList<Producto> encontradosParciales = inventario.buscarProductoPorNombre("Lap");
        // for (Producto producto : encontradosParciales) {
        //     System.out.println("Producto encontrado por nombre parcial: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Stock: " + producto.getStock());
        // }
    }
}
