package com.algorithms.graph;

import com.algorithms.graph.estrutura.Lista;
import com.algorithms.graph.estrutura.Nodo;

import java.util.*;

public class Grafo {

    private Lista<Vertice> vertices = new Lista<>();
    private int qtdVertices;
    private boolean direcionado;


    public Grafo(int qtdVertices, boolean direcionado) {
        this.qtdVertices = qtdVertices;
        this.direcionado = direcionado;
        this.add();
    }

    private void add(){
        for (int i = 0; i < this.qtdVertices; i++){
            this.vertices.add(new Vertice(i));
        }
    }

    public void dijkstra(Vertice sourceVertex) {
        sourceVertex.setDistanciaMin(0);
        PriorityQueue<Vertice> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);
        while (!priorityQueue.isEmpty()) {
            Vertice vertex = priorityQueue.poll();
            for (Aresta aresta : vertex.getArestas()) {
                Vertice v = aresta.getDestino();
                double weight = aresta.getPeso();
                double minDistance = vertex.getDistanciaMin() + weight;
                if (minDistance < v.getDistanciaMin()) {
                    priorityQueue.remove(vertex);
                    v.setPrecedente(vertex);
                    v.setDistanciaMin(minDistance);
                    priorityQueue.add(v);
                }
            }
        }
    }

    public void getMenorCaminhoGrafo(Vertice targetVerte) {
        Lista<Integer> path = new Lista<>();
        for (Vertice vertex = targetVerte; vertex != null; vertex = vertex.getPrecedente()) {
            path.add(vertex.getIndex());
        }
        this.ordemReversa(path.getInicio());
    }


    public void ordemReversa(Nodo<Integer> vertice){
        if(vertice == null){
            return;
        }
        Nodo<Integer> prox = vertice.getProximo();
        this.ordemReversa(prox);
        System.out.print(vertice.getValor()+" ");
    }


    public void addAresta(int origem, int destino, int peso){
        Vertice verticeOrigem = this.vertices.get(origem);
        Vertice verticeDestino = this.vertices.get(destino);
        if(this.direcionado){
            verticeDestino.getArestas().add(new Aresta(peso, verticeOrigem));
        }
        verticeOrigem.getArestas().add(new Aresta(peso, verticeDestino));
    }

    public Lista<Vertice> getVertices() {
        return vertices;
    }
}
