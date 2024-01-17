package arraysfunciones;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {

		int resultado[] = Ejercicio3.rellenaPares(20, 100);

		for (int numero : resultado) {
			System.out.println(numero);
		}
	}

	public static int[] rellenaPares(int longitud, int fin) {
		
		longitud = 0;
		fin = 0;
		
		int[] rellenaPares = new int[longitud];

		int aleatorio;

		for (int i = 0; i <= rellenaPares.length; i++) {

			aleatorio = 2 + (int) (Math.random() * (fin - 2 + 1));

			rellenaPares[i] = aleatorio;
		}

		return rellenaPares;
	}

}
