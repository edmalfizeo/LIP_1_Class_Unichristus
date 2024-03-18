package ExercisesHome;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioBruto, horasTrabalhadas, ganhoPorHoras;
        double irss, nss, sindicato, salarioLiquido;

        System.out.println("Digite o quanto recebe por horas: ");
        ganhoPorHoras = input.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = input.nextDouble();

        salarioBruto = ganhoPorHoras * horasTrabalhadas;

        irss = salarioBruto * 0.11;
        nss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;

        salarioLiquido = salarioBruto - (irss + nss + sindicato);

        System.out.println("Salario bruto: R$ " + salarioBruto + "\nIRSS(11%): R$ " + irss + "\nNSS(8%): R$ " + nss + "\nSindicato(5%): R$ " + sindicato + "\nSalario Liquido: R$" + salarioLiquido);
    }
}
