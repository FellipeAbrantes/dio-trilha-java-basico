import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);



        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();
        System.out.println("Digite sua conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();



        System.out.println("Óla " + nome + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!" );

    }
}