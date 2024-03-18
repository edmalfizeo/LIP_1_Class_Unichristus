package ExercisesHome;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, contador50 = 0, contador10 = 0, contador5 = 0, contador1 = 0;

        System.out.println("Digite um valor para sacar: ");
        valor = input.nextInt();

        while(valor > 0) {
            if (valor >= 50) {
                valor -= 50;
                contador50 += 1;
            }
            else if (valor >= 10) {
                valor -= 10;
                contador10 += 1;
            }
            else if (valor >= 5) {
                valor -= 5;
                contador5 += 1;
            }
            else {
                valor -= 1;
                contador1 += 1;
            }
    }

        System.out.println("Nota50 = " + contador50 + "\nNota10 = " + contador10 + "\nNota5 = " + contador5 + "\nNota1 = " + contador1);
    }
}
