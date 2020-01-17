
import java.io.*;
import java.util.*;

public class Main {

    public static int rekursio(File f, String s) throws IOException {
        //toteuta minut
        int counter = 0;
        File[] files = f.listFiles();
        
        for (int i = 0; i < files.length; i++) {
            //System.out.println(files[i].getName());
            if (files[i].getName().contains(s)) {
                counter++;
            }
            
            //System.out.println(files[i].isDirectory());
            if (files[i].isDirectory()) {
                counter += rekursio(files[i], s);
            }
        }        
        return counter;
    }
    
    public static int laske(String search) throws IOException { //ÄLÄ KOSKE TÄHÄN METODIIN
        File kansio = new File("test" + File.separator + "mockfiles");
        return rekursio(kansio, search);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(laske("txt"));
        System.out.println(laske("asd"));
        System.out.println(laske("rekursio"));
    }
}
