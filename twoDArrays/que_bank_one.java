class que_bank_one{
    /*
     * Print the number of 7’s that are inthe 2d array.
     * nt[][] array = { {4,7,8},{8,8,7} }
     */

     public static int count(int arr[][], int key){
        int c = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j] == key){
                    c++;
                }
            }
        }return c;
     }

     

      public static int sumOfSecondRow(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==1){
                    sum+=arr[i][j];
                }
            }
        }return sum;
      }

      /*
       * Write a program to FindTranspose of a Matrix
       */

     public static void transpose(int arr[][]){

        int row = arr.length, col = arr[0].length;
        int trans[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                 trans[j][i] = arr[i][j];
            }System.out.println();
        }printArr(arr);
        printArr(trans);
       }

       public static void printArr(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }System.out.println();
        }
       }
    public static void main(String args[]){
        //int arr[][] = { {4,7,8},{8,8,7} };
        //System.out.println(count(arr, 7));

        int arr[][] = {{1,4,9},{11,4,3},{2,2,3} };
        //System.out.println(sumOfSecondRow(arr));
        transpose(arr);

    }
}