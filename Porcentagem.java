import javax.swing.*;
public class Porcentagem{
   public static void main (String [] args){
      double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para saber sua porcentagem: "));
      double r = n*10/100;
      JOptionPane.showMessageDialog(null,r);
   }
}