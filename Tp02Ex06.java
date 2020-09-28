import java.util.Scanner;

public class Tp02Ex06 {
	public static void main (String[] args) {
        String [][] Nomes;
        Scanner entrada = new Scanner(System.in);
        Nomes = new String[3][2];

         for(int x=0; x < 3; x++){
            for(int y=0; y < 2; y++){
                System.out.println("matriz ["+x+"]["+y+"] =");
                Nomes[x][y]= entrada.nextLine();
            }
        }

        for(int x=0; x < 3; x++){

            for(int y=0; y < 2; y++){
                System.out.print(Nomes[x][y]+"\t");
            }
            System.out.println();
        }

    }
}
