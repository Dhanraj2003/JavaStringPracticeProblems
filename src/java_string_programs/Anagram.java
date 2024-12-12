package java_string_programs;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Anagram {

    public static void main(String[] args) {

        String str1="listens";
        String str2="lipkens";
        int count=0;

        if(str1.length()!=str2.length())
        {
            System.out.println("not anagram");
        }
        else{
            for(int i=0;i<str1.length();i++)
            {
                for(int j=0;j<str2.length();j++)
                {
                    if(str1.charAt(i)==str2.charAt(j)) {
                        count++;
                    }
                }
            }
            if(count>=str1.length())
            {
                System.out.println("anagram");
            }else{
                System.out.println("not anagram");
            }
        }
//        if(str1.equals(str3))
//        {
//            System.out.println("anagram");
//        }
//        else {
//            System.out.println("not anagram");
//        }
//        if (count==str1.length())
//        {
//            System.out.println("given string is anagram");
//        }else{
//            System.out.println("not anagram");
//        }
    }
}
