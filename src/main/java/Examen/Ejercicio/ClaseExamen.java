package Examen.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {
	public static List<Integer> primos (int n)throws Exception{
		//Creo la lista que devolveré
		List <Integer> solucion = new ArrayList<Integer>();
		// Array de números impares
		int[] numeros ={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};
		//números negativos
		if (n<2) {
			throw new Exception("EntradaInvalida");
		}
		//número primo
		for (int i = 0; i<numeros.length;i++) {
			if(n==numeros[i]) {
				throw new Exception("EntradaInvalida");
			}
		 }
		//casos válidos

		for (int i = 0; i<numeros.length;i++) {
			if(n%numeros[i]==0) {
				solucion.add(numeros[i]);
				n = n/numeros[i];
				i=0;
			}
		 }
		
		return solucion;
	}

}
