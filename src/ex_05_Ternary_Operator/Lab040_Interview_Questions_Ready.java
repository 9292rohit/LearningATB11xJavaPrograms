package ex_05_Ternary_Operator;

public class Lab040_Interview_Questions_Ready {
    public static void main(String[] args) {


//    Nested ternary
//result = condition1 ? experession1 : (condition2 ? expression2 : expression3);

    int number = 15;
    String result = (number > 10) ? (number > 20 ? "N>20" : "N<20") : "B";
    System.out.println(result);
}
}
