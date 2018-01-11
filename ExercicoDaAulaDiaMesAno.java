import javax.swing.JOptionPane;
public class ExercicoDaAulaDiaMesAno {
 public static void main (String [] args){
 
 String dia = JOptionPane.showInputDialog ("Digite a data");
 String mes = JOptionPane.showInputDialog ("Digite o mes");
 String ano = JOptionPane.showInputDialog ("digite o ano");  
 
 JOptionPane.showMessageDialog( null, "dia  "+dia+" / mes " +mes+" / ano  " +ano);
 
 }
}