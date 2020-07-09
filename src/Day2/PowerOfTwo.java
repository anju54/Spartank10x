package Day2;

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

    public static void main(String[] args) {

        int num = 8;
        System.out.println( isPowerOfTwo(num) );
    }
}
