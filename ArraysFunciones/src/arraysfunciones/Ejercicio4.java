package arraysfunciones;

public class Ejercicio4 {

	public static void main(String[] args) {

		int[] t = {1, 3, 5, 7, 10, 15, 19};
		int clave = 19;
		
		int resultado = Ejercicio4.buscar(t, clave);
		
		if (resultado != -1) {
			System.out.println("La clave " + clave + " se encuentra en la posicion --> " + resultado);
		} else {
			System.out.println("La clave " + clave + " no se encuentra en la tabla");
		}
	}

	public static int buscar(int t[], int clave) {

		for (int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				return i;
			}
		}
		
		return -1;
		
	}

}
