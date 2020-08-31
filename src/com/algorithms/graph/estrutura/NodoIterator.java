package com.algorithms.graph.estrutura;

import java.util.Iterator;

public class NodoIterator<T> implements Iterator<T> {

    private Nodo<T> atual;

    public NodoIterator(Lista<T> lista) {
        this.atual = lista.getInicio();
    }

    @Override
    public boolean hasNext() {
        return atual != null;
    }

    @Override
    public T next() {
        T valor = this.atual.getValor();
        this.atual = this.atual.getProximo();
        return valor;
    }
}
