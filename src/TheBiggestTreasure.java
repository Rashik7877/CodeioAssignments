public class TheBiggestTreasure {
    public static void main(String[] args) {
        int a = 100 ;
        int b = 10;
        int c = 1000 ;
        if (a > b ) {
            if (a > c) {
                System.out.println("a is largest");
            } else {
                System.out.println("c is largest");
            }
        }
        else {
            if (b > c) {
                System.out.println("b is largest");
            } else {
                System.out.println("c is largest");
            }
        }
    }
}