package br.com.AT3;

public class Main {
    public static void main(String[] args) {
        Moto c1 = new Moto();
        c1.nome = "Palio";
        c1.cor = "Cinza";
        Moto c2 = new Moto();
         c2.nome = "Gol";
        c2.cor = "Preto";
        Moto c3 = new Moto();
        c3.nome = "C3";
        c3.cor  = "roxo";
        Agencia ag = new Agencia();
        ag.adicionarMoto(c1);
        ag.adicionarMoto(c2);
        ag.adicionarMoto(c3);
        int qtdeMoto = ag.getQuantidadeMoto();
        System.out.println("A liste de Moto da agencia" + ag.nome + " possui: " + qtdeMoto + " Moto. ");
    }
}


