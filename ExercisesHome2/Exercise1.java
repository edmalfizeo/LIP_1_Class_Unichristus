package ExercisesHome2;

import java.util.Scanner;

public class Exercise1 {
    public static double calculoImc(double peso, double altura) {
        return peso/Math.pow(altura, 2);
    }
    public static double pesoIdeal(String sex, double altura) {
        double pesoIdeal;
        if(sex.equals("h")) {
            pesoIdeal = (72.7 * altura) - 58;
            return pesoIdeal;
        }else if (sex.equals("f")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            return pesoIdeal;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sex;
        double peso,altura;

        System.out.println("Digite seu sexo: ");
        sex = input.nextLine();

        System.out.println("Digite seu peso: ");
        peso = input.nextDouble();
        input.nextLine();

        System.out.println("Digite sua altura: ");
        altura = input.nextDouble();
        input.nextLine();

        System.out.printf("Seu IMC é: %.2f", calculoImc(peso,altura));
        System.out.printf("\nSeu peso ideal é: %.2f",pesoIdeal(sex, altura));
    }
}

