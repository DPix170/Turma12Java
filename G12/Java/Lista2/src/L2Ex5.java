import java.util.Scanner;
public class L2Ex5 {
	public static void main (String[]args){
		
		Scanner leia = new Scanner(System.in);
		
		double indiceP;
		
		System.out.print("Digite o valor do �ndice de polui��o: ");
		indiceP = leia.nextDouble();
		
		if(indiceP < 0.3 ) 
		{
			System.out.println("O indice de polui��o est� aceit�vel, todas as empresas podem operar!");
		}
		else if(indiceP >= 0.3 && indiceP <= 0.39) 
		{
			System.out.println("O indice de polui��o est� acima do n�vel para opera��o do 1�Grupo. Suspendam as atividades!");
		}
		else if(indiceP >= 0.4 && indiceP <= 0.49) 
		{
			System.out.println("O indice de polui��o est� acima do n�vel para opera��o do 1�e2�Grupo. Suspendam as atividades!");
		}
		else if (indiceP >=0.5) 
		{
			System.out.println("O indice de polui��o est� acima do n�vel para opera��o de todos os grupos. Suspendam as atividades!");
		}
	}
}
