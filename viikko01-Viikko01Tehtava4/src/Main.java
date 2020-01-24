
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Summataulukko s1 = new Summataulukko(new long[]{4, 1, 9, 2, 7, 3});
        System.out.println(s1.summa(1, 4)); //19
        System.out.println(s1.summa(3, 5)); //12
        System.out.println(s1.summa(0, 3)); //16 

        System.out.println("");

        Summataulukko s2 = new Summataulukko(new long[]{1, 2, 3, 4, 5, 6});
        System.out.println(s2.summa(0, 3)); //10
        System.out.println(s2.summa(4, 5)); //11
        System.out.println(s2.summa(0, 0)); //1 
        System.out.println(s2.summa(5, 5)); //6
    }

}
