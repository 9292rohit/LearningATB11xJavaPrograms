package Tasks;

public class Lab096_Count_Vowels {
    public static void main(String[] args) {
        String input = "Java Program to count Vowels and Consonants";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i<input.length();i++)
        {
            char ch = input.charAt(i);
            if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels = vowels + 1;
            } else {
                consonants = consonants+1;}

        }

        System.out.println("Number of vowels:" + vowels);
        System.out.println("Number of consonants:" + consonants);

    }
}
