import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
   //Atributos    
   int numero = 1021;
   String agencia = "067-8";
   String nomeCliente = "MARIO ANDRADE";
   double saldo = 237.48;
 
       
   public static void main(String[] args) throws Exception {

      // Criando objeto Scanner para os dados serem inseridos no terminal manualmente
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Por favor, digite o número da Conta !");
      int numero = scanner.nextInt();

      System.out.println("Por favor, digite o número da Agência !");
      String agencia = scanner.next();
      
      System.out.println("Por favor, digite o nome do cliente !");
      String nomeCliente = scanner.next();scanner.nextLine();

      System.out.println("Por favor, digite o saldo !");
      double saldo = scanner.nextDouble();

      System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "
      + numero +" e seu saldo "+ saldo +" já está disponível para saque."
      );

    }
}
