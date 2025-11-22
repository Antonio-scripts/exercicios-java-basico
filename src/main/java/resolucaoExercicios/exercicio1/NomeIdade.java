package resolucaoExercicios.exercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome ");
        String nome = sc.nextLine();

        System.out.printf("Digite o ano de seu nascimento e");
        int nascimento = sc.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - nascimento;
        System.out.printf("Olá %s você tem %d anos ", nome, idade);

        sc.close();
    }
}
