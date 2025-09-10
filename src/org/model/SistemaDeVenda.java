package org.model;

public class SistemaDeVenda {
    private Cinema cinema;
    private Funcionario funcionario;
    private Cliente cliente;

    public SistemaDeVenda() {
        this.cinema = new Cinema(); // Criando cinema de exemplo
        this.funcionario = new Funcionario(); // Criando funcionário de exemplo
        this.cliente = new Cliente(); // Criando cliente de exemplo
    }

    // Método para comprar ingresso
    public boolean comprarIngresso() {
        // Pegando a primeira sessão disponível para comprar ingresso
        Sessao sessao = cinema.getSalas().get(0).getSessoes().get(0);

        // Verifica se a sessão está aberta
        if (sessao.getStatus() == StatusSessao.ENCERRADA) {
            System.out.println("Sessão encerrada. Não é possível comprar ingresso.");
            return false;
        }

        // Verifica se ainda há ingressos disponíveis
        if (sessao.getIngressos().size() >= sessao.getMaxIngressos()) {
            System.out.println("Ingressos esgotados.");
            return false;
        }

        // Cria o ingresso e adiciona na sessão
        Ingresso ingresso = new Ingresso();
        sessao.getIngressos().add(ingresso);
        System.out.println("Ingresso comprado com sucesso!");
        return true;
    }
}
