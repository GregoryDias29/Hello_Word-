/*a) Escrever, em linguagem Java, a classe Pagamento, cujos atributos únicos são
nomeDoPagador (String), cpf (String) e valorASerPago (double). Escrever, nesta
classe, métodos construtores, métodos de acesso e métodos modificadores para os
atributos.*/

public class Pagamento {
   private String nomeDoPagador;
   private String cpf;
   private double valorASerPago;

   public Pagamento (String ndp, String c, double vasp){
      nomeDoPagador = ndp;
      cpf = c;
      valorASerPago = vasp;
   }
   
   public String getNomeDoPagador(){
      return nomeDoPagador;
   }
   
   public String getCpf(){
      return cpf;
   }
   
   public double getValorASerPago(){
      return valorASerPago;
   }
   
   public void setNomeDoPagador(String ndp){
      nomeDoPagador = ndp;
   }
   
   public void setCpf (String c){
      cpf = c;
   }
   
   public void setValorASerPago (double vasp){
      valorASerPago = vasp;
   }

   public String toString(){
	   return "Nome do Pagador: " + nomeDoPagador + "\nCPF: " + cpf + "\nValor a ser pago: " + valorASerPago;
   }
}