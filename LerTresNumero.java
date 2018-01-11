/*4) Ler três números e escrevê-los em ordem crescente (suponha números diferentes).*/ 
import javax.swing.*;
public class LerTresNumero { 
   public static void main (String [] args){ 
    
      String sValor1 = JOptionPane.showInputDialog ("Digite o primeiro valor");
      String sValor2 = JOptionPane.showInputDialog ("Digite o segundo valor");
      String sValor3 = JOptionPane.showInputDialog ("Digite o terceiro valor");
   
      double v1 = Double.parseDouble (sValor1);
      double v2 = Double.parseDouble (sValor2);
      double v3 = Double.parseDouble (sValor3);
   
      if (v1 > v2){
         if (v1 > v3) {
            if (v2 >v3) {
               JOptionPane.showMessageDialog (null,""+v3+" , "+v2+" , "+v1);
            }
            else {
               JOptionPane.showMessageDialog (null,""+v2+" , "+v3+" , "+v1);
            }
         } 
      }
          
      if (v2 > v1){
         if (v2 > v3) {
            if (v1 >v3){
               JOptionPane.showMessageDialog (null,"  "+v3+"  "+v1+"  "+v2);
            }
            else {
            
               JOptionPane.showMessageDialog (null,""+v1+" , "+v3+" , "+v2);
            }
         }  
      }
      if (v3 > v1){
         if (v3 > v2) {
            if (v3 >v1){
               JOptionPane.showMessageDialog (null,"  "+v1+"  "+v2+"  "+v3);
            }
            else {
            
               JOptionPane.showMessageDialog (null,""+v2+" , "+v1+" , "+v3);
            }
         }  
      }
              
     
        
     
      
      
   }
}
          


