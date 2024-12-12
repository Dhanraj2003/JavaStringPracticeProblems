package java_string_programs;

public class EvenWordLength {

    public static void main(String[] args) {

        String str="This is java programming";

        String[] s = str.split(" ");

        for(String st:s)
        {
            int length = st.length();
            if(length%2==0)
            {
                System.out.println(st);
            }
        }

    }
}
