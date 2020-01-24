import java.util.*;

public class Ruudukko {
    int[][] muodosta(int n) {
        int[][] multi = new int[n][n];
        
        for (int r = 0; r < n; r++) {
            //System.out.println("Rivi: " + r);
            for (int i = 0; i < n; i++) {
                
                //System.out.println("Sarake: " + i);
                multi[r][i] = 0;
                int luku = 0;
                boolean noexit = true;
                
                while(noexit) {
                    noexit = false;
                
                    // check left
                    for (int j = 0; j < i; j++) {
                        if (multi[r][j] == luku) {
                            luku++;
                            noexit = true;
                        }
                    }
                    // check up
                    for (int k = 0; k < r; k++) {
                        if (multi[k][i] == luku) {
                            luku++;
                            noexit = true;
                        }
                    }
                }
                
                multi[r][i] = luku;
            }
        }
        
        return multi;
    }
}
