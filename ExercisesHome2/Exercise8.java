package ExercisesHome2;

public class Exercise8 {
    public static double iterativeDivide(double... args) {
        double total = 1;

        try {
            for (double i : args) {
                if (i == 0.0) {
                    System.out.print("There is a number that is 0 so the program");
                    throw new RuntimeException(" Cannot divide by zero.");
                }
                total /= i;
            }
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
        return total;
    }

    public static String toLowerCase(String phrase) {
        String newPhrase;
        newPhrase = phrase.toLowerCase();
        return newPhrase;
    }

    public static void main(String[] args) {
        System.out.printf("The total of the iterativeDivide without zero is: %f", iterativeDivide(1, 2.1, 3.2, 4.1, 0));
        System.out.printf("\nThe phrase in lower case is: %s", toLowerCase("OLA A TODOS "));
    }
}

