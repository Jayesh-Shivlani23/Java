import java.util.*;

public class area_of_square {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double side = sc.nextDouble();

        double area = side * side;

        System.out.println(area);

        sc.close();
    }
}
