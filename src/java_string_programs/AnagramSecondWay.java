package java_string_programs;

public class AnagramSecondWay {


    public static void checkAnagram()
    {
        String str1="ga";
        String str2="ga";

        if(str1.length()==str2.length())
        {
            if(sort(str1).equals(sort(str2)))
            {
                System.out.println("anangram");
            }
            else{
                System.out.println("not anagram");
            }
        }else{
            System.out.println("Invalid length");
        }
    }


    public static void main(String[] args) {

        AnagramSecondWay.checkAnagram();

    }


    public static String sort(String s)
    {
        char[] charArray = s.toCharArray();
        char temp;
        for(int i=0;i<charArray.length;i++)
        {
            for(int j=i+1;j<charArray.length;j++)
            {
                if(charArray[i]>charArray[j])
                {
                    temp=charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
        System.out.println(charArray);
        return new String(charArray);
    }

}
