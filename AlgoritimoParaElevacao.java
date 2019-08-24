import javax.swing.JOptionPane;
public class AlgoritimoParaElevacao {
   public static void main(String[] args){
      String n = JOptionPane.showInputDialog("Digite o valor á ser elevado 2 ");
     
     double valor = Double.parseDouble (n);   
     double b = Math.pow(valor,2);
     
      
 
      JOptionPane.showMessageDialog(null,"o valor é "+b);
      }
}
