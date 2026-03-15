package ex_10_For_loop;

public class Lab070_for_Loop_continue {
    public static void main(String[] args) {
        for (int i = 0; i<= 9 ; i++){
            if (i==5){
                continue; // skip the number and will continue for the next condition
            }
            System.out.println(i);
        }
    }
}
