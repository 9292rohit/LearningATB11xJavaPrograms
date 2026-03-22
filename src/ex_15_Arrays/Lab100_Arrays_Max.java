package ex_15_Arrays;

public class Lab100_Arrays_Max {
    public static void main(String[] args) {
        int[] array = {1,52,3,4,5,6,10,20,30,40,55};

        int max_output = give_me_max(array);
        System.out.println(max_output);
        
    }

    private static int give_me_max(int[] array) {

        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
