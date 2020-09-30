package arcade.codeSignal.intro;

public class SumarNumeros {
	/*Enunciado
	Hacer una funcion que sume dos numeros*/
	public static void main(String[] args) {
		// Salida esperada 3
		System.out.println(add(1, 2));
		// Salida esperada 1000
		System.out.println(add(0, 1000));
		// Salida esperada -37
		System.out.println(add(2, -39));
		// Salida esperada 199
		System.out.println(add(99, 100));
	}

	public static int add(int param1, int param2) {
		return param1 + param2;
	}

}
