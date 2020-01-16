public class Main {
    public static void main(String[] args) {
        Onnenluku o = new Onnenluku();
        System.out.println(o.tarkasta(7)); // true
        System.out.println(o.tarkasta(47)); // true
        System.out.println(o.tarkasta(7747)); // true
        System.out.println(o.tarkasta(123)); // false
    }
}

