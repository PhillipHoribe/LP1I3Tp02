import java.util.Scanner;


public class Tp02Ex03 {
	public static void main(String[] args) {
		float soma, num, b, qtd, maior, num1, menor, numero, PorcN, PorcP, media;
		int qtdNegativo = 0;
		int qtdPositivo = 0;
		String confirma ="";
		
		soma = 0;
		qtd = 0;
		maior = 0;
		num = 0;
		menor = num;
		/*Scanner Numero1 = new Scanner(System.in);
		System.out.printf("Numero:");		
		num1 = Numero1.nextInt();
		While (num1!=0){*/
		//do {
			Scanner Numero1 = new Scanner(System.in);
			System.out.printf("Quantidade de numeros:");		
			num1 = Numero1.nextInt();
		
		for (int i = 0; i < num1; i++) {
			Scanner Numero = new Scanner(System.in);
			System.out.printf("Numero:");		
			num = Numero.nextInt();
			qtd = qtd +1 ;
			soma += num;
			if ((num!=0) && (num>maior)) {
				maior = num;
				}	
		}
			for (int i = 0; i < num1; i++) {
				if (num < 0) {
					qtdNegativo = qtdNegativo + 1;
				}
				else {
					qtdPositivo = qtdPositivo + 1;
				}
			}
			
			PorcN = qtdNegativo * 100 / num;
			PorcP = qtdPositivo * 100 / num;
			media = soma / num1;
		/*Scanner confirmas = new Scanner(System.in);
		System.out.printf("Numero:");		
		confirma = confirmas.nextInt();
		}while(confirma.equals("Sim"));*/
		
		System.out.printf("Soma: %f",soma);
		System.out.println();
		System.out.printf("Menor: %f",menor);
		System.out.println();
		System.out.printf("Maior: %f",maior);
		System.out.println();
		System.out.printf("Media: %f",media);
		System.out.println();
		System.out.printf("% Positiva: %f",PorcN);
		System.out.println();
		System.out.printf("% Negativa: %f",PorcN);
		
			}
		}
//}
	

