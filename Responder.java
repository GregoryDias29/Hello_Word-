import javax.swing.*;
public class Responder  { 
   public static void main (String [] args){ 
    
      String sValor1 = JOptionPane.showInputDialog ("oi");
      String sValor2 = JOptionPane.showInputDialog ("");
      String sValor3 = JOptionPane.showInputDialog ("");
   
     
   
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
          


