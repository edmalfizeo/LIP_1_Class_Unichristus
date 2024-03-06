package ExercisesHome2;
import java.util.Scanner;
public class Exercise5 {
    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro numero de quanto sera a matriz: ");
        n1 = input.nextInt();
        input.nextLine();

        System.out.println("Digite o segundo numero de quanto sera a matriz: ");
        n2 = input.nextInt();
        input.nextLine();

        matriz(n1,n2);
    }


    public static void matriz(int n1,int n2){
        //Variaveis
        Scanner input = new Scanner(System.in);
        int[][] vetor = new int[n1][n2];
        int soma = 0;

        //Criar e somar a matriz
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.printf("Digite o numero na posição (%d)(%d):",i,j);
                vetor[i][j] = input.nextInt();

                if (vetor[i] == vetor[j]) {
                    soma += vetor[i][j];
                }
            }
        }

        //Imprimir a matriz
        for (int i = 0; i < n1; i++) {
            System.out.println();
            for (int j = 0; j < n2; j++) {
                System.out.printf("%d ",vetor[i][j]);
            }
        }

        System.out.println("\nA soma da diagonal é: " + soma);
    }
}
