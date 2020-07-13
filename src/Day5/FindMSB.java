package Day5;

import java.util.Scanner;

public class FindMSB {

    public static void findMSB(int num){

        int res = num >> 7;
        System.out.println("Binary output "+Integer.toBinaryString(num));
        System.out.println("MSB = "+res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findMSB(num); // checked for 231 , 99, 3, 1
    }
}
