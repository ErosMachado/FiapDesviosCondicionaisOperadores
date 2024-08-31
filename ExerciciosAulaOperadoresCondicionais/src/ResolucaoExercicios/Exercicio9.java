package ResolucaoExercicios;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tipo de cliente:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        int tC = scan.nextInt();

        System.out.print("Informe o consumo em kWh: ");
        double consumo = scan.nextDouble();

        double valor;
        switch (tC) {
            case 1:
                valor = 0.60;
                break;
            case 2:
                valor = 0.48;
                break;
            case 3:
                valor = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                return; 
        }

        double Total = consumo * valor;

        System.out.printf("O valor da conta de luz é: "+ Total);

        scan.close();
	}
}
//fim
