class bubbleSort{

    public static void bubbleSorting(int arr[]){
        int n = arr.length;
        for(int turn=0; turn<n-1;turn++){
            for(int j=0; j<n-1-turn;j++){
               if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               }
            }
        }
    }

    //print bubble sorted array

    public static void printBubbleSorting(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){

        int a[]={5,4,1,3,2};
        bubbleSorting(a);
        printBubbleSorting(a);

    }

}