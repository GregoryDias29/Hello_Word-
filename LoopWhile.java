import javax.swing.JOptionPane;
public class LoopWhile
{
   public static void main(String[] args)
   {  
      int n = Integer.parseInt(JOptionPane.showInputDialog(
      "Tabuada de que numero,filho?"));
      
      int i = 0;
      while(i <= n*10){
         System.out.println(i);
         i+=n;
      }
   }
}