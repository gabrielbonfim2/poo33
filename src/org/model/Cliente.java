package org.model;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente() {
        this.nome = "João"; // Nome fixo para exemplo
        this.cpf = "123.456.789-00"; // CPF fixo para exemplo
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
