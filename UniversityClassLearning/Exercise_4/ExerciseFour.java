package UniversityClassLearning;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        double serieHarmonica = 0;

        System.out.println("Digite um numero: ");
        numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            serieHarmonica += 1.0 / i;
        }

        System.out.printf("Valor da Serie Harmonica é: %f",serieHarmonica);
    }
}
