import java.util.Scanner;

public class Tp02Ex04 {
	public static void main (String[] args) {
        int matriz[][];

        Scanner entrada = new Scanner(System.in);
        int linha=2, coluna =3;

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

    }
}
