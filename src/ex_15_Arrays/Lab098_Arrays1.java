package ex_15_Arrays;

public class Lab098_Arrays1 {
    public static void main(String[] args) {
        // 1st way
        int [] marks = {1,2,3,4,5,6};

        // 2nd way
        int [] marks2 = new int[5];
        marks2[0] = 1;
        marks2[1] = 2;
        marks2[2] = 3;
        marks2[3] = 4;
        marks2[4] = 5;

        String names [] = new String[3]; // [] can be after or before identifier name
        names[0] = "Rohit";
        names[1] = "Sayali";
        names[2] = "Shravi";

        System.out.println(names[0]);

        boolean male_data [] = new boolean[2];
        male_data[0] = true;
        male_data[1] = false;
        System.out.println(male_data.length);
        System.out.println(male_data[1]);
        System.out.println(male_data[0]);

for (int i=0;i<male_data.length;i++){
    System.out.println(male_data[i]);
}

    }
}
