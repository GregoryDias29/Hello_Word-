import javax.swing.*;
public class MessagenNumeroInvalido{
   public static void main(String[] args){
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro")); 
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo"));     
      int num3 = Integer.parseInt(JOptionPane.showInputDialog("Terceiro")); 
      
      if(num1 == num2 || num1 == num3 || num2 == num3){
         System.out.println("Numeros invalidos");
         System.exit(-1);
      }
      
      if(num1 < num2 && num2 < num3){
         System.out.println(num1 + " " + num2 + " "+num3);
      } else if (num1 < num3 && num3 < num2){
         System.out.println(num1 + " " + num3 + " "+num2);
         
   
                
   }
}
}