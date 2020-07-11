package Day3;

import java.util.Scanner;

public class SwapNibble {

    public static void swapNibbles(int number){

        int res = ( ( number & 15 ) << 4 )| ( ( number & 240 ) >> 4 ) ;
        System.out.println(res);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        swapNibbles(num);
    }
}
