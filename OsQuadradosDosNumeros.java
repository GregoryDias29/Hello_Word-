//os quadrados dos números inteiros de 1 a 20.

import javax.swing.*;
public class OsQuadradosDosNumeros{
 public static void main (String [] args){
 
 String a = JOptionPane.showInputDialog(" Digite um numero de 1 a 20:");
 String resultado = null;
 int valor = Integer.parseInt(a);
 for (int i = 1; i <= 20; i++)
   {
   resultado = resultado + (valor + "x"+ i + "="+(valor*i) );
   }
   JOptionPane.showMessageDialog (null,valor);
 
  
 
 }

} 
