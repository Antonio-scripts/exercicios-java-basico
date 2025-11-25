package resolucaoExercicios.exercicio3;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUsado;

    public void CriarContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.50;
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    public void consultarChequeEspecial() {
        System.out.printf("Limite total do cheque especial: R$ %.2f\n", chequeEspecial);
        System.out.printf("Cheque especial disponivel: R$ %.2f\n", (chequeEspecial - chequeEspecialUsado));
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor invalido ");
            return;
        }

        if (chequeEspecialUsado > 0) {
            System.out.println("Você está usando cheque especial. O depósito será usado para quitá-lo.");
            double taxa = chequeEspecialUsado * 0.20;
            double valorTotalQuitar = taxa + chequeEspecialUsado;

            if (valorDeposito < valorTotalQuitar) {
                double valorAbatido = valorDeposito / 1.20;
                chequeEspecialUsado -= valorAbatido;

                System.out.println("Parte do cheque especial foi abatido");
                System.out.printf("Novo saldo do cheque especial: R$ %.2f\n", chequeEspecialUsado);
                return;
            }
            valorDeposito -= valorTotalQuitar;
            chequeEspecialUsado = 0;

            System.out.printf("Cheque especial quitado");

            if (valorDeposito > 0) {
                saldo += valorDeposito;
            }
            System.out.printf("Saldo atual: R$ %.2f\n", saldo);
        }

        saldo += valorDeposito;
        System.out.println("Deposito realizado com sucesso!");
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.printf("Valor invalido");
            return;
        }

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f\n", saldo);
            return;
        }

        double limiteDisponivel = saldo + (chequeEspecial - chequeEspecialUsado);
        if (valor > limiteDisponivel) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        double valorFalta = valor - saldo;
        chequeEspecialUsado += valorFalta;
        saldo = 0;

        System.out.printf("Saque realizado usando cheque especial.\nValor usado do cheque especial: R$ %.2f\n", valorFalta);
    }


    public void pagarBoleto(double valor) {
        if (valor <= 0) {
            System.out.printf("Valor invalido");
            return;
        }

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Boleto pago com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f\n", saldo);
            return;
        }

        double limiteDisponivel = saldo + (chequeEspecial - chequeEspecialUsado);
        if (valor > limiteDisponivel) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        double valorFalta = valor - saldo;
        chequeEspecialUsado += valorFalta;
        saldo = 0;

        System.out.printf("Boleto pago usando cheque especial.\nValor usado do cheque especial: R$ %.2f\n", valorFalta);
    }

    public void verificarUsoChequeEspecial() {
        if (chequeEspecialUsado <= 0) {
            System.out.println("Cheque especial não está sendo ultilizado");
            return;
        }

        System.out.printf("Cheque especial sendo ultilizado: R$ %.2f\n", chequeEspecialUsado);
    }
}

