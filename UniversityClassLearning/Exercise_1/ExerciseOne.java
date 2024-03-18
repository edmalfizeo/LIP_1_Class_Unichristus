package UniversityClassLearning;

import java.util.*;
public class ExerciseOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float graus;
        double radiano;

        System.out.print("Digite o angulo em graus: ");
        graus = input.nextFloat();
        input.nextLine();

        radiano = graus * (Math.PI/180);
        System.out.printf("A conversão é: %.5f", radiano);
    }
}
