
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Piirileikki {
    
    public int viimeinen(int n) {
        double x = Math.log(n)/Math.log(2);
        int logi = (int) Math.floor(x);
        int potenssi = (int)Math.pow(2, logi);
        int erotus = n - potenssi;
        int vika = 2*erotus + 1;
        return vika;
    }
}
