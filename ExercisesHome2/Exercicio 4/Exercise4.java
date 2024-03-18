package ExercisesHome2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcao;
        int a, b;

        System.out.print("Digite o primeiro numero: ");
        a = input.nextInt();
        input.nextLine();

        System.out.print("Digite o segundo numero: ");
        b = input.nextInt();
        input.nextLine();

        System.out.print("1 - Somar\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\nhelp ou -h para ajuda\nDigite uma opção: ");
        opcao = input.nextLine();

        if (opcao.equals("help") || opcao.equals("-h")) {
            System.out.println(help());
        } else {

            switch (opcao) {
                case "1":
                    System.out.println("A soma dos numeros é: " + somar(a, b));
                    break;
                case "2":
                    System.out.println("A subtração dos numeros é: " + sub(a, b));
                    break;
                case "3":
                    System.out.println("A multiplicação dos numeros é: " + mult(a, b));
                    break;
                case "4":
                    System.out.println("A divisão dos numeros é: " + div(a, b));
                    break;


            }
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

    public static String help() {
        return "Essa é uma calculadora onde você digita dois numero e tem opcões de calculo basica. Soma, Subtração, Multplicação, Divisão";
    }

}
