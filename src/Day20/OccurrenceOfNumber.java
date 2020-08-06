package Day20;

public class OccurrenceOfNumber {

    public static void countOccurrencesOfNumber(int[] arr, int num, int currentIndex, int size, int count){

        if(currentIndex==size){
            System.out.println(count);
            return;
        }

        if(arr[currentIndex]==num){
            count++;
        }

        countOccurrencesOfNumber(arr,num,currentIndex+1,size,count);

    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,2,4,2};
        int num = 1;
        countOccurrencesOfNumber(arr,num,0,arr.length,0);
    }
}
