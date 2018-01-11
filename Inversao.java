import javax.swing.JOptionPane;
public class Inversao{
	
	public static void main (String [] args){

		String palavra = JOptionPane.showInputDialog ("Digite uma palavra");
		String metade1, metade2;
		

		metade1 = palavra.substring(0, palavra.length() / 2);
		metade2 = palavra.substring (palavra.length() / 2, palavra.length());
		String resultado = metade2 + metade1;


		JOptionPane.showMessageDialog (null, "Invertida: " + resultado);




	}
}