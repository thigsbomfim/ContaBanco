import java.util.Locale;
import java.util.Scanner;

/**
* <h1>Conta Bancária</h1>
*  Programa de criação de conta bancária via terminal.
 * Captura informações como número da conta, agência, nome, sobrenome e saldo,
 * exibindo os detalhes da conta após inserção dos dados.
* <p>
*
* @author  Thiago Bomfim
* @version 1.0
* @since   24/08/2023
*/

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Por favor, digite o número da Conta: ");
    int numero = scanner.nextInt();

    System.out.print("Agora, digite o número da Agência: ");
    String agencia = scanner.next();

    System.out.print("Digite seu primeiro nome: ");
    String nome = scanner.next();

    System.out.print("Digite seu sobrenome: ");
    String sobrenome = scanner.next();

    System.out.print("Defina o saldo da sua conta: ");
    double saldo = scanner.nextDouble();

    System.out.println("");
    System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco!");
    System.out.println("Sua agência é: " + agencia);
    System.out.println("Numero da conta: " + numero);
    System.out.println("Seu saldo é de R$ " + saldo + " e já está disponível para saque.");
    System.out.println("");
  }
}
