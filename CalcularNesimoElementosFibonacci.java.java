package facu;

/*22)Elaborar um programa, em linguagem Java, para calcular o N-�simo elemento da
s�rie de Fibonacci. O �ndice desse elemento dever� ser digitado para a realiza��o do
c�lculo. Criar um m�todo que calcula o resultado da s�rie, utilizando-se da
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
		// neste ponto vc pode alterar para at� quantos numeros vc quiser que ele fa�a o
		// fibonacci
		for (int i = 0; i < 31; i++) {
			System.out.print("(" + i + "):" + Calcular_N_esimo_Elementos_Fibonacci.fibo(i) + "\t");
		}
	}
}
