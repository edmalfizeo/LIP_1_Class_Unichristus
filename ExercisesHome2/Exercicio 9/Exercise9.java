package ExercisesHome2;
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha = 0;
        try{
            System.out.println("Digite uma senha numerica: ");
            senha = input.nextInt();
        }catch(Exception x) {
            System.out.println("Senha invalida pois não é numerica");
        }
        String senhaStr = Integer.toString(senha);
        if (!senhaStr.equals("0")) {
            System.out.printf("Sua senha é: %s",senhaStr);
        } else {
            System.out.printf("\nSua senha é: %s",senhaStr);
            System.out.println("\nSe sua senha estiver como 0, ou você digitou o numero 0, ou deu erro pois digitou letras.");
        }
    }
}
