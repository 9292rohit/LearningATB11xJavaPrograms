package ex_13_Strings;

import java.util.logging.SocketHandler;

public class Lab091_String_split {
    public static void main(String[] args) {
        String fruits = "apple,banana,grapes";
        String[] Split = fruits.split(",");

        System.out.println(Split[0]);
        System.out.println(Split[1]);
        System.out.println(Split[2]);

    }
}
