import java.util.Scanner;

public class Tp02Ex09 {
	public static void main (String[] args) {
	        int matriz[][];
	        int a;
	        int transposta[][];
	        
	        Scanner entrada = new Scanner(System.in);
	        int linha=0, coluna =0;
	        Scanner Linha = new Scanner(System.in);
	    	System.out.printf("Linha:");		
	    	linha = Linha.nextInt();
	    	Scanner Coluna = new Scanner(System.in);
	    	System.out.printf("Coluna:");		
	    	coluna = Coluna.nextInt();
	        matriz = new int[linha][coluna];
	        transposta = new int[linha][coluna];

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
	        for(int x=0; x < linha; x++){

	            for(int y=0; y < coluna; y++){
	                System.out.print(transposta[x][y]+"\t");
	            }
	            System.out.println();
	        }
	        System.out.println();
		}
}