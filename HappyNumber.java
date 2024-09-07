import java.util.HashMap;

public class HappyNumber {


    private static int getSumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }


    public static  boolean isHappy(int n) {


        HashMap<Integer,Boolean> numberSeen=new HashMap<>();
        while(n!=1 && !numberSeen.containsKey(n)){
            numberSeen.put(n,true);
            n=getSumOfDigits(n);
        }

        return n==1;

    }

    public static void main(String[] args)
    {
        System.out.println(isHappy(19));
    }
}
