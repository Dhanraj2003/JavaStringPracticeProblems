package java_string_programs;

public class PalindromeString {

    public static void main(String[] args) {

        String originalString="Aba";
        String temp=originalString;
        String revString="";

        int length = originalString.length();
        System.out.println(length);

        for(int i=originalString.length()-1;i>=0;i--)
        {
            revString=revString+originalString.charAt(i);
        }

        if(temp.equals(revString))
        {
            System.out.println("Given string is palindrome string");
        }
        else{
            System.out.println("Given string is not palindrome string");
        }

    }
}
