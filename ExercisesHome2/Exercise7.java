package ExercisesHome2;

public class Exercise7 {
    public static void PrimeiroMetodo() {
        System.out.println(" Inicio da execucao o primeiro metodo !");
        SegundoMetodo();
        System.out.println("Fim da execucao do primeiro metodo !");
    }

    public static void SegundoMetodo() {
        System.out.println("Inicio da execucao o segundo metodo !");
        double[] v  = new double[5];
        try {
            for (int i = 0; i <= 10; i++) {
                v[i] = i;
                System.out.println(i);
            }
        }catch (Exception x) {
            System.out.println(x.getMessage());
        }
        System.out.println("Fim da execucao do segundo metodo !");
    }

    public static void main(String[] args) {
        System.out.println("Inicio da main ");
        PrimeiroMetodo();
        System.out.println("Fim da main ");
    }
}

