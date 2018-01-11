import javax.swing.JOptionPane; 
public class ContasComMaisDeDoisValores{
   public static void main (String [] args){
   
   String sera = JOptionPane.showInputDialog ("Digite o primeiro valor:");
   String branquelo = JOptionPane.showInputDialog ("Digite o segundo valor:");
   String nego = JOptionPane.showInputDialog ("Digite o terceiro valor:");
   int a = Integer.parseInt (sera);
   int b = Integer.parseInt (branquelo); 
   int z = Integer.parseInt (nego);
   int c = a - b / z ;
   
   JOptionPane.showMessageDialog (null, "E o resultado é: "+c);
   
   }
}   