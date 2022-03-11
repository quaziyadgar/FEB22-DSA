import java.util.Scanner;


// 2. Sort the string composed of only [a-z,A-Z] chars in ascending order in linear Time.        


public class SortStringAscend {
    static StringBuffer sb = new StringBuffer();
    static char ch= 'A';
    static StringBuffer sortString(String str)
    {
         if(ch<='Z')
         {
             for(int i = 0; i<str.length(); i++)
             {
                if(str.charAt(i)==ch || str.charAt(i)==ch+32)
                sb.append(str.charAt(i));
             }
             ++ch;
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

