import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agencia = sc.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agênca é "+ agencia + ", conta "+ numero+ "e seu saldo "+ saldo+"já está disponivel para saque.");

    }
}
