package Day10;

import java.util.Scanner;

public class CheckForBleak {

    public static int countSetBit(int num){
        int count = 0;
        while(num>0){
            num = num & (num-1);
            count++;
        }
        return count;
    }

    public static int isBleak(int num){
        int temp = num;
        while (temp>0){
            int countSetBit = countSetBit(temp);
            if(countSetBit+temp==num)
                return 0;
            temp--;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println( isBleak(num) );
    }
}
