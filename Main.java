package engiii_lista_gabriela;

import java.util.Date;

class Cliente {
    String nome;
    String CF;
    String CNH;

    void verificarCNH() {
    }

    void solicitarLocacao() {
    }
}

class Locacao {
    Date dataLocacao;
    int tempo;
    String finalidade;
    String local;
    double caucao;
    double valorCaucao;

    double calcularValorPagamento() {
        return 0.0;
    }

    double calcularValorCaucao() {
        return 0.0;
    }
}

class Carro {
    String marca;
    int ano;
    String placa;
    String modelo;

    void verificarAno() {
    }

    void verificarDisponibilidade() {
    }
}

class Devolucao {
    Date dataDevolucao;
    double quilometragem;

    void registrarDevolucao() {
    }

    double calcularMulta() {
        return 0.0;
    }
}

class Condicao {
    String local;
    String tipo;

    double calcularMultaPorDano() {
        return 0.0;
    }

    void registrarCondicao() {
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.verificarCNH();
        cliente.solicitarLocacao();

        Locacao locacao = new Locacao();
        double valorPagamento = locacao.calcularValorPagamento();
        double valorCaucao = locacao.calcularValorCaucao();

        Carro carro = new Carro();
        carro.verificarAno();
        carro.verificarDisponibilidade();

        Devolucao devolucao = new Devolucao();
        devolucao.registrarDevolucao();
        double multa = devolucao.calcularMulta();

        Condicao condicao = new Condicao();
        double multaPorDano = condicao.calcularMultaPorDano();
        condicao.registrarCondicao();
    }
}
