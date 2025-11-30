package resolucaoExercicios.exercicio5;

import resolucaoExercicios.exercicio5.area.Circle;
import resolucaoExercicios.exercicio5.area.GeometricForm;
import resolucaoExercicios.exercicio5.area.Rectangle;
import resolucaoExercicios.exercicio5.area.Square;
import resolucaoExercicios.exercicio5.mensagem.*;
import resolucaoExercicios.exercicio5.tributo.*;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();

        while (true) {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Tributo");
            System.out.println("3 - Área geométrica");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> main.mensagem();
                case 2 -> main.tributo();
                case 3 -> main.areaGeometrica();   // chama método de instância
                case 0 -> {
                    System.out.println("Programa encerrado!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida!\n");
            }
        }
    }

    private void mensagem() {
        System.out.println("\n Escolha a caminho que a mensagem será enviada");
        System.out.println("1 - SMS");
        System.out.println("2 - E-mail");
        System.out.println("3 - Redes Socias");
        System.out.println("4 - WhatsApp");
        System.out.println("0 - Voltar");

        int op = sc.nextInt();
        Mensagem msg = null;

        switch (op) {
            case 1 -> msg = new SMS();
            case 2 -> msg = new Email();
            case 3 -> msg = new RedesSociais();
            case 4 -> msg = new WhatsApp();
            case 0 -> {
                return;
            }
            default -> {
                System.out.println("Opção ivalida");
                return;
            }
        }
        System.out.println(msg.getMensagem());

    }

    private void tributo() {
        System.out.println("\n Informe o tipo");
        System.out.println("1 - Alimentação");
        System.out.println("2 - Saude e bem estar");
        System.out.println("3 - Vestuario");
        System.out.println("4 - Cultura");
        System.out.println("0 - Voltar");


        int op = sc.nextInt();
        Tributo tributo = null;

        switch (op) {
            case 1 -> tributo = tributoAlimentacao();
            case 2 -> tributo = tributoSaudeBemEstar();
            case 3 -> tributo = tributoVestuario();
            case 4 -> tributo = tributoCultura();
            case 0 -> {
                return;
            }
            default -> {
                System.out.println("Opção ivalida");
                return;
            }

        }
        System.out.printf("O valor dos tributos é R$%.2f \n", tributo.getTributo());
    }

    private Tributo tributoAlimentacao() {
        System.out.println("Digite o valor: ");
        double tributo = sc.nextDouble();
        return new Alimentacao(tributo);
    }

    private Tributo tributoSaudeBemEstar() {
        System.out.println("Digite o valor: ");
        double tributo = sc.nextDouble();
        return new SaudeBemEstar(tributo);
    }

    private Tributo tributoVestuario() {
        System.out.println("Digite o valor: ");
        double tributo = sc.nextDouble();
        return new Vestuario(tributo);
    }

    private Tributo tributoCultura() {
        System.out.println("Digite o valor: ");
        double tributo = sc.nextDouble();
        return new Cultura(tributo);
    }


    private void areaGeometrica() {
        System.out.println("\nEscolha a forma geométrica:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Círculo");
        System.out.println("0 - Voltar ao menu principal");

        int op = sc.nextInt();
        GeometricForm forma = null;

        switch (op) {
            case 1 -> forma = criarQuadrado();
            case 2 -> forma = criarRetangulo();
            case 3 -> forma = criarCirculo();
            case 0 -> { return; }
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        System.out.printf("A área é: %.2f", forma.getArea());
    }

    private GeometricForm criarQuadrado() {
        System.out.print("Digite o lado: ");
        double lado = sc.nextDouble();
        return new Square(lado);
    }

    private GeometricForm criarRetangulo() {
        System.out.print("Digite o comprimento: ");
        double comp = sc.nextDouble();
        System.out.print("Digite a largura: ");
        double larg = sc.nextDouble();
        return new Rectangle(comp, larg);
    }

    private GeometricForm criarCirculo() {
        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();
        return new Circle(raio);
    }
}