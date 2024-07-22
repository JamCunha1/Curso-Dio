import java.util.Scanner;

public class ContaTerminal {

public static void main (String[] args) {
   // TODO: conhecer e exportar a classe scanner 
   // Exibir as mensagens para nossos usuários 
   // Obter pela scanner os valores comentados por nossos usuários 
   // Exibir a mensagem conta criada
   Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();

        // Exibindo os dados fornecidos pelo usuário
        System.out.println("Olá, "+ nome +" obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque.");
        
        scanner.close();
}
}
