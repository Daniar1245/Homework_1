import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        String studentRD;

        final int NUM = 50;

        String word = "How many?";

        studentRD = (word + " " + NUM);

        System.out.println(studentRD);


        if (NUM < 0) {
            System.out.println("you saved a negative number");
        } else if (NUM > 0) {
            System.out.println("you saved a positive number");
        } else {
            System.out.println("you saved zero");
        }

        Scanner studentD = new Scanner(System.in);
        System.out.println("What is your name?");
        String student = studentD.nextLine();
        System.out.println("Hello" + "  " + student);
    }
}