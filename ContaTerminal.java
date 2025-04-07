import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + 
                           ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                           agencia + ", conta " + numero + 
                           " e seu saldo " + String.format("%.2f", saldo) + 
                           " já está disponível para saque.");
        scanner.close();
    }
}
