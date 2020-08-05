package recursion;

public class ReverseString {

    public static void reverse(String str[], int index,String op,int size){

        if(index<0){
            System.out.println(op);
            return;
        }

        op = op + str[index];

        if(index!=0)
            op = op + " ";

        reverse(str,index-1,op,size);
    }

    public static void main(String[] args) {

        String str = "cat is running";
        String [] split = str.split("\\s");
        int size = split.length;

        String op = "";
        reverse(split,size-1,op,size);
    }
}
