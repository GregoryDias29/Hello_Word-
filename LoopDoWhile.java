import javax.swing.JOptionPane;
public class LoopDoWhile
{
   public static void main(String[] args)
   {  
      int n = Integer.parseInt(JOptionPane.showInputDialog(
      "Tabuada de que numero,filho?"));
      
      int i = 0;
      do{
         System.out.println(i);
         i+=n;
      }while(i <= n*10);
   }
}