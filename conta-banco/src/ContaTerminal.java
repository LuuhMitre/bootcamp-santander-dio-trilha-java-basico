// Conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Criando o objeto scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Exibir as mensagens para o nosso usuário e obter os valores digitados no terminal
        System.out.println("Informe o numero da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Informe a agencia bancaria: ");
        String agencia = scanner.next();

        System.out.println("Informe o nome e sobrenome do cliente: ");
        String nomeCliente = scanner.next();
        String sobrenomeCliente = scanner.next();

        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();


        // Exibir a mensagem de conta criada
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + " e sua conta " + numeroConta + ". Seu saldo no valor de R$ " + saldo + " já está disponível para saque.");
    }
}
