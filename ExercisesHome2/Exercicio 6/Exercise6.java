package ExercisesHome2;
import java.util.Scanner;
public class Exercise6 {
    //Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Digite quantos numeros quer imprimir: ");
        numero = input.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.printf("%d ",fib(i));
        }
    }

    //Sub-Rotina Recursiva
    public static int fib(int numero) {
        if (numero == 1 || numero == 0) {
            return numero;
        }
        return fib(numero - 1) + fib(numero - 2);
    }
}
