package facu;

/*21) Elaborar um programa, em linguagem Java, para calcular o fatorial de um número a
ser digitado. Criar um método para cálculo do mesmo utilizando recursividade;*/

public class CalculoFatorialRecursivo {

	public static void main(String[] args) {
		System.out.println(fatorial(3));
	}

	// 3
	private static int fatorial(int n) {
		// 3
		if (n <= 1) {
			return 1;
		} else {
			// 3
			return n * fatorial(n - 1);
		}

	}
}
// o numero 3 percorre este caminho 
