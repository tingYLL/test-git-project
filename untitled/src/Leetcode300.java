import java.util.Arrays;

/**
 * @version v1.0
 * @Author zhy
 * Description 默认
 */
public class Leetcode300 {
    public static void main(String[] args) {
        System.out.println(new Leetcode300().lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    public int lengthOfLIS(int[] nums) {
        int res = 0;
        int size = nums.length;
        int[] dp = new int[size];
        Arrays.fill(dp,1);
        for(int i = 0;i < size;i++){
            for(int j = 0;j < i;j++){
                if(nums[j] <= nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }


        for(int i :dp){
            res  = Math.max(res,i);
        }

        return res;
    }
}
