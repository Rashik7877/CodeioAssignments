public class TheBiggestTreasure {
    public static void main(String[] args) {
        int a = 100 ;
        int b = 1000;
        int c = 1 ;
        if (a > b && a > c){
            System.out.println("A is largest");
        }
        else if (b > c && b > a) {
            System.out.println("B is largest");
        }
        else {
            System.out.println("C is largest");
        }
    }
}