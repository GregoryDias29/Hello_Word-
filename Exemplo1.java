/*
 * Dados dois numeros dizer se ambos sao positivos,
 * ambos sao negativos, ambos sao nulos ou nenhuma
 * das anteriores
 */
public class Exemplo1{
   public static void main(String[] args){
      int x = 0;
      int y = 1;
      
      //se x maior que zero e y maior que zero ambos sao positivos
      if (x > 0 && y > 0){
         System.out.println("Ambos positivos");
      } else if (x < 0 && y < 0){
         System.out.println("Ambos negativos");
      } else if (x == 0 && y == 0){
         System.out.println("Ambos nulos");
      } else {
         System.out.println("Tem sinais diferentes");
      }
   
   }
}