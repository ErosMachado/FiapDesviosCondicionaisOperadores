package ResolucaoExercicios;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu ano de nascimento: ");
        int ano = scan.nextInt();
		
        if(((2024-ano)<18 && (2024-ano)>=16) || (2024-ano)>70) {
        	System.out.println("Voto opcional");
        } else if(((2024-ano)>=18)&&(2024-ano<=70)) {
        	System.out.println("Voto obrigatorio");
        }else {
        	System.out.println("Voto Proibido");
        }
        scan.close();
	}
}
