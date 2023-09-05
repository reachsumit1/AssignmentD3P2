package Day3AssignmentPart2;

import java.util.Scanner;

public class UC2 {
    public static void main(String[] args) {

        int a;
        {
            System.out.println("Please Provide the Value of a ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
        }
        int b;
        {
            System.out.println("Please Provide the Value of b ");
            Scanner sc = new Scanner(System.in);
            b = sc.nextInt();
            System.out.println("The Output Value By Using Equal Method is: ");
            System.out.println(a == b);
        }


    }
}
