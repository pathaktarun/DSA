import java.util.HashMap;

public class TwoSum {

    public  static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<n;i++){
            int pending=target-nums[i];
            if(map.containsKey(pending) && map.get(pending)!=i){
                return new int[]{i,map.get(pending)};
            }
        }

        return new int[]{0,0};

    }

    public static void main(String[] args){
        int[] nums={3,2,4};
        int target=6;
        int[] output=twoSum(nums,target);


    }
}
