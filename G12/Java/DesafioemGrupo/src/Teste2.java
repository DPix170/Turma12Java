import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double base1;
		double altura1;
		double altura;
		double base;
		double area;
		double area1;
		
		System.out.println("Informe a base do tri�ngulo 1: ");
		base = leia.nextDouble();
		
		System.out.println("Informe a altura do tri�ngulo 1: ");
		altura = leia.nextDouble();
		
		System.out.println("Informe a base do tri�ngulo 2: ");
		base1 = leia.nextDouble();
		
		System.out.println("Informe a altura do tri�ngulo 2: ");
		altura1 = leia.nextDouble();
		
		
		area = (base*altura)/2;
		area1 = (base1*altura1)/2;
		
		System.out.println("A area do tri�ngulo 1 �: "+area);
		System.out.println("A base do tri�ngulo 1 �: "+base);
		System.out.println("A altura do tri�ngulo 1 �: "+altura);
		System.out.println();
		System.out.println("A area do tri�ngulo 2 �: "+area1);
		System.out.println("A base do tri�ngulo 2 �: "+base1);
		System.out.println("A altura do tri�ngulo 2 �: "+altura1);
		System.out.println();
		if(area > area1) {
			System.out.println("O tri�ngulo 1 � o maior.");
		}else if(area1 > area) {
			System.out.println("O tri�ngulo 2 � o maior. ");
		}
		
	}

}
