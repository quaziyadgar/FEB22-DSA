import java.util.Scanner;

// "1. Sort the string composed of only [a-z] chars in descending order in Linear Time. 

public class SortString {
    static StringBuffer sb = new StringBuffer();
    static char ch= 'Z';
    static StringBuffer sortString(String str)
    {
         if(ch>='A')
         {
             for(int i = 0; i<str.length(); i++)
             {
                if(str.charAt(i)==ch || str.charAt(i)==ch+32)
                sb.append(str.charAt(i));
             }
             --ch;
             sortString(str);
         }
         return sb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        StringBuffer des = sortString(s);
        System.out.println("String in Descending = "+des);
        sc.close();
    }
}
