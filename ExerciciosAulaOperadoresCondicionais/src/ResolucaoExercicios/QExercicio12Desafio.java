package ResolucaoExercicios;
import java.util.Scanner;

public class QExercicio12Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro lado do triangulo: ");
        double lado1 = sc.nextDouble();
        
        System.out.println("Digite o segundo lado do triangulo: ");
        double lado2 = sc.nextDouble();
        
        System.out.println("Digite o terceiro lado do triangulo: ");
        double lado3 = sc.nextDouble();
        
        double A, B, C;

        if (lado1 >= lado2 && lado1 >= lado3) {
            A = lado1;
            if (lado2 >= lado3) {
                B = lado2;
                C = lado3;
            } else {
                B = lado3;
                C = lado2;
            }
        } else if (lado2 >= lado1 && lado2 >= lado3) {
            A = lado2;
            if (lado1 >= lado3) {
                B = lado1;
                C = lado3;
            } else {
                B = lado3;
                C = lado1;
            }
        } else {
            A = lado3;
            if (lado1 >= lado2) {
                B = lado1;
                C = lado2;
            } else {
                B = lado2;
                C = lado1;
            }
        }

        System.out.println("Em ordem decrescente temos: " + A + ", " + B + ", " + C);

       
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}
