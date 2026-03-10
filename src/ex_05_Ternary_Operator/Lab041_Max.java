package ex_05_Ternary_Operator;

public class Lab041_Max {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));

        int max =  x > y ? x : y;
        String max1 = x > y ? "x is max" : "y is max";

        System.out.println(max);
        System.out.println(max1);



    }
}
