import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tp02Ex10 {
	public static void main (String[] args) {
        int matriz[][];
        int a;
        
        Scanner entrada = new Scanner(System.in);
        int linha=0, coluna =0;
        Scanner Linha = new Scanner(System.in);
    	System.out.printf("Linha:");		
    	linha = Linha.nextInt();
    	Scanner Coluna = new Scanner(System.in);
    	System.out.printf("Coluna:");		
    	coluna = Coluna.nextInt();
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
	}		
}
