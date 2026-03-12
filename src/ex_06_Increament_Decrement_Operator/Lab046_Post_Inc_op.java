package ex_06_Increament_Decrement_Operator;

public class Lab046_Post_Inc_op {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
        System.out.println(a);

//        post increment first print value then increase value
        int a_post = 20;
        System.out.println(a_post++);
        System.out.println(a_post);
    }
}
