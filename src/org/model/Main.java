package org.model;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema();
        Sala sala1 = new Sala();
        Filme filme1 = new Filme();
        Sessao sessao1 = new Sessao();


        cinema.adicionarSala(sala1);
        cinema.adicionarFilme(filme1);

        // Adicionando sessões à sala
        sala1.adicionarSessao(sessao1);

        // Sistema de vendas e cliente tentando comprar ingresso
        SistemaDeVenda sistemaDeVenda = new SistemaDeVenda();
        sistemaDeVenda.comprarIngresso();
    }
}
