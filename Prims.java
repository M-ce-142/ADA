import java.util.*;

public class Prims {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int cost[][] = new int[n][n];

        System.out.println("Enter adjacency matrix (use 999 for no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        int visited[] = new int[n];
        visited[0] = 1;

        int minCost = 0;

        System.out.println("Edges in MST:");

        for (int k = 1; k < n; k++) {
            int min = 999, u = 0, v = 0;

            for (int i = 0; i < n; i++) {
                if (visited[i] == 1) {
                    for (int j = 0; j < n; j++) {
                        if (visited[j] == 0 && cost[i][j] < min) {
                            min = cost[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }

            System.out.println(u + " - " + v + " = " + min);
            minCost += min;

            visited[v] = 1;
        }

        System.out.println("Total cost = " + minCost);
    }
}
