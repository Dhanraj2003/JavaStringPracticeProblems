package java_string_programs;

public class ReverseString {

    public static void main(String[] args) {

        String name="dhanraj";

//        int i = name.length() - 1;
//        char c = name.charAt(i);
//        System.out.println(c);
//
//        char c1 = name.charAt(0);
//        System.out.println(c1);

//
        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i)+" ");
        }

    }
}
