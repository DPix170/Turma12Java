package Lista2POO;

import java.util.*;

public class aplicacaoEx5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Operario op1 = new Operario();
		
		System.out.println("Digite o nome do oper�rio: ");
		op1.nome = read.next();
		
		System.out.println("Digite o valor em produ��o: ");
		op1.setValorProducao(read.nextDouble());
		
		System.out.println("Digite a porcentagem de comiss�o: ");
		op1.setComissao(read.nextDouble());
		
		op1.calculoSal();
		
		System.out.println("Sal�rio final de "+op1.getNome()+"� :"+op1.getSalario()+"R$");

	}

}
