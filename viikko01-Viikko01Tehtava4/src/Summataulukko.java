
import java.util.*;

public class Summataulukko {
    private long[] taulukko;

    Summataulukko(long[] taulukko) {
        this.taulukko = taulukko;
        
        long total = 0;
        for (int i = 0; i < taulukko.length; i++) {
            total += taulukko[i];
            taulukko[i] = total;
        }
    }

    long summa(int l, int r) {
        long tulos = 0;
        if (l>0) {
            tulos = this.taulukko[r] - this.taulukko[l-1];
        } else {
            tulos = this.taulukko[r];
        }
        return tulos;
    }
}
