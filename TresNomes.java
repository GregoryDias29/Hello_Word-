import javax.swing.JOptionPane;
public class TresNomes {
 public static void main (String [] args) { 
  
  String nome3 = JOptionPane.showInputDialog ("digite um nome: ");
  
  String nome2 = JOptionPane.showInputDialog ("digite o nome de seu doce favorito: ");
  
  String nome1 = JOptionPane.showInputDialog ("digite o nome do carro de seus sonhos: ");
  
  JOptionPane.showMessageDialog(null, " "+nome3+" , "+nome2+" , "+nome1); 
  
/* nesta opcão de programa, vocé ira digitar 3 nomes, e eles apareceram na tela ao final das 3 perguntas. Você pode alterar a ordem 
deixano o ultimo como primeiro e assim etc, se quiser aumentar o numero de perguntas pode ser feito tambem*/ 

   }
}  

