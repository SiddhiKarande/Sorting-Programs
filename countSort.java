import java.util.*;
public class countSort {

    public static void countS(int arr[]){

        int range = Integer.MIN_VALUE;
        for(int i=0; i<arr.length ; i++){
            range = Math.max(range, arr[i]);
        }

        int count[] = new int[range + 1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printSelection(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,4,1,2,3,4,3,7};
        countS(arr);
        printSelection(arr);
    }
    
}
