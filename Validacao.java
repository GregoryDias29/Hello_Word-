import javax.swing.JOptionPane;
public class Validacao
{
   public static void main(String[] args)
   {  
      int n;
      do{
         n = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite um numero maior que zero"));
         if(n <= 0){
            JOptionPane.showMessageDialog(null,
               "E maior que zero, filho!");
         }
      }while(n <= 0);
   }
}