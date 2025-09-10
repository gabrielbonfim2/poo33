package org.model;

public class Ingresso {
    private TipoIngresso tipo;
    private Sessao sessao;
    private Cliente cliente;

    public Ingresso() {
        this.tipo = TipoIngresso.INTEIRO; // Tipo de ingresso fixo
        this.sessao = new Sessao(); // Sessão de exemplo
        this.cliente = new Cliente(); // Cliente de exemplo
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

enum TipoIngresso {
    MEIO, INTEIRO
}
