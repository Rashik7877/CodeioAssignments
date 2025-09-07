public class TheReportCard{
    public static void main(String[] args) {
        int marks = 54 ;
        if (marks >= 90){
            System.out.println("A");
        }
        else if (marks >= 75 && marks < 90) {
            System.out.println("B");
        }
        else if (marks >= 50 && marks < 75) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}