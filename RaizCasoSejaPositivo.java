/*3) Entrar com um n�mero e imprimir a raiz quadrada do 
n�mero caso ele seja positivo e o quadrado do n�mero caso seja negativo*/

import javax.swing.*;
public class RaizCasoSejaPositivo {
   public static void main (String [] args){
   
   String sRaiz1 = JOptionPane.showInputDialog ("Digite o  valor: ");
   
   double Raiz = Math.sqrt (Double.parseDouble(sRaiz1));
   double Quadrado = Math.pow (Double.parseDouble(sRaiz1), 2);
   
   
      if (Raiz >= 0) {
   JOptionPane.showMessageDialog (null,"O resultado da raiz �: "+ Raiz);
      }
      else {
   JOptionPane.showMessageDialog (null,"O resultado do Quadrado �: "+ Quadrado);
      }
   
   }
}