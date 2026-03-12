package ex_06_Increament_Decrement_Operator;

public class Lab051_task_User_Input_Max_value {

    public static void main(String[] args) {
        String Name = args[0];
        String Age = args[1];
        String Salary = args[2];
        int Age1 = Integer.parseInt(Age);
        int Salary1 = Integer.parseInt(Salary);

        System.out.println(Name);
        System.out.println(Age1);
        System.out.println(Salary1);

        int Age2 = (int) Age1;
        int Salary2 = (int)Salary1;


        String max_result = Salary1 < Age2 ? "Max value" : "Min Value";
        System.out.println(max_result);

    }
}
