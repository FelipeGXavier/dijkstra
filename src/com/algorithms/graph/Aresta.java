package com.algorithms.graph;

public class Aresta {

    private Vertice destino;
    private int peso;

    public Aresta(int peso, Vertice destino) {
        this.peso = peso;
        this.destino = destino;
    }

    public Vertice getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }

}
