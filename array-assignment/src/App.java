import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of student you want to enter :");
        int no_of_student = scn.nextInt();
        String[] names = new String[no_of_student];
        int[] marks = new int[no_of_student];
        for (int i = 0; i < no_of_student; i++) {
            System.out.println("Enter the name of student "+(i+1));
            String name = scn.next();
            System.out.println("Enter the mark of student "+(i+1));
            int mark = scn.nextInt();
            names[i] = name;
            marks[i] = mark;
        }
        for (int i = 0; i < no_of_student; i++) {
            System.out.println("Name: " + names[i] + " Marks: " + marks[i]);
        }
    }
}