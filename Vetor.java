import javax.swing.*;
public class Vetor{
   public static void main (String [] args){
      // Abaixo irei declara um vetor de tipo String
      String[] semana = {"\nJaneiro \nFevereiro \nMar�o \nAbril \nMaio \nJunho \nJulho \nAgosto \nSetembro \nOutubro \nNovembro \nDezembro"}; // Sempre que declarar um vetor tem que ser colocado um abre e fecha colchetes.  
      // Para mostrar os valores deste vetor ser� feito um la�o de repeti��o do tipo for. 
      for(int i = 0; i< semana.length; i++){
         JOptionPane.showMessageDialog (null, "Em todos os anos tem: " + semana[i]);
      }
   }
}