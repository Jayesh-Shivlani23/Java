//Product of 2 numbers by taking input from user

import java.util.*;

public class product_with_input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println(product);
        sc.close();
    }
}
