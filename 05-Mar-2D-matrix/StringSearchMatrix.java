// "3. Given a 2-d matrix of characters, write a function that takes this 2-d matrix
//     and a string and returns whether the string can be formed using characters
//     of this string. Note that one character from the matrix can be used only 
//     once."


import java.util.Scanner;

public class StringSearchMatrix {


    static void stringSearchMatrix(char[][] matrix,int r,int c, String str)
    {
        char[] charStr = str.toCharArray();
        int s = 0;
        int count = 0;
        while(s<charStr.length)
        {
            int n = s;
            outer:
            for(int i = 0; i<r; i++){
                for(int j = 0; j<c; j++)
                {
                    if(charStr[s] == matrix[i][j])
                    {
                        count++;
                        matrix[i][j] = '0';
                        s++;
                        break outer;
                    }
                }
            }
            if(n++ != s)
            break;
        }
        if(count == charStr.length)
        System.out.println("String Present");
        else
        System.out.println("String Not Present");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column length for a matrix creation...");
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] matrix = new char [r][c];
        System.out.println("Insert element in matrix");
        for(int i = 0; i<r; i++)
        for(int j = 0; j<c; j++)
            matrix[i][j] = sc.next().charAt(0);
        System.out.println("Enter a string");
        String str = sc.next();
            stringSearchMatrix(matrix, r, c, str);
            sc.close();
    }
}
