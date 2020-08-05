package Day19;

import java.util.Arrays;

public class ReplaceNegative {

    // convert negative element to 0
    public static void solve(int arr[], int index){

        if(index== arr.length)
            return;

        if(arr[index]<0){
            arr[index] = 0;
        }
        solve(arr,index+1);
    }

    public static void main(String[] args) {

        int arr[] = new int[]{1,-2,3,4,-5};

        solve(arr,0);

        // to print the output
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
