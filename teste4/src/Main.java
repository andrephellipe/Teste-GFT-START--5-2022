import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18 || idade > 67){
            System.out.print("Idade ");
            if (idade < 18) {
                System.out.println("abaixo da permitida para doação de sangue!");
            }
            else {
                System.out.println("acima da permitida para doação de sangue!");
            }
        }
        else {
            System.out.println("Idade dentro da faixa etária permitida para doação!");
        }

        sc.close();
    }
}
