import javax.swing.*;

class AtividadePratica15 {

	public static void main (String entrada[]){

	//declaração de variaveis
	int n1, n2, produto = 0;
	char op = 0;
	String msg = " ", msgEntr="Digite 1 para produto\nDigite 2 para produtoria\n";
	

	
	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

	
	switch(op){
	case '1':
	{
	  
	  if(n1>0 && n2>0){
		
	   produto = n1 * n2;	
	   msg = msg + "Produto de " + n1 + " por " + n2 + " = " + produto + "\n\n";

	}		
	break;	

	}
	
	case '2':
	{
   	  for(int i=1; i<=n2; i=i+1) {

		produto = produto * n1;
	
	}
	   msg = msg + "Produtoria de " + n1 + " ," + n2 + "vezes e: " + produto + "\n\n";
	   break;
	}
	
	default: JOptionPane.showMessageDialog(null, "Opção inválida, calculos não realizados");
      }

	if(op >= '1' && op <= '3'){

	    JOptionPane.showMessageDialog(null, msg);	
	}


	System.exit(0);
   }
}