import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		TrianguloDe t3 = new TrianguloDe();
		Pessoa usuario = new Pessoa();
		
		double base1;
		double altura1;
		double altura;
		double base;
		double area;
		double area1;
		char genero;
		
		System.out.println("Digite seu nome: ");
		usuario.nome = leia.next();
		
		System.out.println("Digite seu g�nero: M - Masculino / F - Feminino");
		genero = leia.next().toUpperCase().charAt(0);
		
		if (genero == 'M')
		{
			usuario.genero = "Masculino";
		}else if(genero == 'F') {
			usuario.genero = "Feminino";
		}
		System.out.println("Ano de nascimento: ");
		usuario.anoNasc = leia.nextInt();
		System.out.print("Voc� tem ");
		usuario.idade();
		
		
			System.out.println();
			System.out.println("Informe a base do tri�ngulo 1: ");
		
		base = leia.nextDouble();
		while(base <=0 ) {
			System.out.println("Tamanho inv�lido digite novamente");
			System.out.println("Informe a base do tri�ngulo 1: ");
			base = leia.nextDouble();
		}
		
		System.out.println("Informe a altura do tri�ngulo 1: ");
		altura = leia.nextDouble();
		while(altura <=0 ) {
			System.out.println("Tamanho inv�lido digite novamente");
			System.out.println("Informe a altura do tri�ngulo 1: ");
			altura = leia.nextDouble();
		}
		
		
		System.out.println("Informe a base do tri�ngulo 2: ");
		base1 = leia.nextDouble();
		while(base1 <=0 ) {
		System.out.println("Tamanho inv�lido digite novamente");
		System.out.println("Informe a base do tri�ngulo 2: ");
		base1 = leia.nextDouble();
		}
		System.out.println("Informe a altura do tri�ngulo 2: ");
		altura1 = leia.nextDouble();
		while(altura1<=0) {
			System.out.println("Tamanho inv�lido digite novamente");
			System.out.println("Informe a altura do tri�ngulo 2: ");
			altura1 = leia.nextDouble();	
		}

		System.out.println("Informe a base do tri�ngulo 3: ");
		t3.base = leia.nextDouble();
		while(t3.base <=0 ) {
		System.out.println("Tamanho inv�lido digite novamente");
		System.out.println("Informe a base do tri�ngulo 3: ");
		t3.base = leia.nextDouble();
		}
		System.out.println("Informe a altura do tri�ngulo 3: ");
		t3.altura = leia.nextDouble();
		while(t3.altura<=0) {
			System.out.println("Tamanho inv�lido digite novamente");
			System.out.println("Informe a altura do tri�ngulo 3: ");
			t3.altura = leia.nextDouble();	
		}
		area = (base*altura)/2;
		area1 = (base1*altura1)/2;
		t3.area = (t3.base*t3.altura)/2;
		
	
		System.out.println("A area do tri�ngulo 1 �: "+area);
		System.out.println("A base do tri�ngulo 1 �: "+base);
		System.out.println("A altura do tri�ngulo 1 �: "+altura);
		System.out.println();
		System.out.println("A area do tri�ngulo 2 �: "+area1);
		System.out.println("A base do tri�ngulo 2 �: "+base1);
		System.out.println("A altura do tri�ngulo 2 �: "+altura1);
		System.out.println();
		
		System.out.println();
		System.out.println("A area do tri�ngulo 3 �: "+t3.area);
		System.out.println("A base do tri�ngulo 3 �: "+t3.base);
		System.out.println("A altura do tri�ngulo 3 �: "+t3.altura);
		System.out.println();
		
		if(area > area1 && area > t3.area) {
			System.out.println("Maior �rea � do tri�ngulo 1.");
		}else if(area1 > area && area1 > t3.area) {
			System.out.println("Maior �rea � do tri�ngulo 2.");
		}else {
			System.out.println("Maior �rea � do tri�ngulo 3.");
		}
		
	}

}
