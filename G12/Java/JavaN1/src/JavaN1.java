import java.util.Scanner;
public class JavaN1 {
	public static void main(String[]args) {
	
		Scanner leia = new Scanner(System.in);
	
	int anoNasc ;
	int idade ;
	double salario ;
	String nome ;
	
	
	
	
	
		System.out.print("Digite nome: " );
		nome = leia.nextLine();
		System.out.print("Digite seu ano de nascimento: ");
		anoNasc = leia.nextInt();
		System.out.print("Digite seu sal�rio: ");
		salario = leia.nextDouble();
		
		idade = 2020 - anoNasc;
		System.out.println(nome);
		System.out.println("Sua idade �:"+idade);
		System.out.println("Seu sal�rio �: "+salario+"R$");
	}
}