/*
 * Dados dois numeros dizer se sao positivos,
 * negativos ou nulos
 */
public class Exemplo3{
   public static void main(String[] args){
      int x = 0;
      int y = -1;
      
      //se x maior que zero e y maior que zero ambos sao positivos
      if (x > 0 && y > 0){
         System.out.println("ambos positivos");
      } else if (x > 0 && y == 0){
         System.out.println("x positivo e y nulo");
      } else if (x > 0 && y < 0){
         System.out.println("x positivo e y negativo");
      } else if (x == 0 && y > 0){
         System.out.println("x nulo e y positivo");
      } else if (x == 0 && y == 0){
         System.out.println("ambos nulos");
      } else if (x == 0 && y < 0){
         System.out.println("x nulo e y negativo");
      } else if (x < 0 && y > 0){
         System.out.println("x negativo e y positivo");
      } else if (x < 0 && y == 0){
         System.out.println("x negativo e y nulo");
      } else if (x < 0 && y < 0){
         System.out.println("ambos negativos");
      }

   
   }
}