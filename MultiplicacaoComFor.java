import javax.swing.*;
public class MultiplicacaoComFor{
   public static void main (String [] args){
   String numero = JOptionPane.showInputDialog ("Digite um valor de 1 á 10");
   int n = Integer.parseInt (numero);
   String resultado = "" ;
      for ( int i = 0; i <= 10; i++){
      resultado = resultado + ( n + "X" + i + "=" + (n*i)+"\n");
      }
      JOptionPane.showMessageDialog (null,resultado);
   }
}