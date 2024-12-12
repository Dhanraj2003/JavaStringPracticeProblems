package java_string_programs;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String str="i like this programming very much";
        String temp="";
        String newTemp="";


//        String[] strings = str.split(" ");
//
//        for(int st=strings.length-1;st>=0;st--)
//        {
//            System.out.print(strings[st]+" ");
//        }




        //
//        for(String string:strings)
//        {
//            System.out.println(string+" ");
//        }



//        System.out.println(str.length());
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                temp=str.charAt(i)+temp;
                if(i==0)
                {
                    System.out.print(temp);
                }
            }else{
//                newTemp=temp;
                System.out.print(temp+" ");
                temp="";
            }
        }
    }
}
