package day5;

public class EditDistance {
    public static int distance(String src,String dest){
        int rSize = src.length();
        int cSize = dest.length();
        int[][] dp = new int[rSize+1][cSize+1];
        for(int row=0;row<rSize;row++)
            dp[row][0]=row;
        for(int col=0;col<cSize;col++)
            dp[0][col] = col;
        for(int row=1;row<=rSize;row++){
            for(int col=1;col<=cSize;col++){
                if(src.charAt(row-1)==dest.charAt(col-1))
                    dp[row][col]=dp[row-1][col-1];
                else{
                    dp[row][col] = 1 + Math.min(
                        dp[row-1][col], Math.min(
                            dp[row][col-1],dp[row-1][col-1]
                        )
                    );
                }
            }
        }
        return dp[rSize][cSize];
    }
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(distance(word1, word2));
    }
}
