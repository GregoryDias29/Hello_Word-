package facu;

/*32) Elaborar um programa, em linguagem Java, capaz de carregar, em um vetor do tipo
int, 15 números digitados pelo operador, formando uma espécie de base de dados. Após
isto, o programa deverá solicitar a digitação de outro número, denominado número de
busca, o qual será localizado no vetor anterior. O programa deverá apresentar, em tela, o
resultado de uma busca linear, informando o índice do vetor no qual se encontra o
número de busca (utilizar o tamanho máximo do vetor como terminador da operação,
caso o número de busca não seja localizado). A busca linear deverá ser um método que
se utilize de passagem de parâmetros e o vetor não deverá ser variável global do
programa.*/

import javax.swing.*;

public class BuscaLinearLocalizandoVetorDigitadoPeloUsuario {
	public static void main(String[] args) {
		int[] vet = new int[15];
		int valorDesejado;

		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o indice [" + i + "]"));
		}
		valorDesejado = Integer.parseInt(JOptionPane.showInputDialog("Qual número você deseja procurar no vetor ?"));

		System.out.println(busca(vet, 0, valorDesejado));

	}

	private static int busca(int[] vetor, int indice, int valor) {
		if (indice >= vetor.length)
			return -1;
		else if (valor == vetor[indice])
			return indice;
		else
			return busca(vetor, ++indice, valor);
	}

}
