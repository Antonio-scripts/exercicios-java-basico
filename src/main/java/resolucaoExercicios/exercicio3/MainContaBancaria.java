package resolucaoExercicios.exercicio3;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Déposito inicial: ");
        double deposito = sc.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.CriarContaBancaria(deposito);

        while (true){
            System.out.println("=================================");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto.");
            System.out.println("6 - Verificar se a conta está usando cheque especial.");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> contaBancaria.consultarSaldo();
                case 2 -> contaBancaria.consultarChequeEspecial();
                case 3 -> {
                    System.out.println("Valor a dépositar: ");
                    double valor = sc.nextDouble();
                    contaBancaria.depositar(valor);
                }
                case 4 -> {
                    System.out.printf("Valor a sacar: ");
                    double valor = sc.nextDouble();
                    contaBancaria.sacar(valor);
                }
                case 5 -> {
                    System.out.printf("Valor do boleto: ");
                    double valor = sc.nextDouble();
                    contaBancaria.pagarBoleto(valor);
                }
                case 6 -> contaBancaria.verificarUsoChequeEspecial();

                case 0 -> {
                    return;
                }
                default -> System.out.printf("Opção invalida!");
            }
        }

    }
}
