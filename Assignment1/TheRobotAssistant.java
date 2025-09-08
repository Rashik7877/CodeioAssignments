public class TheRobotAssistant{
    public static void main(String[] args) {
        System.out.println("1.Addition");
        System.out.println("2.Subraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int a = 45; //assinging number to variable a
        int b = 55; //assinging number to variable b
        int op = 2;
        if (op == 1){ //checking the op is 1
            System.out.println(a + b);
        }
        else if (op == 2) {
            System.out.println(a - b);
        }
        else if (op == 3) {
            System.out.println(a * b);
        }
        else if (op == 4){
            System.out.println(a / b);
        }
        else{
            System.out.println("invalid operator");
        }
    }
}