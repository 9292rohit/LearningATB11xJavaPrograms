package ex_15_Arrays;

public class Lab101_Arrays_Min {
    public static void main(String[] args) {
        int[] array = {1, 52, 3, 4, 5, 6, 10, 20, 30, 40, 55};

        int min_output = give_me_min(array);
        System.out.println(min_output);



    }

    static int give_me_min(int[] array) {
        int min = array[0];
        for (int i=0;i< array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;

    }


}
