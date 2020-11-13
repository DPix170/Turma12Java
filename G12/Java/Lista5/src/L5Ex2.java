import java.util.Scanner;

public class L5Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double peso;
		double altura;
		double IMC;
		
		System.out.println("Digite a altura: ");
		altura = leia.nextDouble();
		System.out.println("Digite o peso: ");
		peso = leia.nextDouble();
		
		IMC = (peso/Math.pow(altura, 2));
		
		if(IMC<=18.5) {
			System.out.println("Voc� est� abaixo do peso.");
		}else if(IMC>18.5 && IMC <=25) {
			System.out.println("Voc� est� com o IMC saud�vel!");
		}else if(IMC>25 && IMC <=30) {
			System.out.println("Voc� est� acima do peso.");
		}else if(IMC>30) {
			System.out.println("Voc� est� obeso!");
		}
	}
}