import javax.swing.JOptionPane;
public class ExercicoDaAulaTresNomes {
  public static void main (String [] args) {
  
  String nome1 = JOptionPane.showInputDialog ("Digite o primeiro nome:");
  
  String nome2 = JOptionPane.showInputDialog ("Digite o segundo nome:");
  
  String nome3 = JOptionPane.showInputDialog ("Digite o terceiro nome:");
  
  JOptionPane.showMessageDialog (null, "Os nomes escritos foram: " +nome3+ " , "+nome2+" , "+nome1);
  
  }

}