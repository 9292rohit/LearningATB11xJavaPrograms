package Tasks;

public class Lab043_task_grades_ABCDF
{
    public static void main(String[] args) {
        float A = 91f;
        float B = 82.55f;
        float C = 70.55f;
        float D = 60.55f;
        float F = 40.55f;

        String result = (A > 90) ? "Grade A" : (A > 80)? "Grade B" : (A > 70)? "Grade C": (A > 60)? "Grade D" : "Grade F";
        String result1 = (B > 90) ? "Grade A" : (B > 80)? "Grade B" : (B > 70)? "Grade C": (B > 60)? "Grade D" : "Grade F";
        String result2 = (C > 90) ? "Grade A" : (C > 80)? "Grade B" : (C > 70)? "Grade C": (C > 60)? "Grade D" : "Grade F";
        String result3 = (D > 90) ? "Grade A" : (D > 80)? "Grade B" : (D > 70)? "Grade C": (D > 60)? "Grade D" : "Grade F";
        String result4 = (F > 90) ? "Grade A" : (F > 80)? "Grade B" : (F > 70)? "Grade C": (F > 60)? "Grade D" : "Grade F";
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


    }
}
