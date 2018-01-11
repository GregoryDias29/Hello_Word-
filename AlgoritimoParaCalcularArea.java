import javax.swing.JOptionPane;
public class AlgoritimoParaCalcularArea {
   public static void main(String[] args){
      String valorA = JOptionPane.showInputDialog("Digite o valor da area ");
      String Valorb = JOptionPane.showInputDialog("Digite o valor da altura");
      double a = Double.parseDouble(valorA);
     
      double b = Double.parseDouble(Valorb);
      
      double c = a*b;
      
 
      JOptionPane.showMessageDialog(null,"O calculo entre "+a+ " e "+b+ " �: "+c);
   
   }

}
