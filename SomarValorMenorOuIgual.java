 /*2) Construir um algoritmo que leia dois n�meros e efetue a adi��o.
 Caso o valor somado seja menor ou igual a 20, este dever� ser apresentado subtraindo-se 5.*/ 
 
 import javax.swing.*;
 public class SomarValorMenorOuIgual {
   public static void main (String [] args){
   
   String sValor1 = JOptionPane.showInputDialog ("digite o primeiro  valor a ser somado: ");
   String sValor2 = JOptionPane.showInputDialog ("digite o segundo valor a ser somado: ");
   
   double Valor1 = Double.parseDouble (sValor1);
   double Valor2 = Double.parseDouble (sValor2);
   double resultado = Valor1 + Valor2;
   
   JOptionPane.showMessageDialog (null, "O resultado �: "+ resultado);
   
      if (resultado >= 20) {
   JOptionPane.showMessageDialog (null,"O resultado � menor ou igual a 20: " + (resultado-5)); 
      }
      else {
   JOptionPane.showMessageDialog (null,"O resultado � maior que 20: ");
      }
   }
 } 