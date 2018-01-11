import javax.swing.JOptionPane;

/*ler uma palavra digitada pelo usuario e extrair
 *um pedaco desta palavra; o usuario digita o inicio
 *e o fim do pedaco desejado*/
 
public class PosicaoInicialPosicaoFinalMaisTamanho {
   public static void main(String[] args) {
   
      String palavra = JOptionPane.showInputDialog("Digite a palavra");
         
      String pInicio = JOptionPane.showInputDialog("Digite a posicao inicial");
         
      String pFinal = JOptionPane.showInputDialog("Digite a posicao final");
         
      int ini = Integer.parseInt(pInicio);
      
      int fim = Integer.parseInt(pFinal);
      
      String saida = palavra.substring(ini,fim);
      
      JOptionPane.showMessageDialog(null,saida);
      
      JOptionPane.showMessageDialog(null,"Tamanho = "+saida.length());

      
      
   }
}