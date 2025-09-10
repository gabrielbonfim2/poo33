package org.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessao {
    private Filme filme;
    private Sala sala;
    private Date horario;
    private StatusSessao status;
    private int maxIngressos;
    private List<Ingresso> ingressos;

    public Sessao() {
        this.filme = new Filme(); // Criação do filme de exemplo
        this.sala = new Sala(); // Criação da sala de exemplo
        this.horario = new Date(); // Data e hora atual
        this.maxIngressos = sala.getCapacidade(); // Max ingressos é a capacidade da sala
        this.status = StatusSessao.ABERTA; // Sessão começa aberta
        this.ingressos = new ArrayList<>();
    }

    public Filme getFilme() {
        return filme;
    }

    public Sala getSala() {
        return sala;
    }

    public Date getHorario() {
        return horario;
    }

    public StatusSessao getStatus() {
        return status;
    }

    public int getMaxIngressos() {
        return maxIngressos;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void encerrarSessao() {
        this.status = StatusSessao.ENCERRADA;
    }
}

enum StatusSessao {
    ABERTA, ENCERRADA
}
