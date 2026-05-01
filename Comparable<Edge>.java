import java.util.*;

class Edge implements Comparable<Edge> {
    int u, v, w;

    Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    public int compareTo(Edge e) {
        return this.w - e.w;
    }
}

public class Kruskal {

    static int parent[];

    static int find(int i) {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }

    static void union(int i, int j) {
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        Edge edges[] = new Edge[e];

        System.out.println("Enter edges (u v weight):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            edges[i] = new Edge(u, v, w);
        }

        Arrays.sort(edges);

        parent = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = i;

        int minCost = 0;

        System.out.println("Edges in MST:");

        for (int i = 0; i < e; i++) {
            int u = edges[i].u;
            int v = edges[i].v;

            if (find(u) != find(v)) {
                System.out.println(u + " - " + v + " = " + edges[i].w);
                minCost += edges[i].w;
                union(u, v);
            }
        }

        System.out.println("Total cost = " + minCost);
    }
}
