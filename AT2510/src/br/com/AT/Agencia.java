package br.com.AT;

import java.util.ArrayList;

public class Agencia {

    String nome;
    // crindo um lista de Carros do tipo Carro
    // um Arraylist de Carros
    ArrayList<Carro> listaCarros = new ArrayList<Carro>();

    // Crindo um metodo sem retorno,para incluir tipos de Carro
    // dentro da lista de carros.
    public void adicionarCarro(Carro carro) {
        listaCarros.add(carro);
    }

    // utilizando a propriedade slize da classe Arraylist para contar
    // a quantidade de carros da lista.
    public int getQuantidadeCarros() {
        return listaCarros.size();
    }
}
