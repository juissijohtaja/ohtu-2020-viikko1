public class Main {
    public static void main(String[] args) {
        Piirileikki p = new Piirileikki();
        System.out.println(p.viimeinen(1)); // 1
        System.out.println(p.viimeinen(2)); // 1
        System.out.println(p.viimeinen(3)); // 3
        System.out.println(p.viimeinen(4)); // 1
        System.out.println(p.viimeinen(5)); // 3
        System.out.println(p.viimeinen(6)); // 5
        System.out.println(p.viimeinen(7)); // 7
        System.out.println(p.viimeinen(8)); // 1
        System.out.println(p.viimeinen(9)); // 3
        System.out.println(p.viimeinen(10)); // 5
        System.out.println(p.viimeinen(11)); // 7
        System.out.println(p.viimeinen(12)); // 9
        System.out.println(p.viimeinen(13)); // 11
        System.out.println(p.viimeinen(14)); // 13
        System.out.println(p.viimeinen(15)); // 15
        System.out.println(p.viimeinen(16)); // 1
        System.out.println(p.viimeinen(32)); // 1
        System.out.println(p.viimeinen(64)); // 1
        System.out.println(p.viimeinen(128)); // 1
        System.out.println(p.viimeinen(123)); // 119
    }
}
