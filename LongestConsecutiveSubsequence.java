import java.util.*;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutive(int[] nums) {


        int ans=1;
        if(nums.length==0)
        {
            return 0;
        }

        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        for(int num: set){
            int currLength=0;
            if(!set.contains(num-1)){
                int currElem=num;
                while(set.contains(currElem)){
                    currLength++;
                    currElem++;
                }
            }
            ans=Math.max(ans,currLength);

        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

}
