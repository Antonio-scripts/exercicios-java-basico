package resolucaoExercicios.exercicio1;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.printf("Área do retângulo: %d ", area);
    }
}
