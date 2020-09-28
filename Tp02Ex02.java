import java.util.Scanner;
public class Tp02Ex02 {
	public static void main(String[] args) {
	float soma, num, b, media, qtd, maior;
	
	soma = 0;
	qtd = 0;
	maior = 0;
	for (int i = 0; i < 3; i++) {
		Scanner Numero = new Scanner(System.in);
		System.out.printf("Numero:");		
		num = Numero.nextInt();
		qtd = qtd +1 ;
		soma += num;
		if ((num!=0) && (num>maior)) {
			maior = num;
			}
	}	
	media = soma / qtd; 
	System.out.printf("Soma: %f",soma);
	System.out.println();
	System.out.printf("Media: %f",media);
	System.out.println();
	System.out.printf("Maior: %f",maior);
	}
}