package java_string_programs;

public class InsertString {

    public static String insertStrings(String originalString,String insertedString,int index)
    {
        String so=new String();

        for(int i=0;i<originalString.length();i++)
        {
            so=so+originalString.charAt(i);

            if(i==index)
            {
                so=so+insertedString;
            }

        }
        System.out.println(so);

        return so;
    }

    public static void main(String[] args) {

        String originalString="GeeksGeeks";
        String insertedString="For";
        int index=4;

        System.out.println("Origina string:"+originalString);
        System.out.println("Inserted string:"+insertedString);
        System.out.println("location:"+index);

        System.out.println("using string");
        String s = InsertString.insertStrings(originalString, insertedString, index);

        System.out.println(s);


        System.out.println("using String Builder");
//        StringBuilder str=new StringBuilder("GeeksGeeks");
//        StringBuilder str2=new StringBuilder("For");
//        int index=5;
//
//        StringBuilder insert = str.insert(index, str2);
//        System.out.println(insert);
    }
}
