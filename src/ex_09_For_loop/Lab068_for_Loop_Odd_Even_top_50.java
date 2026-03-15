package ex_09_For_loop;

public class Lab068_for_Loop_Odd_Even_top_50 {
    public static void main(String[] args) {
        for (int i = 0; i<= 50 ; i++){
            if (i%2==0){
                System.out.println("Even ->"+" "+i);
            }
            else
            {
                System.out.println("Odd  ->"+" "+i);
        }
        }
    }
}
