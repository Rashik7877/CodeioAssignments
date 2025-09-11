public class GradeCaclulator {
    public static void main(String[] args) {
        int marks = 50;
        char grade;
        if (marks >90){
            grade = "A";
            System.out.println(grade);
        }
        else if (marks > 74 && marks <91) {
            grade = "B";
            System.out.println(grade);
        }
        else if (marks > 49 && marks < 75) {
            grade="C";
            System.out.println(grade);
        }
        else {
            grade="F";
            System.out.println("Fail");
        }
    }
}