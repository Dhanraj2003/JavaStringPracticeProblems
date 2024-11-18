package java_string_programs;

public class InsertStringIntoAnotherString {

    public static void main(String[] args) {


        //without using predefined methods

        String originalString="Hello World";
        int pos=6;
        String insertedStr="Java ";
        String resultString="";

        for(int i=0;i<pos;i++)
        {
            resultString=resultString+originalString.charAt(i);
        }

        resultString+=insertedStr;

        for(int i=pos;i<originalString.length();i++)
        {
            resultString=resultString+originalString.charAt(i);
        }

        System.out.println("original string:"+originalString);
        System.out.println("string after insertion:"+resultString);


        //using predefined method like substring
        String str="GeeksGeeks";

        String insertedString="For";

        int position=5;

        String s = str.substring(0, position)+" " + insertedString +" "+str.substring(position);

        System.out.println(s);



    }
}
