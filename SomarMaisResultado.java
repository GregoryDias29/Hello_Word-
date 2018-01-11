import javax.swing.JOptionPane;
public class SomarMaisResultado {
   public static void main(String[] args){
      String valorA = JOptionPane.showInputDialog("Digite o valor de a:");
      String valorB = JOptionPane.showInputDialog("Digite o valor de b:");
      int a = Integer.parseInt(valorA);
      int b = Integer.parseInt(valorB);
      int c = a + b;
 
      JOptionPane.showMessageDialog(null,"A soma é "+c);
   
   }

}