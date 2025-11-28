package resolucaoExercicios.exercicio4;

import java.util.Scanner;

import resolucaoExercicios.exercicio4.clock.*;
import resolucaoExercicios.exercicio4.ingressos.*;
import resolucaoExercicios.exercicio4.usuarios.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Resolução do Exercício 4: Herança e Polimorfismo ===");

        while (true){
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("A - Cinema (Ingressos)");
            System.out.println("B - Loja (Gerente, Vendedor, Atendente)");
            System.out.println("C - Relógios (Mundo)");
            System.out.println("D - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = sc.nextLine().toUpperCase();

            switch (opcao) {
                case "A":
                    main.menuIngressos(sc);
                    break;
                case "B":
                    main.menuUsuarios(sc);
                    break;
                case "C":
                    main.menuRelogios();
                    break;
                case "D":
                    System.out.println("Encerrando sistema...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // --- RELÓGIO ---
    void menuRelogios() {
        System.out.println("\n--- Teste de Relógios ---");


        BRLClock relogioBr = new BRLClock();
        relogioBr.setHour(14);
        relogioBr.setMinute(30);
        relogioBr.setSecond(0);

        System.out.println("Horário Brasil (Criado): " + relogioBr.getTime());


        USClock relogioEua = new USClock();
        relogioEua.covert(relogioBr);

        System.out.println("Horário EUA (Convertido): " + relogioEua.getTime());

        System.out.println("Atualizando relógio EUA para 08:00 PM...");
        relogioEua.setHour(20); // 20h = 8 PM
        System.out.println("Horário EUA: " + relogioEua.getTime());

        BRLClock relogioBr2 = new BRLClock();
        relogioBr2.covert(relogioEua);
        System.out.println("Horário Brasil (Convertido de volta): " + relogioBr2.getTime());
    }

    // --- INGRESSOS ---
    void menuIngressos(Scanner sc) {
        System.out.println("\n--- Sistema Cinema ---");

        System.out.print("Nome do filme: ");
        String nomeFilme = sc.nextLine();

        System.out.print("Valor base do ingresso: R$ ");
        double valor = Double.parseDouble(sc.nextLine());

        System.out.print("O filme é dublado? (S/N): ");
        boolean dublado = sc.nextLine().trim().equalsIgnoreCase("S");

        System.out.println("Selecione o tipo de ingresso:");
        System.out.println("1 - Inteira (Padrão)");
        System.out.println("2 - Meia Entrada");
        System.out.println("3 - Família");
        System.out.print("Opção: ");

        int tipo = sc.nextInt();
        Ingresso ingresso = null;

        switch (tipo) {
            case 1:
                ingresso = new Ingresso(valor, nomeFilme, dublado) {
                    @Override
                    public double valorReal() {
                        return getValor();
                    }
                };
                break;
            case 2:
                ingresso = new MeiaEntrada(valor, nomeFilme, dublado);
                break;
            case 3:
                System.out.print("Quantidade de pessoas: ");
                int pessoas = sc.nextInt();
                ingresso = new IngressoFamilia(valor, nomeFilme, dublado, pessoas);
                break;
            default:
                System.out.println("Tipo inválido!");
                return;
        }

        System.out.println("--- Resumo ---");
        System.out.println("Filme: " + ingresso.getNomeFilme());
        System.out.printf("Valor final a pagar: R$ %.2f\n", ingresso.valorReal());
    }

    // --- USUÁRIOS ---
    void menuUsuarios(Scanner sc) {
        System.out.println("\n--- Sistema de Usuários ---");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        System.out.println("3 - Atendente");
        System.out.print("Tipo de usuário: ");
        int tipo = sc.nextInt();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        Usuario usuario = null;

        switch (tipo) {
            case 1:
                usuario = new Gerente(nome, email, senha);
                break;
            case 2:
                usuario = new Vendedor(nome, email, senha, 0);
                break;
            case 3:
                usuario = new Atendente(nome, email, senha, 0.0);
                break;
            default:
                System.out.println("Tipo inválido!");
                return;
        }

        boolean sessaoAtiva = true;
        while (sessaoAtiva) {
            System.out.println("\n--- Menu do Usuário: " + usuario.getNome() + " ---");
            System.out.println("1 - Login");
            System.out.println("2 - Alterar Dados");
            System.out.println("3 - Alterar Senha");
            System.out.println("4 - Logoff (Sair deste menu)");

            if (usuario instanceof Gerente) {
                System.out.println("5 - [Gerente] Gerar Relatório");
                System.out.println("6 - [Gerente] Consultar Vendas");
            } else if (usuario instanceof Vendedor) {
                System.out.println("5 - [Vendedor] Realizar Venda");
                System.out.println("6 - [Vendedor] Consultar Minhas Vendas");
            } else if (usuario instanceof Atendente) {
                System.out.println("5 - [Atendente] Receber Pagamento");
                System.out.println("6 - [Atendente] Fechar Caixa");
            }

            System.out.print("Escolha: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    usuario.login();
                    break;
                case 2:
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = sc.nextLine();
                    usuario.alterarDados(novoNome, novoEmail);
                    break;
                case 3:
                    System.out.print("Nova senha: ");
                    String novaSenha = sc.nextLine();
                    usuario.alterarSenha(novaSenha);
                    break;
                case 4:
                    usuario.logoff();
                    sessaoAtiva = false;
                    break;
                case 5:
                    if (usuario instanceof Gerente) ((Gerente) usuario).gerarRelatorioFinanceiro();
                    if (usuario instanceof Vendedor) ((Vendedor) usuario).realizarVenda();
                    if (usuario instanceof Atendente) {
                        System.out.print("Valor recebido: ");
                        double val = sc.nextDouble();
                        ((Atendente) usuario).receberPagamento(val);
                    }
                    break;
                case 6:
                    if (usuario instanceof Gerente) ((Gerente) usuario).consultarVendas();
                    if (usuario instanceof Vendedor) ((Vendedor) usuario).consultarVendas();
                    if (usuario instanceof Atendente) ((Atendente) usuario).fecharCaixa();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}