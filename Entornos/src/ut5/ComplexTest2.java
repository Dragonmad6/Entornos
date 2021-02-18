package ut5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest2 {
	
	/*
	Formula = a() + c()
	Formula = b() + d() 
	*/
	@Test
	void testSumar() {
		Complex numero1 = new Complex(20, 100);
		Complex numero2 = new Complex(40, 50);
		
		//Resultados de las operaciones
		Complex n_obtenido = numero1.sumar(numero2);
		Complex n_esperado = new Complex (60, 150);
		//Comprueba el resultado
			assertEquals(n_obtenido, n_esperado); 
	}
	/*
	Formula = a() - c()
	Formula = b() - d() 
	*/
	@Test
	void testRestar() {
		Complex numero1 = new Complex(10, 80);
		Complex numero2 = new Complex(20, 30);
		
		//Resultados de las operaciones
		Complex n_obtenido = numero1.restar(numero2);
		Complex n_esperado = new Complex (-10, 50);
		//Comprueba el resultado
			assertEquals(n_obtenido, n_esperado);
	}
	/*
	Formula = a() - c()
	Formula = b() - d() 
	*/
	@Test
	void testRestar2() {
		Complex numero1 = new Complex(0, 100);
		Complex numero2 = new Complex(5, 0);
		
		//Resultados de las operaciones
		Complex n_obtenido = numero1.restar(numero2);
		Complex n_esperado = new Complex (-5, 100);
		//Comprueba el resultado
			assertEquals(n_obtenido, n_esperado);
	}
	/*
	Formula = a() - c()
	Formula = b() - d() 
	*/
	@Test
	void testRestar3() {
		Complex numero1 = new Complex(-10, -15);
		Complex numero2 = new Complex(-7, -30);
		
		//Resultados de las operaciones
		Complex n_obtenido = numero1.restar(numero2);
		Complex n_esperado = new Complex (-3, 15);
		//Comprueba el resultado
			assertEquals(n_obtenido, n_esperado);
	}
	@Test
	void testMultiplicarComplex() {
		Complex numero1 = new Complex(6, 4);
		Complex numero2 = new Complex(10, 3);
		
		//Resultados de las operaciones
		Complex n_obtenido = numero1.multiplicar(numero2);
		Complex n_esperado = new Complex (48, 58);
		//Comprueba el resultado
			assertEquals(n_obtenido, n_esperado);
	}

	@Test
	void testMultiplicarDouble() {
		
		Complex numero1 = new Complex(7, 10);
		
		//Resultados de las operaciones
		Complex n_obtenido = numero1.multiplicar(9.5);
		Complex n_esperado = new Complex (66.5, 95);
		//Comprueba el resultado
			assertEquals(n_obtenido, n_esperado);
	}
	/*
	Formula = ((a*c + b*d) / (c^2 + d^2) 
	Formula = (b*c – a*d) / (c^2 + d^2))
	*/
	@Test
	void testDividir1() {
		
		Complex numero1 = new Complex(6, 10);
		Complex numero2 = new Complex(4, 7);
		
		double primero = (double)(6*4 + 10*7)/(double)(4*4 + 7*7);
		double segundo = (double)(10*4 - 6*7)/(double)(4*4 + 7*7);
		
		//Resultados de las operaciones
		Complex n_obtenido = numero1.dividir(numero2);
		Complex n_esperado = new Complex (primero, segundo);
		//Comprueba el resultado
			assertEquals(n_obtenido, n_esperado);
	}
	/*
	Formula = ((a*c + b*d) / (c^2 + d^2) 
	Formula = (b*c – a*d) / (c^2 + d^2))
	*/
	@Test
	void testDividir2() {
		
		Complex numero1 = new Complex(86, 0); //8-10
		Complex numero2 = new Complex(0, 15); //2-5
		
		double primero = (double)(86*0 + 0*15)/(double)(0*0 + 15*15);
		double segundo = (double)(0*0 - 86*15)/(double)(0*0 + 15*15);
		
		//Resultados de las operaciones
		Complex n_obtenido = numero1.dividir(numero2);
		Complex n_esperado = new Complex (primero, segundo);
		//Comprueba el resultado
			assertEquals(n_obtenido, n_esperado);
	}
	/*
	Formula = ((a*c + b*d) / (c^2 + d^2) 
	Formula = (b*c – a*d) / (c^2 + d^2))
	*/
	@Test
	void testDividir3() {
				
		Complex numero1 = new Complex(26, -2); //8-10
		Complex numero2 = new Complex(-6, 23); //2-5
		
		double primero = (double)(26*-6 + -2*23)/(double)(-6*-6 + 23*23);
		double segundo = (double)(-2*-6 - 26*23)/(double)(-6*-6 + 23*23);
		
		//Resultados de las operaciones
		Complex n_obtenido = numero1.dividir(numero2);
		Complex n_esperado = new Complex (primero, segundo);
		//Comprueba el resultado
			assertEquals(n_obtenido, n_esperado);
	}
	

	@Test
	void testEqualsObject() {
		
		Complex numero1 = new Complex(6, 9);
		Complex numero2 = new Complex(6, 9);
		//Comprueba el resultado
			assertTrue(numero1.equals(numero2));
	}
	
	@Test
	void testEqualsObject2() {
		
		Complex numero1 = new Complex(6, 9);
		Complex numero3 = new Complex(2.9, 5.8);
		//Comprueba el resultado
			assertFalse(numero1.equals(numero3));
	}
	
}

