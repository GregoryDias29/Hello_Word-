public class Pagamento {
   private String nomeDoPagador;
   private String cpf;
   private double valorAserPago ;
   
   public Pagamento (String ndp, String cp , double vpg){
      nomeDoPagador = ndp;
      String cpf = cp;
      double valorAserPago = vpg;
   }
   public String getNomeDopagador () {
      return nomeDoPagador;
   } 
   public String getCpf (){
      return cpf;
   }
   public double getValorAserPago(){
      return valorAserPago;
   }
   public void setNomeDoPagador (String ndp){
      nomeDoPagador = ndp;
   }
   public void setCpf (String cp){
      cpf = cp;
   }
   public void setValorAserPago (double vpg){
   valorAserPago = vpg;
   }
}