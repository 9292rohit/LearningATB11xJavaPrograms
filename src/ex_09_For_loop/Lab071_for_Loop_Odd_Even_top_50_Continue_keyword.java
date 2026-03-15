package ex_09_For_loop;

public class Lab071_for_Loop_Odd_Even_top_50_Continue_keyword {
    public static void main(String[] args) {
        for (int i = 0; i<= 50 ; i++){
            if (i%2!=0){
                System.out.println("Even ->"+" "+i);
                continue;
            }
            System.out.println("Odd  ->"+" "+i);
        }
    }
}
