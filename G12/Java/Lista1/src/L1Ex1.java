import java.util.*;

public class L1Ex1 {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
	
	int idade ;
	int meses ;
	int dias ;
	int dia ;
	
		
		System.out.print("Voc� tem quantos anos: ");
		idade = leia.nextInt();
		System.out.print("Voc� tem "+idade+" anos e quantos meses: ");
		meses = leia.nextInt();
		System.out.print("Voc� tem "+idade+" anos, "+meses+" meses e quantos dias: ");
		dia = leia.nextInt();

		dias = ((idade * 365)+(meses*30)+dia);
		System.out.println("Voc� viveu: "+dias+" dias");
	}

}



