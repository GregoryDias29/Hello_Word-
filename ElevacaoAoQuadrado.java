/*Crie um algoritmo que leia um n�mero inteiro e o eleve ao quadrado usando o 
m�todo double Math.pow(base, expoente), onde base e expoente s�o n�meros reais.*/

import javax.swing.JOptionPane;
public class ElevacaoAoQuadrado {
   public static void main (String [] args) {
   
   String NumeroInteiro = JOptionPane.showInputDialog ("Digite um numero � ser elevado:");
   double a = Double.parseDouble (NumeroInteiro);
   double b = Math.pow (a,2); 
   
   JOptionPane.showMessageDialog (null,"o resultado do numero elevado �: "+b); 
   }
}
// quando se elevar um numero coloque a ope��o Math.pow( a,2) no lugar do doiss pode ser qual quer numero, e n�o esquecer da virgula