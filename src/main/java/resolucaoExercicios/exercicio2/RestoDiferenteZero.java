package resolucaoExercicios.exercicio2;

import java.util.Scanner;

public class RestoDiferenteZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o número inicial: ");
        int numeroInicial = sc.nextInt();

        while (true){
            System.out.printf("Digite outro número");
            int numero = sc.nextInt();

            if (numero < numeroInicial) {
                System.out.printf("o número %d será ignorado por ser menor que o inicial", numero);
                continue;
            }

            if (numero % numeroInicial != 0) {
                System.out.printf("o %d não é divisivel por %d ", numero, numeroInicial);
                break;
            }

            System.out.printf("O número %d é divisivel por %d ", numero, numeroInicial);
        }
        sc.close();
    }
}
