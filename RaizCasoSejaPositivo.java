/*3) Entrar com um número e imprimir a raiz quadrada do 
número caso ele seja positivo e o quadrado do número caso seja negativo*/

import javax.swing.*;
public class RaizCasoSejaPositivo {
   public static void main (String [] args){
   
   String sRaiz1 = JOptionPane.showInputDialog ("Digite o  valor: ");
   
   double Raiz = Math.sqrt (Double.parseDouble(sRaiz1));
   double Quadrado = Math.pow (Double.parseDouble(sRaiz1), 2);
   
   
      if (Raiz >= 0) {
   JOptionPane.showMessageDialog (null,"O resultado da raiz é: "+ Raiz);
      }
      else {
   JOptionPane.showMessageDialog (null,"O resultado do Quadrado é: "+ Quadrado);
      }
   
   }
}