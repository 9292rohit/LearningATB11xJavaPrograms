package ex_15_Arrays;

import java.util.Scanner;

public class Lab110_Array_2d_Right_Angle_triangle_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number e.g. n=3");
        int n = scanner.nextInt();

        for (int i=n; i>0; i--){
            for (int j=1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
