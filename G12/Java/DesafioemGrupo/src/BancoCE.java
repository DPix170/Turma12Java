import java.util.Scanner;
public class BancoCE {

	public static void main(String[] args) {
String contas[]= {"Conta Poupan�a","Conta Corrente","Conta Especial","Conta Empresarial"};
		
		int conta;
		double NumConta=0;
		double CNPJ=0;
		int indice=0;
		Scanner leia = new Scanner(System.in);
		String nome;
		double emprestimo = 10000 ;
		char confirmacao ;
		char confirmacaoC = 'S' ;
		double valorEmp;
		double saldo = 0;
		int opcao;
		int operacao [] = new int [10] ;
		int indic = 0;
		int opera;
		double valOpera;
		double valOperaC;
	      System.out.println("\tBANCO DVLP\n");
	      
			
			for(String conte: contas) {
				System.out.print((indice+1)+ " - ");
				System.out.println(conte);
				indice++;
			}
				System.out.println("\nEscreva um codigo para a utiliza��o da conta(1/2/3/4): ");
				conta=leia.nextInt();
				
			
	      if(conta == 4) {
	      
		System.out.println("Digite seu nome completo: ");
		nome = leia.next();
		
		System.out.println("Digite sua conta: ");
		NumConta = leia.nextInt();
		
		System.out.println("Digite seu CNPJ: ");
		CNPJ = leia.nextDouble();
		
		System.out.println("Ol� "+nome+" voc� entrou em sua conta empresarial. ");
		System.out.println("Dispoibilizamos � voc� um empr�stimo empresarial com o limite de: 10.000R$");
		System.out.println("Voc� deseja fazer um empr�stimo? 'S'-Sim / 'N'-N�o");
		confirmacao = leia.next().toUpperCase().charAt(0);
		if(confirmacao == 'S') {
			
		System.out.println("Deseja fazer um empr�stimo de quanto em R$?");
			valorEmp = leia.nextDouble();
			
			emprestimo = emprestimo - valorEmp ;
			saldo = valorEmp ;
			System.out.println("Devido ao emprestimo feito voc� tem disponibilizado "+saldo+"R$ de saldo para as opera��es do dia.");
			}else if(confirmacao == 'N') {
				
				while(indic<4 || saldo > 0) {
				System.out.println((indic+1)+"� Opera��o em '1' - D�bito // '2' - Cr�dito?");
				opera = leia.nextInt();
			if (opera == 1) {
				System.out.println("Digite o valor da opera�ao: ");
				valOpera = leia.nextDouble();
				if(valOpera > saldo) {
					System.out.println("Voc� n�o tem saldo para esta opera��o de d�bito.");
				}else {
				saldo = saldo - valOpera ;
				System.out.println("Voc� tem "+saldo+"R$ de saldo.");}
			}else if(opera == 2) {
				System.out.println("Digite o valor que deseja creditar em sua conta: ");
				valOperaC = leia.nextDouble();
				saldo = saldo + valOperaC ;
				System.out.println("Voc� tem "+saldo+"R$ de saldo.");
			} 
			indic++;
			}
			}
		}
	}
	      
}