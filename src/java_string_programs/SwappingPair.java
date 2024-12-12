package java_string_programs;

public class SwappingPair {

    public static void main(String[] args) {

        String str="GeeksForGeeksjsi";
        int j1=0;

        for(int i=0;i<=str.length();i=j1)
        {
            for(int j=i+1;j<=i+1;j++)
            {
                char a,b,temp;
                temp=str.charAt(i);
                a=str.charAt(j);
                b=temp;
                System.out.print(a+""+b);
            }
            j1=j1+2;
            if(j1>=str.length())
            {
                break;
            }
        }

    }
}
