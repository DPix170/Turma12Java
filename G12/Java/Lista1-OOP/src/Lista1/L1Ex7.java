package Lista1;
import java.util.Scanner;

import Lista1.Paciente;
public class L1Ex7 {
	public static void main(String[]args) {
		
		Scanner read = new Scanner(System.in);
		Paciente paciente1 = new Paciente();
		
		System.out.println("Digite o estado do paciente I-Inst�vel ou E-Est�vel.");
		paciente1.estado = read.next().toUpperCase().charAt(0);
		
		System.out.println("Digite o g�nero do paciente: M-Masculino, F-Feminino: ");
		paciente1.genero = read.next().toUpperCase().charAt(0);
		
		if(paciente1.genero == 'M') {
			System.out.println("Digite o nome do paciente: ");
			paciente1.nome = read.next();
			if (paciente1.estado == 'I'){
				System.out.println("O paciente "+paciente1.nome+ " est� em estado inst�vel. ATEN��O URGENTE.");
			}else if(paciente1.estado == 'E') {
				System.out.println("O paciente "+paciente1.nome+" est� em estado est�vel. ");
			}
		}else if(paciente1.genero == 'F') {
			System.out.println("Digite o nome da paciente: ");
			paciente1.nome = read.next();
			if (paciente1.estado == 'I'){
				System.out.println("A paciente "+paciente1.nome+ " est� em estado inst�vel. ATEN��O URGENTE.");
			}else if(paciente1.estado == 'E') {
				System.out.println("A paciente "+paciente1.nome+" est� em estado est�vel. ");
			}
		}
		System.out.println(" ");
		
		
		
		
	}

}
