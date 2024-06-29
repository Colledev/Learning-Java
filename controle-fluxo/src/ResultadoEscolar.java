import java.util.Scanner;

public class ResultadoEscolar {
    
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de resultados escolares!");   
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2 ) / 2;

        if (media >= 70) {
            System.out.println("Parabéns! Você foi aprovado com média " + media);
        } else if (media >= 40) {
            System.out.println("Você está de recuperação com média " + media);
        } else {
            System.out.println("Você foi reprovado com média " + media);
        }

        scanner.close();
    }
}
