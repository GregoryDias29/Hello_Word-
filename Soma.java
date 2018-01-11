import javax.swing.JOptionPane;
public class Soma{
   public static void main (String [] args){
      //int x, y;
  
      int y;
      int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
      y = Integer.parseInt (JOptionPane.showInputDialog ("Digite o segundo valor"));
      int resultado = x + y;
      JOptionPane.showMessageDialog (null, "O resultado da soma entre " + x + " e " + y + " é: " + 
      																resultado);
   }
}