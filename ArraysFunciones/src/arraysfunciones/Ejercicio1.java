package arraysfunciones;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tabla[] = {4, 2, 8, 6, 10};

		int resultado = Ejercicio1.suma(tabla);
		
		System.out.println("Suma --> " + resultado);
	}

	public static int suma(int tabla[]) {

		int suma = 0;
		
		for (int numero : tabla) {
			suma += numero;
		}
		
		return suma;
	}
}