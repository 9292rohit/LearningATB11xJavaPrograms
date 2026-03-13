package Tasks;

public class Lab050_task_Pre_Post_Inc_op {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);  // 11+11+12=34
        System.out.println(a); //13
    }
}
