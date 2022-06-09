import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // character array
        // char[] arr = {'a', 'h', 'u'};
        // System.out.println(arr.length); // print 3
        // System.out.println(arr[2]); // print u
        
        // char[] arr1 = new char[10];
        // // System.out.println(arr1.length); // print 10
        // // arr1[0] = 'p';
        // // System.out.println(arr1[9]);

        // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = sc.nextLine().charAt(0);
        // }

        // for (int j = 0; j < arr1.length; j++) {
        //     System.out.print(arr1[j] + " ");
        // }

        // int i = 0;
        // while (i < arr1.length) {
        //     arr1[i] = sc.nextLine().charAt(0);
        //     i++;
        // }
        
        // int j = 0;
        // do {
        //     System.out.println("Value at index " + j + ": " + arr1[j]);
        //     j++; 
        // } while (j < arr1.length);

        // System.out.println(j);

        int num = 2;
        
        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
