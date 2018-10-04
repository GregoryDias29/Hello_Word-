package facu;

/*32) Elaborar um programa, em linguagem Java, capaz de carregar, em um vetor do tipo
int, 15 n�meros digitados pelo operador, formando uma esp�cie de base de dados. Ap�s
isto, o programa dever� solicitar a digita��o de outro n�mero, denominado n�mero de
busca, o qual ser� localizado no vetor anterior. O programa dever� apresentar, em tela, o
resultado de uma busca linear, informando o �ndice do vetor no qual se encontra o
n�mero de busca (utilizar o tamanho m�ximo do vetor como terminador da opera��o,
caso o n�mero de busca n�o seja localizado). A busca linear dever� ser um m�todo que
se utilize de passagem de par�metros e o vetor n�o dever� ser vari�vel global do
programa.*/

import javax.swing.*;

public class BuscaLinearLocalizandoVetorDigitadoPeloUsuario {
	public static void main(String[] args) {
		int[] vet = new int[15];
		int valorDesejado;

		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para o indice [" + i + "]"));
		}
		valorDesejado = Integer.parseInt(JOptionPane.showInputDialog("Qual n�mero voc� deseja procurar no vetor ?"));

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
