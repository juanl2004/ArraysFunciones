package arraysfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int t[] = { 2, 5, 7, 2, 10, 10, 7, 6, 5, 2 };

		int valor;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor que deseas encontrar --> ");
		valor = sc.nextInt();

		int[] resultado = Ejercicio5.buscarTodos(t, valor);

		System.out.println(Arrays.toString(resultado));

		sc.close();
	}

	public static int[] buscarTodos(int t[], int valor) {

		

		int posicion = 0;
		int contador = 0;
		
		for (int i = 0; i < t.length; i++) {

			if (t[i] == valor) {
				contador++;
			}
		}
		
		int indices[] = new int[contador];
		
		for (int j = 0; j < t.length; j++) {

			if (t[j] == valor) {
				indices[posicion++] = j;
			}
		}
		
		return indices;
	}

}
