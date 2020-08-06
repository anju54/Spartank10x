package Day20;

import java.util.ArrayList;

public class InvertPosition {

    public static void doInvert(int arr[],int size,ArrayList<Integer> output,int currentIndex){

        if(currentIndex<0){
            return;
        }
        output.add(arr[currentIndex]);
        doInvert(arr,size,output,currentIndex-1);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4};
        int size = arr.length;
        ArrayList<Integer> output = new ArrayList<>();
        doInvert(arr,size,output,size-1);

        // to print the output
        System.out.print("{ ");
        for(int i=0;i< arr.length;i++){
            System.out.print(output.get(i));
            System.out.print(" ");
        }
        System.out.print(" }");
    }
}
