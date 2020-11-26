import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores 
		 * e lhe contraram para desenvolver o programa que calcular� os reajustes.
		   Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o 
		   seguinte crit�rio, baseado no sal�rio atual:
		   sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
		   sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
		   sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		   sal�rios de R$ 1500,00 em diante : aumento de 5%
		 */
		
		Scanner read = new Scanner(System.in);
		double salarioAtual = 0;
		double salarioReajustado = 0 ;
		double valorAumentado = 0;
		int porcentagemAumentada = 0;
		double diferenca = 0;
		
		
		System.out.println("Digite o sal�rio atual: ");
		salarioAtual = read.nextDouble();
		
		if(salarioAtual <=280) 
		{
			porcentagemAumentada = 20;
			salarioReajustado = salarioAtual + ((salarioAtual/100)*porcentagemAumentada);
		}else if(salarioAtual>280 && salarioAtual <=700) {
			porcentagemAumentada = 15;
			salarioReajustado = salarioAtual+ ((salarioAtual/100)*porcentagemAumentada);
		}else if (salarioAtual > 700 && salarioAtual <=1500 ) {
			porcentagemAumentada = 10;
			salarioReajustado = salarioAtual+ ((salarioAtual/100)*porcentagemAumentada);
		}else if(salarioAtual > 1500) {
			porcentagemAumentada = 5;
			salarioReajustado = salarioAtual+ ((salarioAtual/100)*porcentagemAumentada);
		}
		diferenca = salarioReajustado - salarioAtual;
		System.out.println("Salario pr� reajuste: "+salarioAtual+"R$");
		System.out.println("Porcentagem de reajuste: "+porcentagemAumentada+"%");
		System.out.println("Sal�rio reajustado: "+salarioReajustado+"R$");
		System.out.println("Valor do reajuste: "+diferenca+"R$");
	}

}
