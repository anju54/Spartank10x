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

    public static void main(String[] args) {
        int number = 75;
        int k = 4;
        checkSetBit(number,k);
    }
}
