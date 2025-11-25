package resolucaoExercicios.exercicio3;

public class PetshopBanho {
    private int nivelAgua;
    private int nivelShampoo;
    private boolean petNaMaquina;
    private boolean precisaLimparMaquina;
    private boolean petLimpo;
    private static final int MAXIMO_AGUA = 30;
    private static final int MAXIMO_SHAMPOO = 10;

    public PetshopBanho () {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.petNaMaquina = false;
        this.precisaLimparMaquina = false;
        this.petLimpo = false;
    }


    public void banharPet () {
        if (petNaMaquina == false) {
            System.out.println("É precisso um pet na maquina para dar banho");
            return;
        }
        if (nivelAgua < 10) {
            System.out.println("Água insuficiente reabasteça");
            return;
        }
        if (nivelShampoo < 2) {
            System.out.println("Shampoo insuficiente reabasteça");
            return;
        }

        precisaLimparMaquina = true;
        nivelAgua -= 10;
        nivelShampoo -= 2;
        petLimpo = true;

        System.out.println("O pet foi banhado!");
    }

    public void colocarPetMaquina() {
        if (petNaMaquina == true) {
            System.out.println("Um pet já está utilizando a maquina");
            return;
        }
        if (precisaLimparMaquina == true) {
            System.out.println("A maquina está suja é necessário limpa-la");
            return;
        }
        petNaMaquina = true;
        System.out.println("O pet foi colocado na maquina!");
    }

    public void retirarPetMaquina() {
        if (petNaMaquina == false) {
            System.out.println("Não tem pet na maquina");
            return;
        }
        petNaMaquina = false;
        precisaLimparMaquina = true;
        System.out.println("O pet foi retirado da maquina! ");
    }

    public void verificarPetBanho () {
        if (petNaMaquina == true) {
            System.out.println("A maquina de banho está sendo utilizada no momento");
        }
        System.out.println("A maquina de banho está livre");
    }

    public void abastecerAgua () {
        if (nivelAgua > MAXIMO_AGUA - 2) {
            System.out.println("A agua da maquina já está abastecida");
            return;
        }
        nivelAgua += 2;
        System.out.printf("A água foi abastecida em mais 2 litros e agora está em %sL \n", nivelAgua);
    }

    public void abastecerShampoo () {
        if (nivelShampoo > MAXIMO_SHAMPOO -2) {
            System.out.println("O shampoo já está abastecido");
            return;
        }
        nivelShampoo += 2;
        System.out.printf("O shampoo foi abastecida em mais 2 litros e agora está em %sL \n", nivelShampoo);

    }

    public void verificarNivelAgua () {
        System.out.println("Nivel de agua: " + nivelAgua);
    }

    public void verificarNivelShampoo () {
        System.out.println("Nivel de shampoo: " + nivelShampoo);
    }

    public void limparMaquina () {
        if (petNaMaquina == true) {
            System.out.println("Tem um pet na maquina retire para limpar");
            return;
        }
        if (precisaLimparMaquina == false) {
            System.out.println("A maquina não precisa ser limpa agora");
            return;
        }
        nivelAgua -= 3;
        nivelShampoo -= 1;
        precisaLimparMaquina = false;
        System.out.println("Processo de limpeza da maquina concluído!");
    }



}
