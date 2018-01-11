public class DuasMensagensSystem{
   public static void main(String[] args){
      String mensagem = "Bom ";
      int x = 10;
      double y = 45.3;
      
      mensagem = mensagem + "dia";
      System.out.println(mensagem);
      mensagem = mensagem + x;
      System.out.println(mensagem);
      mensagem = mensagem + (x + 1);
      System.out.println(mensagem);
   }
}