import java.util.Scanner;

public class Tp02Ex07 {
	public static void main (String[] args) {
        int matriz[][];
        int a;
        Scanner entrada = new Scanner(System.in);
        int linha=3, coluna =4;

        matriz = new int[linha][coluna];

         for(int x=0; x < linha; x++){
            for(int y=0; y < coluna; y++){
                System.out.println("matriz ["+x+"]["+y+"] =");
                matriz[x][y]= entrada.nextInt();
            }
        }

        for(int x=0; x < linha; x++){

            for(int y=0; y < coluna; y++){
                System.out.print(matriz[x][y]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        Scanner Constante = new Scanner(System.in);
		System.out.printf("Constante Multiplicativa:");		
		a = Constante.nextInt();
        for(int x=0; x < linha; x++){

            for(int y=0; y < coluna; y++){
            	matriz [x][y] = matriz [x][y] *a;
                System.out.print(matriz[x][y]+"\t");
            }
            System.out.println();
        }

    }
}
