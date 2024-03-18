package ExercisesHome;

import java.util.Scanner;

public class Exercise_12_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i = 1, somaQuadrados = 0, somaNumerosQuadrados = 0, diff, n;

        System.out.print("Digite até onde quer somar: ");
        n = input.nextDouble();

        while(i <= n) {
            somaNumerosQuadrados += i;
            somaQuadrados += i * i;
            i++;
        }

        somaNumerosQuadrados = Math.pow(somaNumerosQuadrados, 2);
        diff = somaNumerosQuadrados - somaQuadrados;

        System.out.printf("Soma dos numeros elevado ao quadrado = %.0f\nSoma dos quadrados = %.0f\nDiferença = %.0f",somaNumerosQuadrados, somaQuadrados, diff);
    }
}
