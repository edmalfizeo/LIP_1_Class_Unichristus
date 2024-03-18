package ExercisesHome;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Digite um a quantidade de numeros que quer: ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",fib(i));
        }
    }

    static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

