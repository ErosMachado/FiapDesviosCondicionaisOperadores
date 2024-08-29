package ResolucaoExercicios;
import java.util.Scanner; 

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite um numero: ");
		int num = scan.nextInt();
		
		if (num%2==0) {
			System.out.println("Parabens, seu numero e par!");
		}else {
			System.out.println("Seu numero e impar!");
		}
		
		scan.close();
	}
}
