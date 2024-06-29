import java.util.Scanner;

public class CaixaEletronico {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        boolean continuar = true;

        System.out.println("Bem-vindo ao Caixa Eletrônico!");

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$" + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: R$");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor de depósito inválido!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: R$");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    } else if (saque > 0) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Valor de saque inválido!");
                    }
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Obrigado por usar o Caixa Eletrônico. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
