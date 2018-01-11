//Crie um algoritmo que leia três strings por meio do JOptionPane e escreva a soma do comprimento destas strings.

import javax.swing.JOptionPane;
public class LerTresStrings{
   public static void main (String [] args){
   
   String s1 = JOptionPane.showInputDialog (null, "Digite o numero a ser somado da primeira String:");
   String s2 = JOptionPane.showInputDialog (null, "Digite o numero a ser somado da segunda String:");
   String s3 = JOptionPane.showInputDialog (null, "Digite o numero a ser somado da terceira String:");
   
   int soma = s1.length()+s2.length()+s3.length();
   
   JOptionPane.showMessageDialog (null, "A soma das Strings é: "+soma);
   }
}