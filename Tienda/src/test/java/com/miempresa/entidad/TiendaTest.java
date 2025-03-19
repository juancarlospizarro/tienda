package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TiendaTest {
	
	Tienda tienda;
	Producto p;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		tienda = new Tienda();
		p = new Producto("Pan", 5.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba para el metodo agregarProducto()")
	void testAgregarProducto() {
		int totalEsperado = 1;
		tienda.agregarProducto(p);
		
		assertEquals(tienda.obtenerProductos().size(), totalEsperado);
		
	}
	
	@Test
	@DisplayName("Prueba para el metodo obtenerProductos()")
	void testObtenerProductos() {
		tienda.agregarProducto(p);
		
		assertEquals("Pan", tienda.obtenerProductos().get(0).getNombre());
		assertEquals(5.0, tienda.obtenerProductos().get(0).getPrecio());
		
	}
	
	@Test
	@DisplayName("Prueba para el metodo calcularPrecioTotal()")
	void testCalcularPrecioTotal() {
		double totalEsperado = 5.0;
		tienda.agregarProducto(p);
		
		assertEquals(tienda.calcularPrecioTotal(), totalEsperado);
		
	}

}
