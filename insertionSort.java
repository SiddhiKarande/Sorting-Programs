public class insertionSort {

    public static void insertionS(int arr[]){

    for(int i=1; i<arr.length;i++){
        int curr = arr[i];
        int pre = i-1;

        while( pre>=0 && arr[pre] >curr){
            arr[pre+1] = arr[pre];
            pre--;
        }
        arr[pre + 1] = curr;
    }
    }
    public static void printSelection(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionS(arr);
        printSelection(arr);
    }
    
}
