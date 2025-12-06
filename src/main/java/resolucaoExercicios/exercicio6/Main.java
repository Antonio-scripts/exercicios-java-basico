package resolucaoExercicios.exercicio6;

import resolucaoExercicios.exercicio6.calculadora.Operation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        Main main = new Main();

        System.out.println("Resolução exercicio 6 Praticando com Collections e Outras Classes Úteis do Java");

        while (true) {
            System.out.println("\n=== Menu principal ===");
            System.out.println("1 - Calculadora");
            System.out.println("2 - Formatação");
            System.out.println("0 - Sair");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> main.calculadora();
                case 2 -> main.formatacao();
                case 0 -> {
                    System.out.println("Programa encerrado");
                    sc.close();
                    return;
                }
                default -> {
                    System.out.println("Opção invalida\n");
                }
            }
        }

    }

        void calculadora () {
            System.out.println("Informe o número da operação que deseja realizar (1 = sum, 2 = subtraction)");
            var operationOption = sc.nextInt();
            while (operationOption > 2 || operationOption < 1) {
                System.out.print("Opção inválida. Informe novamente (1 = SUM , 2 = SUBTRACTION): ");
                operationOption = sc.nextInt();
            }
            var selectedOperation = Operation.values()[operationOption - 1];
            System.out.print("Informe os números que seram usados separados por virgual: (ex: 1,2,3,4) ");
            var numbersInput = sc.next();
            var numbersArray = Arrays.stream(numbersInput.split(","))
                    .mapToLong(s -> Long.parseLong(s))
                    .toArray();
            var result = selectedOperation.getOperationCallBack().execute(numbersArray);
            var operationToShow = numbersInput.replaceAll(",", selectedOperation.getSignal());

            System.out.println(operationToShow + "  O resultado da operação " + selectedOperation.name() + " é: " + result);

            sc.nextLine();
        }

        void formatacao() {
            System.out.println("\nInforme o número:");
            String entrada = sc.nextLine();


            if (entrada == null || entrada.trim().isEmpty()) {
                System.out.println("Número invalido");
                return;
            }

            String numero = entrada.replaceAll("\\D", "");
            String resposta;

            switch (numero.length()) {
                case 8:
                    resposta = "Telefone fixo " + numero.replaceFirst("(\\d{4})(\\d{4})", "$1-$2");
                    break;
                case 9:
                    resposta = "Telefone Celular " + numero.replaceFirst("(\\d{5})(\\d{4})", "$1-$2");
                    break;
                case 10:
                    resposta = "Telefone fixo " + numero.replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "($1) $2-$3");
                    break;
                case 11:
                    resposta = "Telefone Celular " + numero.replaceFirst("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
                    break;
                default:
                    resposta = "Número inválido: quantidade de dígitos não corresponde a telefone fixo ou celular.";
                    break;
            }

            System.out.println(resposta);

        }
}