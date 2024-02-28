package ExercisesHome;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        int opcao;

        System.out.println("Digite o primeiro valor: ");
        a = input.nextInt();
        input.nextLine();

        System.out.println("Digite o segundo valor: ");
        b = input.nextInt();
        input.nextLine();

        do{
            System.out.println("\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair\nDigite uma opcão: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("\na soma de %.0f + %.0f é = %.0f\n",a,b,a + b);
                    break;
                case 2:
                    System.out.printf("\na subtração de %.0f - %.0f é = %.0f\n",a,b,a - b);
                    break;
                case 3:
                    System.out.printf("\na multiplicação de %.0f * %.0f é = %.0f\n",a,b,a * b);
                    break;
                case 4:
                    System.out.printf("\na divisão de %.0f / %.0f é = %.0f\n",a,b,a / b);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nOpção invalida!\n");
            }
        } while(opcao != 5);
    }
}
