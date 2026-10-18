public class TransitiveClosure {
    public static void transitiveClosure(int[][] graph, int n) {
    // T(0) matrix - from line 1 to 6
    int[][] T = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j || graph[i][j] == 1) {
                T[i][j] = 1;
            } else {
                T[i][j] = 0;
            }
        }
    }

    System.out.println("T(0) matrix:");
    printMatrix(T);

    // for k = 1 to n - from line 7 to 11
    for (int k = 0; k < n; k++) {
        int[][] Tk = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // t_ij(k) = t_ij(k-1) OR (t_ik(k-1) AND t_kj(k-1))
                Tk[i][j] = (T[i][j] == 1 || (T[i][k] == 1 && T[k][j] == 1)) ? 1 : 0;
            }
        }
        T = Tk; // T(k) becomes T(k-1) for next iteration
        System.out.println("T(" + (k + 1) + ") using k=" + (k + 1) + " as intermediate:");
        printMatrix(T);
    }

    System.out.println("Final Answer T(n) - Transitive Closure:");
    printMatrix(T);
}

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}



