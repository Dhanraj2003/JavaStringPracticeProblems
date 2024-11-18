package java_string_programs;

public class EvenLengthWord {

    public static void main(String[] args) {

        String str="this is demo tut";


        for(String s:str.split(" "))
        {
            if(s.length()%2==0)
            {
                System.out.println(s);
            }
        }




    }
}
