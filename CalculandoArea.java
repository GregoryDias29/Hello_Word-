//Crie um algoritmo para calcular a área de um retângulo, com base nas medidas de sua base e de sua altura.

import javax.swing.JOptionPane;
public class CalculandoArea {
   public static void main (String [] args) {
   
   String area = JOptionPane.showInputDialog ("Digite o valor da área a ser calculado:");
   String altura = JOptionPane.showInputDialog ("Digite o valor da altura a ser calculado:");
   double ar = Double.parseDouble (area);
   double al = Double.parseDouble (altura);
   double re = ar * al;
   
   JOptionPane.showMessageDialog (null, "As somoas entre "+ar+" e "+al+" é igual= "+re);
   }
}

// Double.parseDouble sempre que for fazer algo com numeros e o resultado esperado é um numero quebrado, usas  Double.parseDouble, tambem não esquecer de colocar o ponto entre o numeros pois virgula ele não aceita por não ser padrão universal 