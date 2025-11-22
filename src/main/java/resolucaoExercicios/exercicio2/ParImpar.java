package resolucaoExercicios.exercicio2;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Informe o segundo número (maior que o primeiro): ");
        int n2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite 'par' ou 'impar': ");
        String escolha = sc.nextLine().toLowerCase();

        for (int i = n2; i >= n1; i--) {
            if (escolha.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}