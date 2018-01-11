import javax.swing.JOptionPane;
public class TresPalavras{
   public static void main (String [] args){
   
   String a = JOptionPane.showInputDialog ("Escreva a primeira coisa que vier na sua mente");
   String b = JOptionPane.showInputDialog ("Escreva a segunda coisa que vier na sua mente");
   String c = JOptionPane.showInputDialog ("Escreva a terceira coisa que vier a sua mente");
   
   JOptionPane.showMessageDialog (null," a terceira coisa escrita foi: "+c+", a segunda coisa escrita foi: "+b+", a primeira coisa escrita foi: "+a);
 
   }
 
}