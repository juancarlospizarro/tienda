package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba para el metodo getPrecio()")
	void testGetPrecio() {
		double precioEsperado = 5.0;
		Producto producto = new Producto("Pan", 5.0);
		assertEquals(precioEsperado, producto.getPrecio());
	}
	
	@Test
	@DisplayName("Prueba para el metodo getNombre()")
	void testGetNombre() {
		String nombreEsperado = "Pan";
		Producto producto = new Producto("Pan", 5.0);
		assertEquals(nombreEsperado, producto.getNombre());
	}
	
	@Test
	@DisplayName("Prueba para el metodo setNombre()")
	void testSetNombre() {
		String nombreEsperado = "Maiz";
		Producto producto = new Producto("Pan", 5.0);
		producto.setNombre(nombreEsperado);
		assertEquals(nombreEsperado, producto.getNombre());
	}
	
	@Test
	@DisplayName("Prueba para el metodo setPrecio() en caso precio positivo")
	void testSetPrecioPositivo() {
		double precioEsperado = 10.0;
		Producto producto = new Producto("Pan", 5.0);
		producto.setPrecio(precioEsperado);
		assertEquals(precioEsperado, producto.getPrecio());
	}
	
	@Test
	@DisplayName("Prueba para el metodo setPrecio() en caso precio negativo")
	void testSetPrecioNegativo() {
		double precioIntroducido = -5.0;
		String mensajeEsperado = "El precio no puede ser negativo: " + precioIntroducido;
		Producto producto = new Producto("Pan", 5.0);
		producto.setPrecio(precioIntroducido);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> producto.setPrecio(precioIntroducido));
		
		assertEquals(mensajeEsperado, exception.getMessage());
	}

}
