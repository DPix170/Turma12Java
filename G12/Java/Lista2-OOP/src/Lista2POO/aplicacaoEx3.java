package Lista2POO;

import java.util.Scanner;

public class aplicacaoEx3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Empregado emp1 = new Empregado();
		double salFinal;
		System.out.println("Digite o nome do empregado: ");
		emp1.nome = read.next();
		
		System.out.println("Digite seu c�digo: ");
		emp1.setCodigoSetor(read.nextInt());
		
		System.out.println("Digite o sal�rio base de "+emp1.getNome());
		emp1.setSalarioBase(read.nextDouble());
		System.out.println("Digite a porcentagem de impostos retida: ");
		emp1.setImpostos(read.nextDouble());
		
		emp1.calcularSalario();
		
		System.out.println("O sal�rio final do empregado �: "+emp1.getSalFinal());

	}

}
