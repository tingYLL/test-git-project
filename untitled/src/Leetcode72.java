/**
 * @version v1.0
 * @Author zhy
 * Description 暴力递归
 */
public class Leetcode72 {
    public static void main(String[] args) {
        System.out.println(new Leetcode72().minDistance("horse", "ros"));
        System.out.println("bbbbb");
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        return dp(word1,m-1,word2,n-1);
    }

    public int dp(String word1,int i,String word2,int j){
        if(i == -1) return j+1;
        if(j == -1) return i+1;

        if(word1.charAt(i) == word2.charAt(j)){
            return dp(word1,i-1,word2,j-1);
        }
        int min = min(
                dp(word1,i,word2,j-1)+1,
                dp(word1,i-1,word2,j)+1,
                dp(word1,i-1,word2,j-1)+1
        );

        return min;
    }

    public int min(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
}
