package ResolucaoExercicios;
import java.util.Scanner;

	public class QExercicio11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        System.out.print("Informe o código do estado de origem da carga (1 a 5): ");
        int codigoEstado = sc.nextInt();

        System.out.print("Informe o peso da carga em toneladas: ");
        double pesoToneladas = sc.nextDouble();

        System.out.print("Informe o c�digo da carga (10 a 40): ");
        int codigoCarga = sc.nextInt();

        double pesoQuilos = pesoToneladas * 1000;

        double precoKg;
        if (codigoCarga >= 10 && codigoCarga <= 20) {
            precoKg = 100;
        } else if (codigoCarga >= 21 && codigoCarga <= 30) {
            precoKg = 250;
        } else {
            precoKg = 340;
        } 

        double valorCarga = pesoQuilos * precoKg;

        double imposto;
        switch (codigoEstado) {
            case 1:
                imposto = valorCarga * 0.35;
                break;
            case 2:
                imposto = valorCarga * 0.25;
                break;
            case 3:
                imposto = valorCarga * 0.15;
                break;
            case 4:
                imposto = valorCarga * 0.05;
                break;
            case 5:
                imposto = 0.00;
                break;
            default:
                return;
        }

        double valorTotal = valorCarga + imposto;

        System.out.println("Peso da carga em quilos: " + pesoQuilos );
        System.out.println("Preço da carga: R$ " + valorCarga);
        System.out.println("Valor do imposto: " + imposto);
        System.out.println("Valor total transportado: " +  valorTotal);

        sc.close();
    }
}
