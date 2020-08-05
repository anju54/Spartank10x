package Day19;

public class CheckForNum {

    // check if search key is present in the array or not
    public static boolean isNumPresent(int arr[], int search, int currentIndex){

        if(currentIndex== arr.length)
            return false;

        if(arr[currentIndex]==search) {
            return true;

        }

        return isNumPresent(arr,search,currentIndex+1);
    }

    public static void main(String[] args) {

        int arr[] = new int[]{1,-2,3,4,-5};
        boolean res = isNumPresent(arr,3,0);
        System.out.println(res);
    }
}
