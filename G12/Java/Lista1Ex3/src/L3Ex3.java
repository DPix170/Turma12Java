import java.util.Scanner;
public class L3Ex3 {

	public static void main(String [] args) {
	Scanner leia = new Scanner(System.in);
	
	//Fa�a um sistema que leia o tempo de dura��o de um evento 
	//em uma f�brica expressa em segundos e mostre-o expresso 
	//em horas, minutos e segundos. 
	//
	int seg ;
	int hora ;
	int min ;
	
	
	
	System.out.println("Digite o tempo de dura��o do evento em segundos: ");
		seg = leia.nextInt();
		
		min = seg / 60 ;
		hora = min * 60 ;
	System.out.println("Visto as informa��es o evento durou por: "+min+" minutos ou "+hora+" horas");
	
		
		
		
		
	}
}
