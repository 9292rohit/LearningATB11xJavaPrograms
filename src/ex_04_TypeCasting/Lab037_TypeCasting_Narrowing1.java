package ex_04_TypeCasting;

public class Lab037_TypeCasting_Narrowing1
{
    public static void main(String[] args)
    {
        long phone_no = 9881178983l;
//        short s1 = phone_no;
        short s1 = (short) phone_no;

        System.out.println(s1);
//        System.out.println(phone_no);

    }
}
