package ResolucaoExercicios;
import java.util.Scanner; 


public class Exercicio4 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = scan.nextInt();
		
		
		
		if ((num1 % num2)==0 || (num2 % num1)==0) {
			System.out.println("S�o mult�plos entre si");
		}else
			System.out.println("N�o s�o multilos entre si!");
		
		scan.close();
	}

}
