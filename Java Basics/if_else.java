//Program to show if-else statements

import java.util.*;

public class if_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age : ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        }

        else {
            System.out.println("Not Adult");
        }

        sc.close();
    }
}
