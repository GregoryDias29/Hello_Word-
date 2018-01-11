/*
 * dados tres numeros diferentes, dizer o valor do maior
 */
import javax.swing.JOptionPane;
public class Exemplo5{
   public static void main(String[] args){
      int x, y, z;
      
      //entrada de dados
      x = Integer.parseInt(JOptionPane.showInputDialog(
         "Digite x"));
      y = Integer.parseInt(JOptionPane.showInputDialog(
         "Digite y"));
      z = Integer.parseInt(JOptionPane.showInputDialog(
         "Digite z"));
      
      //validacao de dados
      if(x == y || x == z || y == z){
         System.out.println("Erro!\nOs números não são diferentes");
         System.exit(-1);
      }
      int maior;
      if (x > y && x > z){
         maior = x;
      } else if (y > x && y > z){
         maior = y;
      } else {
         maior = z;
      }
      
      System.out.println("O maior é "+maior);
      
      
   }
}