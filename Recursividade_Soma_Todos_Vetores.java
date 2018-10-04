package facu;

/* 
23) Utilizando recursividade, criar um programa, em linguagem Java, que calcule e
apresente a soma de todos os elementos de um vetor, inteiro, de tamanho 10, o qual
deverá ser preenchido, anteriormente ao cálculo, pelo operador;*/

public class Recursividade_Soma_Todos_Vetores {
	public static void main(String[] args) {
		int vetor[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("" + somaVetor(vetor, 0));
	}

	private static int somaVetor(int vet[], int p) {
		if (p == vet.length - 1) {
			return vet[p];
		} else {
		}
		return vet[p] + somaVetor(vet, p + 1);
	}
}
