package UniversityClassLearning;


import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String genero;
        double peso_ideal, altura;

        System.out.println("Digite sua altura: ");
        altura = input.nextDouble();
        input.nextLine();

        System.out.println("Digite seu genero: ");
        genero = input.nextLine();

        genero = genero.toLowerCase();
        switch (genero) {
            case "masculino":
                peso_ideal = (72.7 * altura) - 58.0;
                System.out.printf("Seu peso ideal = %.2f",peso_ideal);
                break;
            case "feminino":
                peso_ideal = (62.1 * altura) - 44.7;
                System.out.printf("Seu peso ideal = %.2f",peso_ideal);
                break;
        }
    }
}
