package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Main;
import main.Triangulo;

class tesTriangulo {

	@Test
	void testTrianguloCaso1() {
		Triangulo t1=new Triangulo(2, 3, 4);
		assertEquals(true, t1.esTriangulo());
	}
	@Test
	void testTrianguloCaso2() {
		Triangulo t1=new Triangulo(1, 2, 3);
		assertEquals(false, t1.esTriangulo());
	}
	@Test
	void testTrianguloCaso3() {
		Triangulo t1=new Triangulo(1, 2, 4);
		assertEquals(false, t1.esTriangulo());
	}
	@Test
	void testTrianguloCaso4() {
		Triangulo t1=new Triangulo(2, 2, 1);
		assertEquals(true, t1.esTriangulo());
	}
	@Test
	void testTrianguloCaso5() {
		Triangulo t1=new Triangulo(9, 5, 5);
		assertEquals(true, t1.esTriangulo());
	}
	@Test
	void testTrianguloCaso6() {
		Triangulo t1=new Triangulo(1, 2, 1);
		assertEquals(false, t1.esTriangulo());
	}
	@Test
	void testTrianguloCaso7() {
		Triangulo t1=new Triangulo(3, 1, 1);
		assertEquals(false, t1.esTriangulo());
	}
	@Test
	void testTrianguloCaso8() {
		Triangulo t1=new Triangulo(2, 2, 0);
		assertEquals(false, t1.esTriangulo());
	}
	@Test
	void testTrianguloCaso9() {
		Triangulo t1=new Triangulo(1, 1, 1);
		assertEquals(true, t1.esTriangulo());
	}
	@Test
	void testTrianguloCaso10() {
		Triangulo t1=new Triangulo(0, 0, 0);
		assertEquals(false, t1.esTriangulo());
	}
	
	//Probando metod TipoTriangulo
	@Test
	void testTipoTrianguloEquilatero() {
		Triangulo t1=new Triangulo(1, 1, 1);
		assertEquals("Equilatero", t1.tipoTriangulo());
	}
	
	@Test
	void testTipoTrianguloIsoceles() {
		Triangulo t1=new Triangulo(2, 2, 1);
		assertEquals("Isósceles", t1.tipoTriangulo());
	}
	
	@Test
	void testTipoTrianguloEscaleno() {
		Triangulo t1=new Triangulo(2, 3, 4);
		assertEquals("Escaleno", t1.tipoTriangulo());
	}
	
	@Test
	void testmain() {
		Main m1=new Main();
		Main.main(null);
	}
}
 
