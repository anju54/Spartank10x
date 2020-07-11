package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MaximumSubarray {

    public static void maxSubArray(int arr[]){

        int maxSum = arr[0];
        int tempSum = arr[0];

        HashSet<Integer> list = new HashSet<>();

        for(int i=1;i<arr.length;i++){
            tempSum = Math.max(tempSum+arr[i], arr[i]);
            if(maxSum<tempSum)
                maxSum = tempSum;
        }
        System.out.println("max sum = " +maxSum);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,4,5,-6};
        maxSubArray(arr);
    }
}
