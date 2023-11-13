import java.util.*;
public class arr_two_d {

    public static boolean findKey(int arr[][], int key){
        int m=3, n=3;
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(arr[i][j] == key){
                    System.out.println("found");
                    return true;
                   
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
    
    public static void main(String args[]){

        int m=3,n=3;
        int arr[][] = new int [n][m];
       
       Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                arr[i][j] = sc.nextInt();
                
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        } 
        
        findKey(arr, 5);
    }
}
