import javax.swing.JOptionPane;
public class Usuario {
	
	public static void main (String[] args){
		String nome = JOptionPane.showInputDialog ("Digite o nome:");
		String p1 = nome.substring (0,3);
		String p2 = nome.substring (nome.length() - 3,nome.length());

		JOptionPane.showMessageDialog(null, p1 + p2);
	}

}