package ex_08_Switch;

import java.util.Scanner;

public class Lab059_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which browser?");
        String browser = scanner.next();

        switch (browser){
            case "chrome":
                System.out.println("Start the chrome");
                System.out.println(".....");
                System.out.println("tc1");
                System.out.println("tc2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Execute the Edge code");
                break;
            default:
                System.out.println("No idea which browser is this");
                break;
        }
    }
}
