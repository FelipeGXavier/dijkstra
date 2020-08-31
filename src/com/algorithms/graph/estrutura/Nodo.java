package com.algorithms.graph.estrutura;

public class Nodo<T> {

    private Nodo<T> proximo;
    private int index;
    private T valor;

    public Nodo(T valor, int index) {
        this.valor = valor;
        this.index = index;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }

    public T getValor() {
        return valor;
    }

    public int getIndex() {
        return index;
    }
}
