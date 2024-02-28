package ExercisesHome2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Digite um valor: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",fib(i));
        }
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

