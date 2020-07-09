package Day2;

// Count the number of ones in the binary representation of the given number.

public class CountOnesInBinary {

    public static void countOnes(int number){

        int count = 0;
        while (number>0){
            int remainder = number % 10;
            number = number /10;

            if( remainder == 1)
               count++;
        }
        System.out.println("Printing the number of ones: "+count);
    }

    public static void main(String[] args) {
        int number = 001100110101; // number is in binary format
        countOnes(number);
    }
}
