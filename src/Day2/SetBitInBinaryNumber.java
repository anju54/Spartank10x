package Day2;

// Check if the i th bit is set in the binary form of the given number.

public class SetBitInBinaryNumber {

    public static void checkSetBit(int number,int k){

        while(k>0){
            k--;
            if(number%2!=0 && k==0) {
                System.out.println("Kth bit is SET");
                break;
            }
            number = number /2;
        }
    }

    // Optimized method
    public static void checkSetBit1(int number,int k){
        int res = number >> (k-1);
        if(res == 1)
            System.out.println("SET");
        else
            System.out.println("UNSET");
    }

    public static void main(String[] args) {
        int number = 5;
        int k = 3;
        //checkSetBit(number,k);
        checkSetBit1(number,k);
    }
}
