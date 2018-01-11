import javax.swing.JOptionPane;
public class DiasDeVida {
     public static void main(String [] args){
     
     String Idade = JOptionPane.showInputDialog("Digite sua idade:");
     
     int idade= Integer.parseInt(Idade);
     int Dias = idade * 365;
     
     JOptionPane.showMessageDialog (null, "Sua idade em dias é: "+Dias);
   }
}