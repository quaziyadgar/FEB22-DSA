class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int r = board.length;
        int c = board[0].length;
        int arr[][] = new int[r][c];
        for(int i = 0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                arr[i][j] = liveOrDead(board,r-1,c-1,i,j);
            }
        }
        for(int i = 0; i<r; i++)
            for(int j = 0;j<c ; j++)
                board[i][j] = arr[i][j];
    }
    static int liveOrDead(int[][] board,int br, int bc,int i, int j) {
        int count = 0;
        for(int r= i-1; r<=i+1; r++)
        {
            for(int c = j-1; c<=j+1; c++)
            {
                if(c<0 || r>br || c>bc || r<0 || ((r==i) && (c==j)) )
                    continue;
                else{
                    if(board[r][c] == 1)
                        count++;
                }
            }
        }
         if(count <2)
             return 0;
        else if(count == 3)
            return 1;
        else if(count>=2 && count <=3)
        {
            if(board[i][j]==1)
                return 1;
            else 
                return 0;
        }
        else 
            return 0;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(arr);
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; i++)
            System.out.println(arr[i][j]+ " ");
            System.out.println();
        }
    }
}
//Leetcode solution
// Accepted
// Runtime: 0 ms
// Your input
// [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
// Output
// [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
// Expected
// [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]