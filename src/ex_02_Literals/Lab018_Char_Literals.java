package ex_02_Literals;

public class Lab018_Char_Literals {
    public static void main (String[]  args) {
        char c1 = 'A';
        char c2 = '1';
        char c3 = 'g';
        char c4 = '!';
//        char c5 = "B"; // Double quotes are not allowed as single char is used
        char c6 = '_';
        char c7 = ' '; //blank space
        char c8 = ';';
        char c9 = '(';

//        Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("RohitPatil");
        System.out.println("Rohit Patil");
        System.out.println("Rohit"+new_line+"Patil");
        System.out.println("Rohit"+tab_line+"Patil");
        System.out.println("Rohit"+back_space+"Patil");
        System.out.println("Rohit"+carriage_return+"Patil");



    }
}
