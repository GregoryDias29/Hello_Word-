import javax.swing.JOptionPane;
public class DezCaracteres {
 public static void main (String [] args){
  String enter = JOptionPane.showInputDialog ("Á seguir digitaremos 10 caracteres, para iniciar por favor precione OK.");
  String dez = JOptionPane.showInputDialog ("Digite o primeiro caractere:");
  String nove = JOptionPane.showInputDialog ("Digite o segundo caractere:");
  String oito = JOptionPane.showInputDialog ("Digite o terceiro caractere:");
  String sete = JOptionPane.showInputDialog ("Digite o quarto caractere:");
  String seis = JOptionPane.showInputDialog ("Digite o quinto caractere:");
  String cinco = JOptionPane.showInputDialog ("Digite o sexto caractere:");
  String quatro = JOptionPane.showInputDialog ("Digite o setimo caractere:");
  String tres = JOptionPane.showInputDialog ("Digite o oitavo caractere:");
  String dois = JOptionPane.showInputDialog ("Digite o nono caractere:");
  String um = JOptionPane.showInputDialog ("Digite o decimo caractere:");
  
  JOptionPane.showMessageDialog (null, "  "+enter+" , "+dez+" , "+nove+" , "+oito+" , "+sete+" , "+seis+" , "+cinco+" , "+quatro+" , "+tres+" , "+dois+" , "+um+".");
 }

}