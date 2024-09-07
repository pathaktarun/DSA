public class ProductExceptSelfQues {

    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int product=1;
        int zeroCount=0;


        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeroCount++;
            }else
            {
                product*=nums[i];
            }
        }
        if(zeroCount==n){
            product=0;

        }

        boolean arrayContainsZero=zeroCount>0;

        for(int i=0;i<n;i++){

            if(nums[i]==0 && zeroCount>=2){
                nums[i]=0;
            }else if(nums[i]==0){
                nums[i]=product;
            }else if(arrayContainsZero){
                nums[i]=0;
            }else{
                nums[i]=product/nums[i];
            }



        }
        return nums;


    }

    public static void main(String[] args){

        int nums[]={0,4,0};
        nums=productExceptSelf(nums);

        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
