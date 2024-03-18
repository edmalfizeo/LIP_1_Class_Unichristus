package ExercisesHome;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Digite um numero para obter o fatorial: ");
        n = input.nextInt();

        System.out.printf("o fatorial de %d é = %d",n, fatorial(n));

    }

    static int fatorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
