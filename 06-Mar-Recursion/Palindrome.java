import java.util.Scanner;

// 5.Write a recursive code to check if a string is a palindrome or not. [Hint: reverse the string and send both strings into the function and check.

public class Palindrome {
    static String str="";
    static String palindrome(String s,int i)
    {
        if(i>=0)
        {
            str = str + s.charAt(i);
            palindrome(s, i-1);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        String rev = palindrome(s, s.length()-1);
        // System.out.println(rev);
        if(s.equals(rev))
        System.out.println("Palindrome String");
        else
        System.out.println("Not a palindrome String");
        sc.close();
    }
}
