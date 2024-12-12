package java_string_programs;

public class RevString {

    public static void main(String[] args) {

        String str="i love java programming";
        String revString="";
        int i=0;

//        int length = str.length();
//        System.out.println(length);

        while(i<str.length())
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                revString=ch+revString;
            }else{
                System.out.print(revString+" ");
                revString="";
            }
            i++;
            if(i==str.length())
            {
                System.out.print(revString);
            }
        }


    }
}
