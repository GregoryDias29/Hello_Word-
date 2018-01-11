public class Conjugacao{
   public static void main(String[] args){
      String verbo = "identificar";
      
      int inicio = verbo.length()-2;
      int fim = verbo.length();
      
      String duasUltimas = verbo.substring(inicio, fim);
      
      if(duasUltimas.equals("ar")){
          System.out.println("1a conjugacao");
      }
   }
}