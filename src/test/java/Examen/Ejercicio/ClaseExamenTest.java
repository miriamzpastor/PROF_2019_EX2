package Examen.Ejercicio;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

public class ClaseExamenTest {
	
	public ClaseExamen prueba = new ClaseExamen();
	
	@Test(expected = RuntimeException.class)
	public void negativo() throws Exception{
		int ejemplo = -1;
		prueba.primos(ejemplo);
	}
	
	@Test(expected = RuntimeException.class)
	public void primotrece() throws Exception{
		int ejemplo = 13;
		prueba.primos(ejemplo);
	}
	
	@Test(expected = RuntimeException.class)
	public void validoseis() throws Exception{
		int ejemplo = 6;
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(3);
		Assert.assertEquals(lista, prueba.primos(ejemplo));
	}
	
	@Test(expected = RuntimeException.class)
	public void validodoscinco() throws Exception{
		int ejemplo = 25;
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		Assert.assertEquals(lista, prueba.primos(ejemplo));
	}
	
}
