package ex_15_Arrays;

public class Lab103_Arrays_reverse {
    public static void main(String[] args) {
        int[] array = {1, 52, 3, 4, 5, 6, 10, 20, 30, 40, 55};
        for (int i=array.length-1; i >=0;i--){
            System.out.println(array[i]);
        }
    }
}
