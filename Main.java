import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n (number of vertices): ");
    int n = sc.nextInt();

    int[][] graph = new int[n][n];

    System.out.println("Enter adjacency matrix (0/1) - G.E :");
    System.out.println("Enter 1 if edge i->j exists, else 0");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("G[" + (i+1) + "][" + (j+1) + "]: ");
            graph[i][j] = sc.nextInt();
        }
    }

    TransitiveClosure.transitiveClosure(graph, n);
    sc.close();
}
}









        
























