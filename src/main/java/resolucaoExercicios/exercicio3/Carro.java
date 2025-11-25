package resolucaoExercicios.exercicio3;

public class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = true;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligarCarro() {
        if (ligado == true) {
            System.out.println("O carro já está ligado");
            return;
        }
        ligado = true;
        System.out.println("O carro foi ligado");
    }

    public void desligarCarro() {
        if (ligado == false) {
            System.out.println("O carro já está desligado");
            return;
        }
        if (velocidade > 0) {
            System.out.printf("O carro só pode ser desligado se estiver parado");
            return;
        }
        if (marcha > 1) {
            System.out.printf("O Carro só pode ser desligado se estiver no ponto morto");
        }
        ligado = false;
        System.out.println("O carro foi desligado");
    }

    public void aumentarVelocidade() {
        if (ligado == false) {
            System.out.println("Carro desligado não pode acelerar");
            return;
        }
        if (marcha <= 0) {
            System.out.println("Carro em ponto morto não pode acelerar");
            return;
        }
        if (marcha == 1 && velocidade < 20 || marcha == 2 && velocidade > 20 && velocidade < 40 ||
                marcha == 3 && velocidade > 40 && velocidade < 60 || marcha == 4 && velocidade > 60 && velocidade < 80 ||
                marcha == 5 && velocidade > 80 && velocidade < 100 || marcha == 6 && velocidade > 100 && velocidade < 120) {
            velocidade++;
            System.out.println("Velocidade aumentou para: " + velocidade);
        } else {
            System.out.println("Para aumentar a velocidade é preciso aumentar a marcha");
        }
    }

    public void diminuirVelocidade() {
        if (ligado == false) {
            System.out.println("Carro está desligado");
            return;
        }
        if (marcha <= 0) {
            System.out.println("Carro está parado ");
            return;
        }
        if (marcha == 1 && velocidade < 20 || marcha == 2 && velocidade > 20 && velocidade < 40 ||
                marcha == 3 && velocidade > 40 && velocidade < 60 || marcha == 4 && velocidade > 60 && velocidade < 80 ||
                marcha == 5 && velocidade > 80 && velocidade < 100 || marcha == 6 && velocidade > 100 && velocidade < 120) {
            velocidade--;
            System.out.println("Velocidade diminui para " + velocidade);
        } else {
            System.out.printf("Para diminuir a velocidade é preciso diminuir a marcha");
        }

    }

    public void trocarMarcha(int marchaDesejada) {
        if (ligado == false) {
            System.out.println("O carro está desligado");
            return;
        }
        if (marchaDesejada == marcha + 1) {
            if (marcha == 0 || marcha == 1 && velocidade <= 15 || marcha == 2 && velocidade > 15 && velocidade <= 35 ||
                    marcha == 3 && velocidade > 35 && velocidade <= 55 || marcha == 4 && velocidade > 55 && velocidade <= 75 ||
                    marcha == 5 && velocidade > 75 && velocidade <= 95) {
                marcha++;
                System.out.println("Marcha aumentada para: " + marcha);
            }
        }
        System.out.println("marcha invalida");

        if (marchaDesejada == marcha - 1) {
            if (marcha == 1 && velocidade <= 15 || marcha == 2 && velocidade > 15 && velocidade <= 35 ||
                    marcha == 3 && velocidade > 35 && velocidade <= 55 || marcha == 4 && velocidade > 55 && velocidade <= 75 ||
                    marcha == 5 && velocidade > 75 && velocidade <= 95 || marcha == 6 && velocidade > 95 && velocidade <= 115) {
                marcha--;
                System.out.println("Marcha reduzida para: " + marcha);
            }
        }
        System.out.println("marcha invalida");
    }

    public void direcao(String direcao) {
        if (ligado == false) {
            System.out.println("O carro está desligado");
            return;
        }
        if (velocidade <= 0) {
            System.out.println("Velocidade insuficiente");
            return;
        }
        if (velocidade > 40) {
            System.out.println("Velocidade alta demais");
            return;
        }
        if (direcao.equals("D")) {
            System.out.println("Virando para a direita");
        } else if (direcao.equals("E")) {
            System.out.println("Virando para a esquerda");
        } else {
            System.out.println("Direção invalida digite D para direita e E para esquerda");
        }
    }

    public void verificarVelocidade() {
        System.out.printf("Velocidade atual: %S \n", velocidade);
    }
}
