package ExercisesHome;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, aux;

        System.out.print("Digite um numero: ");
        num = input.nextDouble();

        if(num > 0) {
            aux = num * num;
            System.out.println("O quadrado de " + num + " é = " + aux);

            aux = Math.sqrt(num);
            System.out.println("A raiz quadrada de " + num + " é = " + aux);
        }
    }
}
