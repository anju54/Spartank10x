package Day6;

import java.sql.Array;
import java.util.Arrays;

public class CalculateXOR {

    public static void  findXorOfTwoArray(int[] arr,int[] arr1){

        int result[] = new int[arr.length];
        int countOfUnsetBit = 0;

        for(int i=0;i<arr.length;i++){
            result[i] = arr[i] ^ arr1[i];
            if( result[i] == 0)
                countOfUnsetBit++;
        }
        System.out.println("Count of unset bit = "+countOfUnsetBit);
        System.out.println("Printing the XOR of both array ");
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0,1,1,1};
        int arr1[] = new int[]{1,1,1,1};
        findXorOfTwoArray(arr,arr1);
    }
}
