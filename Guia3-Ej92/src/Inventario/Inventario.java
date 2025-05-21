package Inventario;

import java.util.ArrayList;
import Producto.Producto;


public class Inventario {
    private ArrayList<Producto> productos;
    private double valorTotal; // los metodos que modifiquen precio o cantidad de un producto deben actualizar este valor

    public Inventario() {
        this.productos = new ArrayList<Producto>();
        this.valorTotal = 0;
    }


    public ArrayList<Producto> getProductos() {
        return this.productos;
    }
    public double getValorTotal() {
        return this.valorTotal;
    }


    public String agregarProducto(String nombre, double precio, int stock) {
        Producto producto = new Producto(nombre, precio, stock);
        this.productos.add(producto);
        this.valorTotal += producto.getPrecio() * producto.getStock();
        String mensaje = "Producto agregado exitosamente.";
        return mensaje;
    }

    public String actualizarStock(String nombre, int variacionStock) {
        for (Producto producto : this.productos) {
            if (producto.getNombre().equals(nombre)) {
                this.valorTotal += producto.getPrecio() * variacionStock;
                producto.setStock(producto.getStock() + variacionStock);
                String mensaje = "Stock actualizado exitosamente.";
                return mensaje;
            }
        }
        String mensaje = "Producto no encontrado.";
        return mensaje;
    }

    public ArrayList<Producto> getProductosAgotados() {
        ArrayList<Producto> productosAgotados = new ArrayList<Producto>();
        for (Producto producto : this.productos) {
            if (producto.getStock() == 0) {
                productosAgotados.add(producto);
            }
        }
        return productosAgotados;
    }

    public ArrayList<Producto> buscarProductoPorNombre(String nombre) {
        ArrayList<Producto> productosEncontrados = new ArrayList<Producto>();
        for (Producto producto : this.productos) {
            if (producto.getNombre().contains(nombre)) {
                productosEncontrados.add(producto);
            }
        }
        return productosEncontrados;
    }

}
