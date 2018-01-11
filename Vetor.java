import javax.swing.*;
public class Vetor{
   public static void main (String [] args){
      // Abaixo irei declara um vetor de tipo String
      String[] semana = {"\nJaneiro \nFevereiro \nMarço \nAbril \nMaio \nJunho \nJulho \nAgosto \nSetembro \nOutubro \nNovembro \nDezembro"}; // Sempre que declarar um vetor tem que ser colocado um abre e fecha colchetes.  
      // Para mostrar os valores deste vetor será feito um laço de repetição do tipo for. 
      for(int i = 0; i< semana.length; i++){
         JOptionPane.showMessageDialog (null, "Em todos os anos tem: " + semana[i]);
      }
   }
}