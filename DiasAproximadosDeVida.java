 //Crie um algoritmo para calcular o n�mero de dias aproximado que voc� viveu, com base em sua idade.
 
 import javax.swing.JOptionPane;
 public class DiasAproximadosDeVida{
   public static void main (String [] args){
   
   String data = JOptionPane.showInputDialog (" Digite sua idade:");
   
   double D = Integer.parseInt (data);
   double R = D * 365;
   
   JOptionPane.showMessageDialog (null, "O resultado de dias vividos at� agora �: "+R); 
   
   }
 }
