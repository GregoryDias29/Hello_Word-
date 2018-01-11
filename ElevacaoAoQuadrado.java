/*Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o 
método double Math.pow(base, expoente), onde base e expoente são números reais.*/

import javax.swing.JOptionPane;
public class ElevacaoAoQuadrado {
   public static void main (String [] args) {
   
   String NumeroInteiro = JOptionPane.showInputDialog ("Digite um numero á ser elevado:");
   double a = Double.parseDouble (NumeroInteiro);
   double b = Math.pow (a,2); 
   
   JOptionPane.showMessageDialog (null,"o resultado do numero elevado é: "+b); 
   }
}
// quando se elevar um numero coloque a opeção Math.pow( a,2) no lugar do doiss pode ser qual quer numero, e não esquecer da virgula