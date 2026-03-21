package Tasks;

import java.util.Scanner;

public class Lab057_z_task_triangle_class {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side1");
        int side1 = scanner.nextInt();
        System.out.println("Enter the side2");
        int side2 = scanner.nextInt();
        System.out.println("Enter the side3");
        int side3 = scanner.nextInt();

        // edge case ->
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("this is not triangle");
            System.exit(0);
        }
        // edge case ->
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.println("this is not triangle");
            System.exit(0);
        }

        // real logic
        if (side1 == side2 && side2==side3){
            System.out.println("Triangle is Equilateral Triangle");
        }
        else if (side1==side2 || side2==side3 ||side1==side3) {
            System.out.println("Triangle is Isosceles Triangle");
        }
        else {
            System.out.println("Triangle is Scalene Triangle");
        }
scanner.close();
    }
}

