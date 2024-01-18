package arraysfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int t[] = { 10, 1, 5, 8, 9, 2 };
		int numElementos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce en cuanto quieres que se agrupen los numeros a sumar --> ");
		numElementos = sc.nextInt();
		
		int[] resultado = Ejercicio6.suma(t, numElementos);
	
	System.out.println(Arrays.toString(resultado));
	}

	public static int[] suma(int t[], int numElementos) {

		int sumaTotal[] = new int[t.length - numElementos + 1];

		
		
		for (int i = 0; i < sumaTotal.length; i++) {
		
			for (int j = 0; i <= t.length; i++) {
				 
			}
		}
		
		return sumaTotal;
	}
}
