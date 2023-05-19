import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println(" Por favor, digite o número da Conta !");
        int conta = scanner.nextInt();

        System.out.println(" Por favor, digite o seu Nome !");
        String nomeCliente = scanner.next();

        System.out.println(" Por favor, digite o seu Sobrenome !");
        String sobronomeCliente = scanner.next();

        System.out.println(" Por favor, digite o seu saldo !");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + " " + sobronomeCliente + " obrigado por criar uma conta em nosso banco, sua agência: " + agencia + " conta " + conta + " e seu saldo de " + saldo + " já esta disponivel pra saque!");
        

    }
}
