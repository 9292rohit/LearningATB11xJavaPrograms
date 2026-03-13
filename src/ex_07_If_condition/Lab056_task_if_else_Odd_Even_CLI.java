package ex_07_If_condition;

public class Lab056_task_if_else_Odd_Even_CLI {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        String result = (a1 %2 == 0) ? "Number is even" : "Number is odd";
        String result1 = (b1 %2 == 0) ? "Number is even" : "Number is odd";

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(result);
        System.out.println(result1);

    }
}
