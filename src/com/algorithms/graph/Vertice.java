package com.algorithms.graph;

import com.algorithms.graph.estrutura.Lista;

public class Vertice implements Comparable<Vertice>{

    private Lista<Aresta> arestas;
    private int index = 0;
    private double distanciaMin = Double.MAX_VALUE;
    private Vertice precedente;


    public Vertice(int index) {
        this.arestas = new Lista<>();
        this.index = index;
    }

    public Lista<Aresta> getArestas() {
        return arestas;
    }

    public int getIndex() {
        return index;
    }

    public double getDistanciaMin() {
        return distanciaMin;
    }

    public void setDistanciaMin(double distanciaMin) {
        this.distanciaMin = distanciaMin;
    }

    public Vertice getPrecedente() {
        return precedente;
    }

    public void setPrecedente(Vertice precedente) {
        this.precedente = precedente;
    }

    @Override
    public int compareTo(Vertice o) {
        return Double.compare(this.distanciaMin, o.getDistanciaMin());
    }
}
