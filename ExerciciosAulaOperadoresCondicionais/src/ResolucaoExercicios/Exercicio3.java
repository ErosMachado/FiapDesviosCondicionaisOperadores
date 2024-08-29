package ResolucaoExercicios;
import java.util.Scanner; 


public class Exercicio3 {
	public static void main(String[] args) {
		double r;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = scan.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double n3 = scan.nextDouble();
		System.out.println("Digite a quarta nota: ");
		double n4 = scan.nextDouble();
		
		r = (n1+n2+n3+n4)/4; // média
		
		if(r>=7) {
			System.out.println("Aprovado");
		}else if((r>=5) &&(r<7)){
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
		
		scan.close();

	}

}
