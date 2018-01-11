import javax.swing.JOptionPane;
public class Raiz{
	public static void main (String []args){
		int number1;
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque um numero:"));
		double resultado;
		resultado = Math.sqrt(number1);
		JOptionPane.showMessageDialog (null, "O resultado é: " + resultado);


	}
}
