public class Teste1{
   public static void main(String[] args)
   {  
      int x = -5;
      if(x > 0){
         int y = x;
         do{
            System.out.println(y);
            y--;
         } while(y>5);
      } else {
         int y = x;
         do{
            System.out.println(y);
            y++;
         }while(y<5);
      }
   }
}