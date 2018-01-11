import javax.swing.JOptionPane;

public class Divisao{
    public static void main (String []args){
	
   String numero1 = JOptionPane.showInputDialog ("Digite o primeiro número:");
   String numero2 = JOptionPane.showInputDialog ("Digite o segundo número:");
   
   int a = Integer.parseInt (numero1); 
   int b = Integer.parseInt (numero2);
   int c = a / b;
   
   int d = Integer.parseInt (numero1);
   int e = Integer.parseInt (numero2);
   int f = d % e;
   
   JOptionPane.showMessageDialog ( null, "O resultado da divisão é: "+c+"\n A porcetagem da divisão é: "+f);
   
   }
}
   
   
   
   
		/*
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro nÃºmero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo nÃºmero"));

		int resultado = numero1 / numero2;
		int resto = numero1 % numero2;

		JOptionPane.showMessageDialog (null, "Q: " + resultado + "\n R: " + resto);

    }
}
*/