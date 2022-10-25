package br.com.At2;

import java.util.ArrayList;

public class Sacolao {
    String nome;
    ArrayList<Fruta> listaFruta = new ArrayList<Fruta>();

    public void adicionarFruta(Fruta fruta) {
        listaFruta.add(fruta);
    }

    public int getQuantidadeFruta() {
        return listaFruta.size();

    }

    public double total(){

        double vtotal = 0;

        for (Fruta fruta : listaFruta) {
            vtotal += fruta.getValor();
        }

        return vtotal;
    } 

}