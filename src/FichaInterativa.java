import java.util.Locale;
import java.util.Scanner;

public class FichaInterativa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("==== Ficha de inscrição =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("===========================");
    }
}
