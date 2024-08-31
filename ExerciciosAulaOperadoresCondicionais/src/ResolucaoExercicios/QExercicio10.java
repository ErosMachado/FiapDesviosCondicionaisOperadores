package ResolucaoExercicios;
import java.util.Scanner;

public class QExercicio10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário atual do colaborador: R$ ");
        double sA = sc.nextDouble();

        double pA;
        double vA;

        if (sA <= 280.00) {
            pA = 20;
        } else if (sA > 280.00 && sA <= 700.00) {
            pA = 15;
        } else if (sA > 700.00 && sA <= 1500.00) {
            pA = 10;
        } else {
            pA = 5;
        }

        vA = sA * (pA / 100);
        double nS = sA + vA;

        System.out.println("\nSalário antes do reajuste: " + sA);
        System.out.println("Percentual de aumento aplicado: " + pA + "%");
        System.out.println("Valor do aumento: R$ " + vA);
        System.out.println("Novo salário, após o aumento: R$ " +  nS);

        sc.close();
    }
}
