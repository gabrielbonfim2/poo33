package org.model;

public class Filme {
    private String titulo;
    private int duracao; // em minutos

    public Filme() {
        this.titulo = "O Senhor dos Anéis"; // Título fixo para exemplo
        this.duracao = 180; // Duração fixa para exemplo
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }
}
