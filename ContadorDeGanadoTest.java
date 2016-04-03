package ar.edu.unlam.tallerweb.clase1;

import org.junit.Test;
import org.junit.Assert;

public class ContadorDeGanadoTest {

	@Test
			public void TestQuePuedaContar()
			{
				ContadorDeGanado miContador = new ContadorDeGanado();
				Integer cantidadEsperada=1;
				miContador.contar();
				Integer cantidadObtenida=miContador.MostrarCantidad();
				
				Assert.assertEquals(cantidadEsperada,cantidadObtenida);
				
				miContador=null;
				
	
	
			}
	
	@Test
			public void TestQueDeCero()
			{
			ContadorDeGanado miContador = new ContadorDeGanado();
			
			Integer cantidadEsperada=0;
			
			Integer cantidadObtenida=miContador.MostrarCantidad();
			Assert.assertEquals(cantidadEsperada,cantidadObtenida);
			}
}
	