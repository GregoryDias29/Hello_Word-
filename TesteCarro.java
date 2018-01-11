import javax.swing.*;
public class TesteCarro{
   //cadastrar um novo aluno no metodo main 
   public static void main (String [] args){
   //coletar os dados do Carro a ser cadastrado 
   String marca = JOptionPane.showInputDialog("Qual a marca do carro ?");
   int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual é o ano do carro?"));
   double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual é o peso do carro?"));
   char sexo = JOptionPane.showInputDialog ("Qula o sexo do comprador (M/F)?").charAt(0);
   
   
   Carro carro = new Carro (marca, ano, peso, sexo);
   
   String msg = "Marca: " + carro.getMarca() + "\n Ano: " + carro.getAno() + "\n Peso: " + carro.getPeso + "Sexo do comprador: ";
   
   JOptionPane.showMessageDialog (null, msg);
   
   
   
   
   
   }
}
/*import javax.swing.*;
 public class TesteTurma {
   public static void main (String [] args){
   String nome = JOptionPane.showInputDialog("Nome:");
   String curso = JOptionPane.showInputDialog("curso");
   int quantidadedeAlunos = Integer.parseInt(JOptionPane.showInputDialog ("Quantidade de Alunos"));
   int serie = Integer.parseInt(JOptionPane.showInputDialog("Série"));
   
   Turma turma = new Turma(nome, curso, quantidadedeAlunos, serie);
   
   String msg = "nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de alunos: " + turma.getQuantidadedeAlunos () + "\nSérie: " + turma.getSerie(); 
   
   JOptionPane.showMessageDialog(null,msg);
   
   quantidadedeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos: "));
   turma.setQuantidadedeAlunos(quantidadedeAlunos);
   
   msg = "nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de alunos: " + turma.getQuantidadedeAlunos () + "\nSérie: " + turma.getSerie();
   
   JOptionPane.showMessageDialog(null,msg);*/