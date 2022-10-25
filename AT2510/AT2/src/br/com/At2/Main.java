package br.com.At2;

public class Main {
    public static void main(String[] args) {
        Fruta c1 = new Fruta();
        c1.nome = "Tomate";
        c1.valor = 1.99;
        Fruta c2 = new Fruta();
         c2.nome = "Banana";
         c2.valor = 5.00;
        Fruta c3 = new Fruta();
        c3.nome = "Kiwi";
        c3.valor = 7.55;
        Sacolao ag = new Sacolao();
        ag.adicionarFruta(c1);
        ag.adicionarFruta(c2);
        ag.adicionarFruta(c3);
        int qtdeFruta = ag.getQuantidadeFruta();
        System.out.println("A liste de Fruta da agencia" + ag.nome + " possui: " + qtdeFruta + " fruta. ");
        System.out.println("Preço total:" + ag.total());
    }
}


