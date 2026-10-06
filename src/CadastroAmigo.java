import java.util.Scanner;

public class CadastroAmigo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Quantos anos você tem?");
        int idade = scanner.nextInt();

        System.out.println("Prazer, " + nome + "!");
        System.out.println("No próximo aniversário você fará " + (idade + 1) + " anos.");

        scanner.close();
    }
}
