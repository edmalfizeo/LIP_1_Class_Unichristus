package ExercisesHome;

import java.util.Scanner;
public class Exercise_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, emprestimo, aux;

        System.out.print("Digite o Salario do cliente: ");
        salario = input.nextDouble();

        System.out.print("Digite o valor do emprestimo: ");
        emprestimo = input.nextDouble();

        aux = (20.0 / 100.0) * salario;

        if (emprestimo > aux) {
            System.out.println("Emprestimo não concedido!");
        }
        else {
            System.out.println("Emprestimo concedido!");
        }

    }
}
