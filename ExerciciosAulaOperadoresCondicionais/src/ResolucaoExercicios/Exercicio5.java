package ResolucaoExercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        
        double res = 0; 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro n�mero: ");
        double num1 = scan.nextDouble();
        
        System.out.println("Digite o segundo n�mero: ");
        double num2 = scan.nextDouble();
        
        System.out.println("Digite a opera��o matem�tica desejada (+, -, *, /): ");
        char oper = scan.next().charAt(0); 
        
        switch (oper) {
            case '+': 
                res = num1 + num2;
                break;
            case '-': 
                res = num1 - num2;
                break;
            case '*': 
                res = num1 * num2;
                break;
            case '/': 
                    res = num1 / num2;
                break;
            default: 
                System.out.println("Opera��o inv�lida.");
                scan.close();
                return;
        }
        
        System.out.println("O resultado �: " + res);
        scan.close();
    }
}
