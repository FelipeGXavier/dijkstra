package com.algorithms.graph.estrutura;

import java.util.Iterator;

public class Lista<T> implements Iterable<T> {

    private Nodo<T> inicio;
    private Nodo<T> fim;
    private int index;


    public void add(T valor) {
        Nodo<T> nodo = new Nodo<>(valor, this.index++);
        if (this.inicio == null) {
            this.inicio = nodo;
        } else {
            this.fim.setProximo(nodo);
        }
        this.fim = nodo;
    }

    public boolean vazio() {
        if (this.inicio == null) {
            return true;
        }
        return false;
    }

    public T get(int index) {
        if (!this.vazio()) {
            Nodo<T> aux = this.inicio;
            while (aux != null) {
                if (aux.getIndex() == index) {
                    return aux.getValor();
                }
                aux = aux.getProximo();
            }
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new NodoIterator<>(this);
    }

    public Nodo<T> getInicio() {
        return inicio;
    }
}
