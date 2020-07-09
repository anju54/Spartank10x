package Day2;

// Count the number of ones in the binary representation of the given number.

import java.util.Scanner;

public class CountOnesInBinary {

    // TC - O( logn )
    public static void countOnes(int num){

        int count = 0;
        while (num>0){
            num = num & (num-1);
            count++;
        }
        System.out.println("Printing the number of ones: "+count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        countOnes(num);
    }
}
