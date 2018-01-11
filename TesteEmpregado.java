import javax.swing.*;
public class TesteEmpregado{
   public static void main(String[] args){
      PessoaFisica pf1 = new PessoaFisica ("José","Silva","123-456-789-01");
      Empregado empregado = new Empregado ("José","Silva","123-456-789-01");
      Desempregado dpg = new Desempregado ("José","Silva","123-456-789-01", 1552.10);
      JOptionPane.showMessageDialog(null, dpg.toString() + );
      
      
      
   }

}