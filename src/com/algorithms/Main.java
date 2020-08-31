package com.algorithms;


import com.algorithms.graph.Grafo;
import com.algorithms.graph.Vertice;

public class Main {

    public static void main(String[] args) {

        Grafo grafo = new Grafo(5, true);
        grafo.addAresta(0, 1, 1);
        grafo.addAresta(0, 3, 3);
        grafo.addAresta(0, 4, 10);
        grafo.addAresta(1, 2, 5);
        grafo.addAresta(2, 4, 1);
        grafo.addAresta(3, 2, 2);
        grafo.addAresta(3, 4, 6);
        grafo.dijkstra(grafo.getVertices().get(0));
        for (Vertice v : grafo.getVertices()) {
            System.out.print("Vértice " + v.getIndex() + " → ");
            grafo.getMenorCaminhoGrafo(v);
            System.out.print(" | (distância) " + v.getDistanciaMin());
            System.out.println();
        }
        System.out.println();


        Grafo grafo2 = new Grafo(6, true);
        grafo2.addAresta(0,1,15);
        grafo2.addAresta(0,2,9);
        grafo2.addAresta(1,3,2);
        grafo2.addAresta(2,4,16);
        grafo2.addAresta(2,3,3);
        grafo2.addAresta(2,1,4);
        grafo2.addAresta(3,4,6);
        grafo2.addAresta(3,5,21);
        grafo2.addAresta(4,5,7);
        grafo2.dijkstra(grafo2.getVertices().get(0));
        for (Vertice v : grafo2.getVertices()) {
            System.out.print("Vértice " + v.getIndex()  + " → ");
            grafo2.getMenorCaminhoGrafo(v);
            System.out.print(" | (distância) " + v.getDistanciaMin());
            System.out.println();
        }
        System.out.println();

        Grafo grafo3 = new Grafo(12, false);
        grafo3.addAresta(0, 1, 4);
        grafo3.addAresta(0, 4, 7);
        grafo3.addAresta(1, 5, 8);
        grafo3.addAresta(1, 2, 3);
        grafo3.addAresta(2, 6, 6);
        grafo3.addAresta(2, 3, 6);
        grafo3.addAresta(3, 7, 8);
        grafo3.addAresta(4, 5, 8);
        grafo3.addAresta(5, 6, 6);
        grafo3.addAresta(6, 7, 8);
        grafo3.addAresta(4, 8, 2);
        grafo3.addAresta(5, 9, 3);
        grafo3.addAresta(6, 10, 1);
        grafo3.addAresta(7, 11, 8);
        grafo3.addAresta(8, 9,3);
        grafo3.addAresta(9, 10, 1);
        grafo3.addAresta(10, 11, 8);
        grafo3.dijkstra(grafo3.getVertices().get(0));
        for (Vertice v : grafo3.getVertices()) {
            System.out.print("Vértice " + v.getIndex()   + " → ");
            grafo3.getMenorCaminhoGrafo(v);
            System.out.print(" | (distância) " + v.getDistanciaMin());
            System.out.println();
        }




    }
}
