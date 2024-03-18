package ExercisesHome2;
import java.util.Scanner;
public class Exercise5 {
    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantLinhas, quantColunas;

        System.out.println("Digite o primeiro numero de quanto sera a matriz: ");
        quantLinhas = input.nextInt();
        input.nextLine();

        System.out.println("Digite o segundo numero de quanto sera a matriz: ");
        quantColunas = input.nextInt();
        input.nextLine();

        matriz(quantLinhas,quantColunas);
    }


    //Sub-Rotinas
    public static void matriz(int quantLinhas,int quantColunas){
        //Variaveis
        Scanner input = new Scanner(System.in);
        int[][] vetor = new int[quantLinhas][quantColunas];
        int soma = 0;

        //Criar e somar a matriz
        for (int i = 0; i < quantLinhas; i++) {
            for (int j = 0; j < quantColunas; j++) {
                System.out.printf("Digite o numero na posição (%d)(%d):",i, j);
                vetor[i][j] = input.nextInt();
                if(quantLinhas == quantColunas){
                    if (i == j) {
                        soma += vetor[i][j];
                    }
                }
            }
        }

        //Imprimir a matriz
        for (int i = 0; i < quantLinhas; i++) {
            System.out.println();
            for (int j = 0; j < quantColunas; j++) {
                System.out.printf("[%d] ",vetor[i][j]);
            }
        }
        System.out.println("\nA soma da diagonal é: " + soma);
    }
}
