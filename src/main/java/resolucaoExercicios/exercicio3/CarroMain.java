package resolucaoExercicios.exercicio3;

import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();
        System.out.printf("Carro iniciado");

        while (true) {
            System.out.println("=======================");
            System.out.println("1 - Ligar Carro");
            System.out.println("2 - Desligar Carro");
            System.out.println("3 - Aumentar velocidade Carro");
            System.out.println("4 - Diminuir velocidade Carro");
            System.out.println("5 - Virar para esquerda ou direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar marcha");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> carro.ligarCarro();
                case 2 -> carro.desligarCarro();
                case 3 -> carro.aumentarVelocidade();
                case 4 -> carro.diminuirVelocidade();
                case 5 -> {
                    System.out.println("Digite D para direita e E para esquerda");
                    String direcao = sc.next().toUpperCase();
                    carro.direcao(direcao);
                }
                case 6 -> carro.verificarVelocidade();
                case 7 -> {
                    System.out.println("Digite a marcha desejada(1 a 6)");
                    int marchaDesejada = sc.nextInt();
                    carro.trocarMarcha(marchaDesejada);
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção invalida");
            }
        }
    }
}
