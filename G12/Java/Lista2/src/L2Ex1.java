import java.util.Scanner;
public class L2Ex1 {
	public static void main(String[]args) {
	Scanner leia = new Scanner(System.in);
	
	double multa;
	double peso;
	double excesso;
	
	System.out.print("Digite o peso de tomates em Kg: ");
	peso = leia.nextDouble();
	
	excesso = peso - 50 ;
	multa = excesso * 4 ;
	
		if(peso > 50) 
		{
			System.out.println("Voc� ultrapassou "+excesso+"Kgs e ter� uma multa de "+multa+"R$");
		}else
		{
		System.out.println("Voc� n�o ultrapassou o limite de peso e n�o ter� que pagar multa!!");	
		}
	}
}
