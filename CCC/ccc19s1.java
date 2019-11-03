import java.io.*;

public class ccc19s1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        String ln = br.readLine();
        int [][] grid = {{1, 2}, {3, 4}};
        int H = 0, V = 0;

        for (int i = 0; i<ln.length(); i++) {
            if (ln.charAt(i)=='H') {
                H++;

            } else {
                V++;

            }
        }

        H = H%2;
        V = V%2;


        if (H==1) {
            int t1 = grid[0][0], t2 = grid[0][1];
            grid[0][0] = grid[1][0];
            grid[0][1] = grid[1][1];
            grid[1][0] = t1;
            grid[1][1] = t2;
        }

        if (V==1) {
            int t1 = grid[0][0], t2 = grid[1][0];
            grid[0][0] = grid[0][1];
            grid[1][0] = grid[1][1];
            grid[0][1] = t1;
            grid[1][1] = t2;
        }

        for (int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }




    }
}
