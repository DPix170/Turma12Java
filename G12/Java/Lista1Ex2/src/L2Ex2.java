import java.util.Scanner;
public class L2Ex2 {
	public static void main(String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int dias;
		int meses;
		int anos;
		int dia;
		
		// 9191
		System.out.println("Voc� tem quantos dias vividos?");
		dias = leia.nextInt();
		
		meses = (dias / 30);
		anos = (meses / 12);
		
	System.out.println("Voc� tem "+anos+" anos e ja viveu "+meses+" meses");
		
		
		
		
		
		
		
	}
	
}
