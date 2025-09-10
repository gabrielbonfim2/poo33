package org.model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int capacidade;
    private List<Sessao> sessoes;

    public Sala() {
        this.capacidade = 100; // Capacidade fixa para exemplo
        this.sessoes = new ArrayList<>();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void adicionarSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }
}

