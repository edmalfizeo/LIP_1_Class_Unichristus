package ExercisesHome;

public class Exercise_12 {
    public static void main(String[] args) {
        double somaQuadrada = 0, somaNumerosQuadrados = 0, diferenca;

        for (int i = 1; i <= 10; i++) {
            somaQuadrada += i * i;
            somaNumerosQuadrados += i;
        }

        somaNumerosQuadrados = Math.pow(somaNumerosQuadrados, 2);
        diferenca = somaNumerosQuadrados - somaQuadrada;

        System.out.printf("Soma dos numeros ao quadrado é = %.0f\nSoma dos quadrados é = %.0f\nDiferença = %.0f",somaNumerosQuadrados, somaQuadrada, diferenca);
    }
}
