import java.util.Scanner;
public class L3Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int nEntrevistados;
		int salario=0;
		int totalSal= 0;
		int numFilhos;
		int salX = 0;
		int totalFilhos=0;
		int mediaFilhos;
		int mediaSalario;
		int maiorSala = 0;
		int mediaSal;
		int porcentagem;
		System.out.println("Digite o numero de entrevistados: ");
		nEntrevistados = leia.nextInt();
		
		for(int x=0; x<=nEntrevistados;x++) 
		{
			System.out.println("Digite seu sal�rio: ");
			salario = leia.nextInt();
			
			System.out.println("Digite o numero de filhxs: ");
			numFilhos = leia.nextInt();
		
			if(salario <100) {
				salX= salX + 1 ;
			}
		totalFilhos = totalFilhos + numFilhos;
		totalSal = totalSal + salario ;
		}
		if (salario > maiorSala) {
			maiorSala = salario ;
		}
		mediaSal = totalSal/nEntrevistados ;
		System.out.println("A m�dia do sal�rio dos entrevistados �= "+mediaSal+"R$");
		mediaFilhos = totalFilhos/nEntrevistados;
		System.out.println("A m�dia de filhos dos entrevistados �= "+mediaFilhos+" por entrevistado");
		porcentagem = ((salX*100)/(nEntrevistados+1));
				
		System.out.println("O maior sal�rio �: "+maiorSala);
		System.out.println("A porcentagem de pessoas que recebem menos de R$100 �: "+porcentagem+"%");
	}

}
