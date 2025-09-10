package org.model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String nome;
    private List<Sala> salas;
    private List<Filme> filmes;

    public Cinema() {
        this.nome = "CineMax"; // Nome fixo para exemplo
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void adicionarSala(Sala sala) {
        this.salas.add(sala);
    }

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }
}
