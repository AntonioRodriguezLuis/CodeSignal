package arcade.codeSignal.intro;

public class ObtenerSiglo {

	public static void main(String[] args) {
		/*
		 * Enunciado: Dado un año, devuelve el siglo en el que se encuentra. El primer
		 * siglo abarca desde el año 1 hasta el año 100 inclusive, el segundo, desde el
		 * año 101 hasta el año 200 inclusive, etc.
		 */
		// Salida Esperada 20
		System.out.println(centuryFromYear(1905));
		// Salida Esperada 17
		System.out.println(centuryFromYear(1700));
		// Salida Esperada 20
		System.out.println(centuryFromYear(1988));
		// Salida Esperada 20
		System.out.println(centuryFromYear(2000));
		// Salida Esperada 21
		System.out.println(centuryFromYear(2001));
	}

	public static int centuryFromYear(int year) {
		int siglo = (int) year / 100;
		if (year % 100 != 0) {
			siglo += 1;
		}
		return siglo;
	}
}
