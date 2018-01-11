import javax.swing.JOptionPane;
public class CanetaMain
{
   public static void main(String[] args){
      //leitura dos dados
      String sTipo = JOptionPane.showInputDialog(
      "Tipo da Caneta");
      String sCor = JOptionPane.showInputDialog("Cor da Caneta");
      //instanciacao do objeto caneta   
      Caneta caneta = new Caneta(sTipo, sCor);
      
      //saida dos dados da caneta
      String saida = "Caneta "+caneta.getTipo()+" " + caneta.getCor();
        
      JOptionPane.showMessageDialog(null, saida);
      
      //trocando a cor
      caneta.setCor("Azul");
      
      //nova saida dos dados da caneta
      saida = "Caneta "+caneta.getTipo()+" " + caneta.getCor();
        
      JOptionPane.showMessageDialog(null, saida);
   }
}