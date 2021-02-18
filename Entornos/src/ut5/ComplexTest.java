package ut5;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {


	@Test
	void testSumar() {
		Complex numero1 = new Complex(55, 100);
		Complex numero2 = new Complex(80, 20);
		
		Complex resultado = numero1.sumar(numero2);
		Complex resultado2 = new Complex (135, 120);
			assertEquals(resultado, resultado2); 
	}

	@Test
	void testRestar() {
		Complex numero1 = new Complex(55, 100);
		Complex numero2 = new Complex(80, 20);
		
		Complex resultado = numero1.restar(numero2);
		Complex resultado2 = new Complex (-25, 80);
			assertEquals(resultado, resultado2);
	}

	@Test
	void testMultiplicarComplex() {
		Complex numero1 = new Complex(5, 10);
		Complex numero2 = new Complex(8, 2);
		
		Complex resultado = numero1.multiplicar(numero2);
		Complex resultado2 = new Complex (20, 90);
			assertEquals(resultado, resultado2);
	}

	@Test
	void testMultiplicarDouble() {
		Complex numero1 = new Complex(5, 10);
		
		Complex resultado = numero1.multiplicar(7.5);
		Complex resultado2 = new Complex (37.5, 75);
			assertEquals(resultado, resultado2);
	}

	@Test
	void testDividir() {
		Complex numero1 = new Complex(8, 10);
		Complex numero2 = new Complex(5, 2);
		
		Complex resultado = numero1.dividir(numero2);
		Complex resultado2 = new Complex (2.068, 1.172);
			assertEquals(resultado, resultado2);
	}

	@Test
	void testEqualsObject() {
		
		Complex numero1 = new Complex(5, 8);
		Complex numero2 = new Complex(5, 8);
		Complex numero3 = new Complex(3.5, 6.7);
				
		 if (numero1.equals(numero3)) {
	            System.out.println(numero1 + " es el mismo que " + numero3);
	        }else{
	            System.out.println(numero1 + " no es el mismo que " + numero3);
	        }
	}
}
