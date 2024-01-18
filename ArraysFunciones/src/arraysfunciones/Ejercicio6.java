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
		
	sc.close();
	}
	
	public static int[] suma(int t[], int numElementos) {

		int sumaTotal[] = new int[t.length - numElementos + 1];

		int suma;
		
		for (int i = 0; i < sumaTotal.length; i++) {
			suma = 0;
	       
	        for (int j = 0; j < numElementos; j++) {
	            suma += t[i + j];
	        }
	        sumaTotal[i] = suma;
	    }
		
		return sumaTotal;
	}
}
