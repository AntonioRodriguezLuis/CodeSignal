package arcade.codeSignal.intro;

public class CheckPalindrome {

	public static void main(String[] args) {
		/*
		 * Enunciado: Comprobar si es palindromo o no.
		 */

		// Salida esperada TRUE
		System.out.println(checkPalindrome("aabaa"));
		// Salida esperada FALSE
		System.out.println(checkPalindrome("abac"));
		// Salida esperada TRUE
		System.out.println(checkPalindrome("a"));
		// Salida esperada FALSE
		System.out.println(checkPalindrome("az"));

	}

	public static boolean checkPalindrome(String inputString) {
		boolean esPalindromo = true;
		int j = (int) inputString.length() / 2;
		for (int i = 0; i < j; i++) {
			if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
				esPalindromo = false;
			}
		}
		return esPalindromo;
	}

}
