package br.com.AT3;

import java.util.ArrayList;

public class Agencia {

    String nome;
    ArrayList<Moto> listaMoto = new ArrayList<Moto>();
    public void adicionarMoto(Moto moto) {
        listaMoto.add(moto);
    }
    public int getQuantidadeMoto() {
        return listaMoto.size();
    }
}