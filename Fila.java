package exercicio;


public class Fila {
	public static int tamanho = 6;
	public static int vetor[] = new int[tamanho];
	public static int inserePos = 0;
	public static int retiraPos = 0;
	public static boolean isCheia = false;

	public static void tamanho() {
		int retorno = buscaTamanho();
		System.out.println("Tamanho do vetor: " + retorno);
	}
	
	public static int buscaTamanho() {
		if (inserePos >= retiraPos && !isCheia) {
			return inserePos - retiraPos;
		} else {
			return inserePos + vetor.length - retiraPos;
		}
	}

	public static int frente() {
		System.out.println("Frente da Fila: " + vetor[retiraPos]);
		return vetor[retiraPos];
	}

	public static boolean estaCheia() {
		if (inserePos == retiraPos && isCheia) {
			return true;
		} else {
			return false;
		}
	}

	public static void insere(int n) {
		if (estaCheia()) {
			System.out.println("A fila está cheia retire antes de inserir mais");
		} else {
			vetor[inserePos] = n;
			inserePos++;
			if (inserePos >= vetor.length) {
				inserePos = 0;
			}
			if (inserePos == retiraPos) {
				isCheia = true;
			}
			System.out.println("Valor sendo inserido (" + n + ")");
		}
	}

	public static int retira() {
		int indice = retiraPos;
		retiraPos++;
		if (retiraPos >= vetor.length) {
			retiraPos = 0;
		}
		isCheia = false;
		System.out.println("Valor sendo retirado (" + vetor[indice] + ")");
		return vetor[indice];
	}

	public static void imprime() {
		String aux = "";
		int count = 0;
		int inicio = retiraPos;
		while(count < buscaTamanho()) {
			if(inicio == vetor.length) {
				inicio = 0;
			}
			
			aux += vetor[inicio] + ", ";
			inicio++;
			count++;
		}
		
		
		System.out.println(aux);
	}
}
