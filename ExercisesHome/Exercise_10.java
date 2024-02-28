package ExercisesHome;

import java.util.Scanner;
public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1,x2,b,a,c,delta;

        System.out.println("Digite o valor de a: ");
        a = input.nextDouble();

        System.out.println("Digite o valor de b");
        b = input.nextDouble();

        System.out.println("Digite o valor de c");
        c = input.nextDouble();

        delta = ((b*b) - (4 * a * c));

        if (delta >= 0) {
            x1 = (-b + (Math.sqrt(delta)))/(2 * a);
            x2 = (-b - (Math.sqrt(delta)))/(2 * a);

            System.out.println("x1 vale: " + x1);
            System.out.println("x2 vale: " + x2);
        }
        else if(a < 0) {
            System.out.println("Não é equação de segundo grau!");
        }
        else {
            System.out.println("Não existe raiz!");
        }
    }
}
