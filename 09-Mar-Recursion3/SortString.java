import java.util.Scanner;

// "1. Sort the string composed of only [a-z] chars in descending order in Linear Time. 

public class SortString {
    static String sb ="";
    static char ch= 'Z';
    static String sortString(String str,int i)
    {
         if(i>=0)
         {
             if(str.charAt(i)==ch || str.charAt(i)==ch+32)
             sb = sb + str.charAt(i);
             ch = ch--;
             sortString(str, i-1);
         }
         return sb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        String des = sortString(s,s.length()-1);
        System.out.println("String in Descending = "+des);
        sc.close();
    }
}
