import java.util.Scanner;
public class Teste1{
	public static void main(String[]args) {
	
	String contas[] = { "Conta Poupan�a", "Conta Corrente", "Conta Especial", "Conta Empresarial" };
	int conta;
	int cpf;
	int talaoCheque = 0;
	int numTalao = 0;
	double numConta = 0;
	double CNPJ = 0;
	int indice = 0;
	Scanner leia = new Scanner(System.in);
	String nome;
	double emprestimo = 10000;
	char confirmacao;
	char confirmacaoC = 'S';
	double valorEmp;
	double Saldo = 0;
	int opcao;
	int operacao = 0;
	int opera;
	double Debito;
	double Credito;
	int operacoes = 0;
	System.out.println("\tBANCO DVLP\n");
	System.out.println("Digite seu nome: ");
	nome = leia.next();
	for (String conte : contas) {
		System.out.print((indice + 1) + " - ");
		System.out.println(conte);
		indice++;
	}
	
	// Coloquei o while aqui, pq se n�o ele ficaria repetindo apenas o que estava dentro do if, e colocando aqui ele repete as 10 vezes
	// S� n�o sei se era assim que vc queria ficar fazendo o la�o
	while (operacoes < 10) {
		
	System.out.println("\nEscreva um codigo para a utiliza��o da conta(1/2/3/4): ");
	conta = leia.nextInt();
	
		// CONTA CORRENTE
		if (conta == 2) {
			System.out.print("Insira n�mero da conta: ");
			numConta = leia.nextInt();
			System.out.print("Insira seu CPF: ");
			cpf = leia.nextInt();
			System.out.println("Ol� " + nome + " voc� entrou em sua conta corrente!!");
			System.out.println("Voc� disp�e de " + talaoCheque + " tal�es de cheque");
			System.out.println("Seu saldo: " + Saldo);
			System.out.println("Voc� deseja tal�es de cheque? ");
			confirmacao = leia.next().toUpperCase().charAt(0);
			if (confirmacao == 'S') {
				System.out.println("Quantos voc� deseja (1-10)?");
				numTalao = leia.nextInt();
				talaoCheque = talaoCheque + numTalao;
				System.out.println("Voc� dip�e de " + talaoCheque + "tal�es de cheque");
			} else {
				System.out.println(" ");
			}
			operacoes++;
			System.out.println((operacoes) + "� Opera��o em '1' - Cr�dito / '2' - D�bito");
			operacao = leia.nextInt();
			if (operacao == 1) {
				System.out.println("Digite o valor da opera��o: ");
				Credito = leia.nextDouble();
				Saldo = Saldo + Credito;
				System.out.println("Voc� tem " + Saldo + "R$ de saldo.");
			} else if (operacao == 2) {
				System.out.println("Digite o valor da opera��o: ");
				Debito = leia.nextDouble();
				if (Debito > Saldo) {
					System.out.println("Voc� n�o tem saldo para esta opera��o de d�bito.");
				} else {
					Saldo = Saldo - Debito;
					System.out.println("Voc� tem " + Saldo + "R$ de saldo.");
				}
			}
			
		// O seu else if da op��o 4 estava dentro do if da op��o 2, a� s� funcionaria se vc entrasse na conta corrente e na opera��o tu colocasse 4
		// a� s� fechei a chave do if antes do else if, e o while para repetir eu coloquei ele em cima
		} else if (conta == 4) { // CONTA EMPRESARIAL
			System.out.println("Digite sua conta: ");
			numConta = leia.nextInt();
			System.out.println("Digite seu CNPJ: ");
			CNPJ = leia.nextDouble();
			System.out.println("Ol� " + nome + " voc� entrou em sua conta empresarial. ");
			System.out.println("Dispoibilizamos � voc� um empr�stimo empresarial com o limite de: 10.000R$");
			System.out.println("Voc� deseja fazer um empr�stimo? 'S'-Sim / 'N'-N�o");
			confirmacao = leia.next().toUpperCase().charAt(0);
			if (confirmacao == 'S') {
				System.out.println("Deseja fazer um empr�stimo de quanto em R$?");
				valorEmp = leia.nextDouble();
				emprestimo = emprestimo - valorEmp;
				Saldo = valorEmp;
				System.out.println("Devido ao emprestimo feito voc� tem disponibilizado " + Saldo
						+ "R$ de saldo para as opera��es do dia.");
			} else if (confirmacao == 'N') {
				while (operacoes < 4 || Saldo > 0) {
					System.out.println((operacoes + 1) + "� Opera��o em '1' - D�bito // '2' - Cr�dito?");
					opera = leia.nextInt();
					if (opera == 1) {
						System.out.println("Digite o valor da opera�ao: ");
						Debito = leia.nextDouble();
						if (Debito > Saldo) {
							System.out.println("Voc� n�o tem saldo para esta opera��o de d�bito.");
						} else {
							Saldo = Saldo - Debito;
							System.out.println("Voc� tem " + Saldo + "R$ de saldo.");
						}
					} else if (opera == 2) {
						System.out.println("Digite o valor que deseja creditar em sua conta: ");
						Credito = leia.nextDouble();
						Saldo = Saldo + Credito;
						System.out.println("Voc� tem " + Saldo + "R$ de saldo.");
					}
					operacoes++;
				}
			}
		}
	}
	}
}