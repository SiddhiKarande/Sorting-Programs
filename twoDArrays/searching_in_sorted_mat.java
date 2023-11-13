public class searching_in_sorted_mat {
    
    public static boolean stair_case_searching(int mat[][], int key){
        
        int row = 0; 
        int col = mat[0].length - 1;
        while(row<mat.length && col >=0){
            if(key == mat[row][col]){
                return true;
            }
            else if( key< mat[row][col]){
                col--;
            }
            else if( key> mat[row][col]){
                row ++;
            }
        }return false;
    }
    
    public static void main(String args[]){
        int mat [][]={{1,2,3},
            {4,5,6},
           {7,8,9}};

           System.out.println(stair_case_searching(mat,44));
    }
}
