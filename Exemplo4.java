/*
 * Dados dois numeros dizer se sao positivos,
 * negativos ou nulos
 */
public class Exemplo4{
   public static void main(String[] args){
      int x = 0;
      int y = -1;
      
      if (x > 0){
         if(y > 0){
            System.out.println("ambos positivos");
         } else if (y == 0){
            System.out.println("x positivo e y nulo");
         } else {
            System.out.println("x positivo e y negativo");
         }
      } else if (x == 0) {
         if (y > 0){
            System.out.println("x nulo e y positivo");
         } else if (y == 0){
            System.out.println("ambos nulos");
         } else {
            System.out.println("x nulo e y negativo");
         }
      } else {
         if (y > 0){
            System.out.println("x negativo e y positivo");
         } else if (y == 0){
            System.out.println("x negativo e y nulo");
         } else {
            System.out.println("ambos negativos");
         }
      }

   
   }
}