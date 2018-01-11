import javax.swing.JOptionPane;
public class LoopFor
{
   public static void main(String[] args)
   {  
      int n = Integer.parseInt(JOptionPane.showInputDialog(
      "Tabuada de que numero,filho?"));
      
      for(int i = 0; i <= n*10; i+=n){
         System.out.println(i);
      }
   }
}