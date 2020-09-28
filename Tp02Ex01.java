import java.util.Scanner;

public class Tp02Ex01 {
	public static void main(String[] args) {
		float a,b;
			Scanner Numero = new Scanner(System.in);
			System.out.printf("Numero1:");		
			a = Numero.nextInt();
			Scanner Numero1 = new Scanner(System.in);
			System.out.printf("Numero2:");		
			b = Numero1.nextInt();	
			while (a > b) {
				System.out.printf("Numero2:");		
				b = Numero1.nextInt();				
			}
	}	
}
