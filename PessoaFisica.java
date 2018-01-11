public class PessoaFisica {
   private String nome;
   private String sobrenome;
   private String cpf;
   
   public PessoaFisica () {
   
   }
   public PessoaFisica (String n , String sn , String cp){
      nome = n ;
      sobrenome = sn;
      cpf = cp;   
   }
   public String getNome (){
      return nome;
   }
   public String getSobrenome (){
      return sobrenome;
   }
   public String getCpf (){
      return cpf;
   }
   public void setNome (String n ){
      nome = n;
          
   }
   public void setSobrenome (String sn){
      sobrenome = sn;
   }
   public void setCpf (String cp){
      cpf = cp;
   }
   
   public String toString (){
      return String.format ("Nome: %s \n Sobrenome: %s \n Cpf: %s \n" , nome, sobrenome , cpf);
   }
         
}
