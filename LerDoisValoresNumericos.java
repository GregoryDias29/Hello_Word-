// 1) Construir um algoritmo que leia dois valores num�ricos 
//inteiros e efetue a adi��o; caso o resultado seja maior que 10, apresent�-lo.

import javax.swing.*;
public class LerDoisValoresNumericos{
   public static void main (String [] args ) {
   String svalor1 = JOptionPane.showInputDialog ("Digite o seu primeiro valor a ser somado ");
   String svalor2 = JOptionPane.showInputDialog ("Digite o o segundo valor a ser somado ");
   
   int valor1 = Integer.parseInt (svalor1);
   int valor2 = Integer.parseInt (svalor2);
   
   int resultado = valor1+valor2;
   
   JOptionPane.showMessageDialog (null, "Os valores �: "+resultado);
   
   if (resultado > 10){
   JOptionPane.showMessageDialog (null, "O resultado � maior que 10.");
   }
   else{
   JOptionPane.showMessageDialog (null,  "valor menor");
   }
      }
}



