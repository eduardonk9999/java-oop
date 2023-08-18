import java.util.Scanner;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
       String nomeDoUsuario = "";
       int idadeDoUsuario = 0;

       System.out.println("Digite o seu nome");

       Scanner scanner = new Scanner(System.in);
       nomeDoUsuario = scanner.nextLine();

       System.out.println("Digite sua idade");
       idadeDoUsuario = scanner.nextLine();

       System.out.println("o nome digitado é " + nomeDoUsuario);
    }
}
