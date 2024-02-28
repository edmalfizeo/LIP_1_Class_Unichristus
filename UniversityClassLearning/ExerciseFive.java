package UniversityClassLearning;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite os numeros que quer inserir (%d)(%d) :",i, j);
                matriz[i][j] = input.nextInt();

                if(i == j) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("A soma da diagonal principal é: " + soma);
    }
}
