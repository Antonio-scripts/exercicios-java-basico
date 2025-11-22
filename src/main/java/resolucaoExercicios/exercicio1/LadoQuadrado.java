package resolucaoExercicios.exercicio1;

import java.util.Scanner;

public class LadoQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.printf("Área do quadrado: %d ", area);
    }
}
