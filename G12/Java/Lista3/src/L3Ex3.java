import java.util.Scanner;
public class L3Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Elaborar um programa que efetue a leitura sucessiva 
		//de valores num�ricos e apresente no final o total do somat�rio, 
		//a m�dia e o total de valores lidos. O programa deve fazer as 
		//leituras dos valores enquanto o usu�rio estiver fornecendo 
		//valores positivos. Ou seja, o programa deve parar
		//quando o usu�rio fornecer um valor negativo.
		
		int x=0;
		int xMed=0;
		int xTotal=0;
		int xSoma=0;
		int xx=0;
		
		while(x>=0) {
			System.out.println("Digite o valor de x: ");
			x = leia.nextInt();
			
			xSoma = xSoma+1;
			xTotal = xTotal + x;
			xMed = xTotal / xSoma;
			System.out.println("O valor total de X �: "+xTotal);
			System.out.println("O valor total de numeros somados foram: "+xSoma);
			System.out.println("A m�dia dos numeros somados: "+xMed);
		}
	}

}
