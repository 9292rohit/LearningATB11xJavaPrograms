package ex_15_Arrays;

public class Lab104_Sum_of_Arrays {
    public static void main(String[] args) {
        int[] array = {1, 52, 3, 4, 5, 6, 10, 20, 30, 40, 55};

        int sum=0;

        for (int i=0; i < array.length;i++){
            sum = sum + array[i];

        }
        System.out.println(sum);
    }
}
