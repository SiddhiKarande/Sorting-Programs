class selectionSort{

    public static void selectionSorting(int arr[]){
        //find minimum
        for(int i=0; i<arr.length-1;i++){
            int minPosition = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minPosition]>arr[j]){
                    minPosition=j;
                }
            }
            //swap the minimum
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
        
    }
    public static void printSelection(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSorting(arr);
        printSelection(arr);

    }
}
