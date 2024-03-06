package ExercisesHome2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Digite um valor: ");
        n = input.nextInt();

        array(n);
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void array(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = fib(i);

        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",array[i]);
        }
    }
}

