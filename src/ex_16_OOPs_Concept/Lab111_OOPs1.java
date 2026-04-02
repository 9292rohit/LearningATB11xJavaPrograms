package ex_16_OOPs_Concept;

public class Lab111_OOPs1 {

    public static void main(String[] args){
        Person Rohit;
        Person p2 = new Person();
        p2.name = "Lucky";
        System.out.println(p2.name);


        Person p3 = new Person();
        p3.name = "Pramod";
        System.out.println(p3.name);
    }
}
    class Person{
    // Attribute
        String name;
        String phone;
        String color_eyes;
        int legs;
        double salary;
        byte age;
        double weight;
        boolean is_male;

    // Behaviour
        void sleep() {
            System.out.println("I am sleeping");
        }

        String greet(String name){
            return "Hellow" + name;
        }

        void talk(){

        }

        int remaining_amount_sal(int salary, int tax){
            return salary-tax;
        }



    }



