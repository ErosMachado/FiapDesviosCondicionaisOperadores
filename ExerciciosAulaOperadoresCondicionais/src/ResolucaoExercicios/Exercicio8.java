package ResolucaoExercicios;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a distância total percorrida (em km): ");
        double distancia = scanner.nextDouble();
        System.out.print("Informe o total de combustível gasto (em litros): ");
        double combustivel = scanner.nextDouble();
        double consumoMedio = distancia / combustivel;
        System.out.printf("Consumo médio: %.2f km/L\n", consumoMedio);
        if (consumoMedio < 8) {
            System.out.println("Esse carro bebe hein!");
        } else {
            System.out.println("Autonomia legal");
        }

        scanner.close();
	}
}

