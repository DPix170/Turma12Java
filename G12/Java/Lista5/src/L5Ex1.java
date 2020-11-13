import java.util.*;
public class L5Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto, 
		 * considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento. 
		 * Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento 
		 * escolhida e efetuar o c�lculo adequado.
			C�digo Condi��o de pagamento
			1 � vista em dinheiro ou cheque, recebe 20% de desconto
			2 � vista no cart�o de cr�dito, recebe 15% de desconto
			3 Em duas vezes, pre�o normal de etiqueta sem juros
			4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
		 */
		
		int preco;
		int pagamento;
		
		System.out.println("Digite o valor do produto: ");
		preco = leia.nextInt();
		
		System.out.println("Forma de pagamento: \n1 - Pagamento � vista em dinheiro ou cheque. \n2 - Pagamento � vista em cart�o de cr�dito. \n3 - Pagamento parcelado em 2x. \n4 - Pagamento parcelado em 3x.\n" );
		pagamento = leia.nextInt();
		
		if(pagamento == 1) {
			preco = preco - ((preco/100)*20);
		System.out.println("O pre�o do produto ser�: "+preco+"R$ com desconto de 20% devido a forma de pagamento.");
		}else if(pagamento == 2) {
			preco = preco - ((preco/100)*15);
		System.out.println("O pre�o do produto ser�: "+preco+"R$ com desconto de 15% devido a forma de pagamento.");
		}else if(pagamento == 3) {
		System.out.println("O pre�o do produto ser�: "+preco+"R$ em 2x sem juros!");
		}else if(pagamento ==4) {
			preco = preco + ((preco/100)*10);
		System.out.println("O pre�o do produto ser�: "+preco+"R$ em 3x com juros de 10%");
		}
	}

}
