package br.com.AT;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Palio";
        c1.cor = "Cinza";
        Carro c2 = new Carro();
         c2.nome = "Gol";
        c2.cor = "Preto";
        Carro c3 = new Carro();
        c3.nome = "C3";
        c3.cor  = "roxo";
        Agencia ag = new Agencia();
        ag.adicionarCarro(c1);
        ag.adicionarCarro(c2);
        ag.adicionarCarro(c3);
        int qtdeCarros = ag.getQuantidadeCarros();
        System.out.println("A liste de carro da agencia" + ag.nome + " possui: " + qtdeCarros + " carros. ");
    }
}
