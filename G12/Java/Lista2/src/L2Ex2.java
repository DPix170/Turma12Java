import java.util.Scanner ;
public class L2Ex2 {
	public static void main(String [] args ) {
		
		/*
		 * Elabore um sistema que leia as vari�veis C e N, 
		 * respectivamente c�digo e n�mero de horas trabalhadas
		 *  de um oper�rio. E calcule o sal�rio sabendo-se que 
		 *  ele ganha R$ 10,00 por hora. Quando o n�mero de horas 
		 *  exceder a 50 calcule o excesso de pagamento armazenando-o
		 *   na vari�vel E, caso contr�rio zerar tal vari�vel. 
		 *   A hora excedente de trabalho vale R$ 20,00. No final do 
		 *   processamento imprimir o sal�rio total e o sal�rio excedente.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int codigo ; //C
		int hora = 0 ;  //N
		int salario; 
		int resultado;
		int extra ; //E
		int salarioFinal;
	
		System.out.print("Digite o c�digo de acesso: ");
		codigo = leia.nextInt();
		System.out.print("Digite o n�mero de horas trabalhadas: ");
		hora = leia.nextInt();
		
		salario = hora * 10 ;
		
		extra = hora - 50 ;
		
		resultado = extra * 20 ;
		
		salarioFinal = salario + resultado ;
		
		if(hora>50)
		{
		System.out.print("O valor do sal�rio �: "+salario+"R$\n");
		System.out.println("O valor do sal�rio com os reajustes �: "+salarioFinal+"R$");
		}else
		{
		System.out.print("O valor do sal�rio �: "+salario+"R$");	
		}
		
		
		
	}
}
