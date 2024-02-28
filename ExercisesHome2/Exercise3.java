package ExercisesHome2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao, a, b;

        System.out.print("Digite o primeiro numero: ");
        a = input.nextInt();
        input.nextLine();

        System.out.print("Digite o segundo numero: ");
        b = input.nextInt();
        input.nextLine();

        System.out.println("1 - Somar\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\nDigite uma opção: ");
        opcao = input.nextInt();
        input.nextLine();

        switch(opcao) {
            case 1:
                System.out.println("A soma dos numeros é: " + somar(a,b));
                break;
            case 2:
                System.out.println("A subtração dos numeros é: " + sub(a,b));
                break;
            case 3:
                System.out.println("A multiplicação dos numeros é: " + mult(a,b ));
                break;
            case 4:
                System.out.println("A divisão dos numeros é: " + div(a,b));
        }
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

}