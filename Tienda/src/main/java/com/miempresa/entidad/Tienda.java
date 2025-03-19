package com.miempresa.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Tienda representa una tienda que contiene una lista de productos.
 * Proporciona métodos para agregar productos, obtener la lista de productos
 * y calcular el precio total de todos los productos en la tienda.
 */
public class Tienda {
    private List<Producto> productos;

  
    /**
     * Constructor de la clase Tienda
     */
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    /**
     * Añade un producto a la tienda
     * 
     * @param p Producto par añadir a la tienda
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    /**
     * Devuelve la lista de productos que hay en la tienda
     * 
     * @return ArrayList Lista con los productos
     */
    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }

    /**
     * Devuelve el precio total de todos los productos
     * 
     * @return double Precio total
     */
    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}