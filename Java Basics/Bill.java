//Program to calculate bill with 18%GST

import java.util.*;

public class Bill {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;
        float tax = (18*total)/100;
        float bill = total + tax;

        System.out.println(bill);

        sc.close();
    }
}
