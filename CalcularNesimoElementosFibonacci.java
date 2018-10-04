package facu;

/*22)Elaborar um programa, em linguagem Java, para calcular o N-ésimo elemento da
série de Fibonacci. O índice desse elemento deverá ser digitado para a realização do
cálculo. Criar um método que calcula o resultado da série, utilizando-se da
recursividade.*/

public class CalcularNesimoElementosFibonacci {
	static long fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static void main(String[] args) {
		// neste ponto vc pode alterar para até quantos numeros vc quiser que ele faça o
		// fibonacci
		for (int i = 0; i < 31; i++) {
			System.out.print("(" + i + "):" + Calcular_N_esimo_Elementos_Fibonacci.fibo(i) + "\t");
		}
	}
}
