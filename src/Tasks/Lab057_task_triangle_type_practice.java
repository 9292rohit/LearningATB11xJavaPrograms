package Tasks;

import java.util.Scanner;

public class Lab057_task_triangle_type_practice {
    public static void main (String args []){

        int a = 10;
        int b = 10;
        int c = 10;

        if (a==b && b==c && a==c){
            System.out.println("Triangle is Equilateral Triangle");
            System.exit(0);
        }
        if (a==b || a==c || b==c){
            System.out.println("Triangle is Isosceles Triangle");
            System.exit(0);
       }
        if (a!=b && a!=c && b!=c){
            System.out.println("Triangle is Scalene Triangle");
            System.exit(0);
        }

    }
}
