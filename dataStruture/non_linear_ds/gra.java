// this is the graph data structure using adjaceny list with array of arraylist 

import java.util.ArrayList;

public class gra {

    static class Edge {
        int s;
        int d;
        int wt;
        // wt for weight graph

        public Edge(int s, int d, int wt) {
            this.s = s;
            this.d = d;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        // this loops makes null place to empty in the arrayList If this does not run or
        // implemented then this code will show the error
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // for adjaceny weighted graph we simply just add the weight by wt
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        // print graph
        for (int i = 0; i < graph.length; i++) {

            System.out.print(i + " -> ");

            for (int j = 0; j < graph[i].size(); j++) {

                Edge e = graph[i].get(j);

                System.out.print(e.d + " ");
            }

            System.out.println();
        }

        // now Printing neighbours
        System.out.println(" Printing neighbours of 1");
        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);

            System.out.println(e.d + " ," + e.wt);
        }

    }
}