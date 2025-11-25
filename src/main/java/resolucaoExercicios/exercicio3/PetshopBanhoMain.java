package resolucaoExercicios.exercicio3;

import java.util.Scanner;

public class PetshopBanhoMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PetshopBanho petshopBanho = new PetshopBanho();
        System.out.println("==== Banho Petshop ====");

        while (true) {
            System.out.println("=======================");
            System.out.println("1 - Dar banho no pet;");
            System.out.println("2 - Abastecer com água;");
            System.out.println("3 - Abastecer com shampoo;");
            System.out.println("4 - verificar nivel de água;");
            System.out.println("5 - verificar nivel de shampoo;");
            System.out.println("6 - verificar se tem pet no banho");
            System.out.println("7 - colocar pet na maquina;");
            System.out.println("8 - retirar pet da máquina;");
            System.out.println("9 - limpar maquina.");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> petshopBanho.banharPet();
                case 2 -> petshopBanho.abastecerAgua();
                case 3 -> petshopBanho.abastecerShampoo();
                case 4 -> petshopBanho.verificarNivelAgua();
                case 5 -> petshopBanho.verificarNivelShampoo();
                case 6 -> petshopBanho.verificarPetBanho();
                case 7 -> petshopBanho.colocarPetMaquina();
                case 8 -> petshopBanho.retirarPetMaquina();
                case 9 -> petshopBanho.limparMaquina();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção invalida");
            }

        }
    }
}
