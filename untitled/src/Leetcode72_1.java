import java.util.Arrays;

/**
 * @version v1.0
 * @Author zhy
 * Description 备忘录
 */
public class Leetcode72_1 {
    int[][] memo;

    public static void main(String[] args) {
        System.out.println(new Leetcode72_1().minDistance("horse", "ros"));

    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        memo = new int[m][n];

        for(int[] row:memo){
            Arrays.fill(row,-1);
        }

        return dp(word1,m-1,word2,n-1);
    }

    public int dp(String word1,int i,String word2,int j){
        if(i == -1) return j+1;
        if(j == -1) return i+1;

        if (memo[i][j] != -1){
            return memo[i][j];
        }

        if(word1.charAt(i) == word2.charAt(j)){
            memo[i][j]  = dp(word1,i-1,word2,j-1);
        }
        else{
           memo[i][j] =  min(
                    dp(word1,i,word2,j-1)+1,
                    dp(word1,i-1,word2,j)+1,
                    dp(word1,i-1,word2,j-1)+1
            );
        }

        return memo[i][j];
    }

    public int min(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
}
