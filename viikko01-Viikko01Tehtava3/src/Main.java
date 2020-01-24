public class Main {
    public static void main(String[] args) {
        Onnenluku o = new Onnenluku();
        System.out.println(o.tarkasta(7)); // true
        System.out.println(o.tarkasta(47)); // true
        System.out.println(o.tarkasta(7747)); // true
        System.out.println(o.tarkasta(123)); // false
        System.out.println(o.tarkasta(45));
        System.out.println(o.tarkasta(75));
        System.out.println(o.tarkasta(4));
        System.out.println(o.tarkasta(44));
        System.out.println(o.tarkasta(123456789));
    }
}
