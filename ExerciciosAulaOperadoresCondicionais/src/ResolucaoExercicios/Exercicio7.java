package ResolucaoExercicios;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=5, b=7, c=4, d=8;
		boolean A, B, C, D, E;
		
		A = (a<=b) && (b<d);
		B = (a==b) || (c!= b);
		C = (d>a) && (c>=b);
		D = (a<=b) || (c<=d);
		E = ((b>c) || (c<a) ) && (d<=b);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);

		scan.close();
		
		//true
		//true
		//false
		//true
		//false

	}

}
