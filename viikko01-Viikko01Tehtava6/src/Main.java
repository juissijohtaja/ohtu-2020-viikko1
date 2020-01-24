import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Ruudukko r = new Ruudukko();
        int[][] u = r.muodosta(n);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(u[i][j]+" ");
            }
            System.out.println();
        }
    }
}
