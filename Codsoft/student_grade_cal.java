import java.util.Scanner;

public class student_grade_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in JAVA:");
        int JAVA = sc.nextInt();

        System.out.println("Enter your marks in PYTHON:");
        int PYTHON = sc.nextInt();

        System.out.println("Enter your marks in C++:");
        int cpp = sc.nextInt();

        int total_marks= JAVA + PYTHON + cpp;
        System.out.println("Total marks:"+total_marks);

        int Avg_per = (JAVA + PYTHON + cpp)/3;
        System.out.println("Total avg percentage:"+Avg_per);
        
        if(Avg_per> 90){
            System.out.println("GRADE A+");
        }
        else if(Avg_per <= 90 &&Avg_per >80){
            System.out.println("GRADE A");
        }
        else if(Avg_per <= 80 &&Avg_per >70){
            System.out.println("GRADE A");
        }
        else if(Avg_per <= 70 &&Avg_per >60){
            System.out.println("GRADE A");
        }
        else if(Avg_per <= 40 &&Avg_per >50){
            System.out.println("GRADE A");
        }
        else
        {
            System.out.println("FAil");
        }
    }
}


