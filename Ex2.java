//2)Escrever um algoritmo que l� tr�s n�meros reais (a, b e c), e os escreve em ordem crescente.

import javax.swing.*;
public class Ex2{ 
   public static void main (String [] args){
   
      String a = JOptionPane.showInputDialog ("Digite o primeiro n�mero real:");
      String b = JOptionPane.showInputDialog ("Digite o segundo n�mero real:");
      String c = JOptionPane.showInputDialog ("Digite o terceiro n�mero real:");
   
      double vA = Double.parseDouble (a);
      double vB = Double.parseDouble (b);
      double vC = Double.parseDouble (c);
   
      if (vA > vB){
         if(vA > vC){
            if(vB > vC){
               JOptionPane.showMessageDialog (null,"O valor de C: " + vC + " � menor que o valor B: " + vB + " que � menor que o valor de A: " + vA);
            }
            else{
               JOptionPane.showMessageDialog (null,"O valor de B: " + vB + " � menor que o valor C: " + vC + " que � menor que o valor de A: " + vA);
            }
         }
      }
      if(vB > vA){
         if(vB > vC){
            if(vA > vC){
               JOptionPane.showMessageDialog (null, "O valor C: " + vC + " � menor que o valor A: " + vA + " que � menor que o valor de B: " + vB);
            }
            else{
               JOptionPane.showMessageDialog (null, "O valor A: " + vA + " � menor que o valor C: " + vC + " que � menor que o valor de B: " + vB);
            }
         }
       }
         if(vC > vA){
            if(vC > vB){
               if(vC > vA){
                  JOptionPane.showMessageDialog(null, "O valor A:" + vA + " � menor que o valor B: " + vB + " que � menor que o valor de C: " + vC); 
               }
               else{
                  JOptionPane.showMessageDialog(null, "O valor B:" + vB + " � menor que o valor A: " + vA + " que � menor que o valor de C: " + vC);
               }
            }
         }
         if(vA > vB){
            if(vB < vC){
               if(vA < vC){
                  JOptionPane.showMessageDialog(null, "O valor de B: " + vB + " � menor que o valor C: " + vA + " que � maior que o valor de A: " + vC);
               }
            }
         }
   }
}
