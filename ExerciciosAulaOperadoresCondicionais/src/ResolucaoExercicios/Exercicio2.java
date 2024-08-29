package ResolucaoExercicios;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner; 


public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O maior numero e o "+num1);
		}else if(num2>num1) {
			System.out.println("O maior numero e o "+num2);
		}else
			System.out.println("Os numeros sao iguais");

		
		scan.close();
	}

}
