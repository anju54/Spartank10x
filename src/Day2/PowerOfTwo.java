package Day2;

import java.util.Scanner;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int num){

        if(num<=0)
            return false;
        if(num==1)
            return true;
        else {
            while(num>1){
                int rem = num % 2;
                if(rem!=0)
                    return false;
                num = num/2;
            }
        }
        return true;
    }

    // Optimized approach
    public static boolean isPowerOfTwo1(int num){

        int res = num & ( num-1);
        if(res==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println( isPowerOfTwo1(num) );
    }
}
