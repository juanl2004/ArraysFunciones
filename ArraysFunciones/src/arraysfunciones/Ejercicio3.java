package arraysfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) { 
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la longitud de la tabla --> ");
		int longitud = sc.nextInt();
		
		int[] lista = new int[longitud];
		
		System.out.print("Introduce el valor hasta donde generar números --> ");
		int fin = sc.nextInt();
		
		System.out.println(Arrays.toString(Ejercicio3.rellenaPares(longitud, fin)));
	
		sc.close();
	}
	

	public static int[] rellenaPares(int longitud, int fin) {

		int[] j = new int[longitud];

		for (int i = 0; i < j.length; i++) {

			j[i] = (int) (Math.random() * (fin - 2) + 2);

			while (j[i] % 2 != 0) {
				j[i] = (int) (Math.random() * (fin - 1) + 2);
			}

		}

		return j;
	
	}

}
