package ExercisesHome;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextFloat();

        media = (nota1 + nota2) / 2;

        if(media >= 7.0) {
            System.out.println("Media: " + media);
            System.out.println("Aprovado!");
        }

        else if (media < 4.0) {
            System.out.println("Media: " + media);
            System.out.println("\nReprovado!");
        }

        else {
            float nota_final;
            System.out.println("Digite a nota final: ");
            nota_final = input.nextFloat();

            float media_final = (nota1 + nota2 + nota_final) / 3;

            if (media_final >= 5.0) {
                System.out.println("Media final: " + media_final);
                System.out.println("Aprovado na final.");
            }

            else {
                System.out.println("Media final: " + media_final);
                System.out.println("Reprovado na final.");
            }
        }
    }
}
