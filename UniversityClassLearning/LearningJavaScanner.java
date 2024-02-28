package UniversityClassLearning;

import java.util.Scanner;

public class LearningJavaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String name, color;

        System.out.print("Digite seu numero favorito: ");
        number = input.nextInt();
        input.nextLine();
        System.out.print("Digite seu nome: ");
        name = input.nextLine();

        System.out.print("Digite uma cor: ");
        color = input.nextLine();

        System.out.println("\nO numero favorito do " + name + " é " + number + " e a cor é " + color);
    }
}