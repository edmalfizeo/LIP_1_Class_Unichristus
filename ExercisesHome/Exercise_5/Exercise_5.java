package ExercisesHome;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area, raio;

        System.out.print("Digite o valor do raio: ");
        raio = input.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area é = " + area);
    }
}
