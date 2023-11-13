public class diagonal_sum {
    
    public static int sum_of_diagonals(int mat[][]){
        /* 
        int sum =0;
        for(int i=0; i<mat.length;i++){
            for(int j=0; j<mat[0].length; j++){
                //sum ofprimary diagonal
                if(i==j){
                    sum += mat[i][j];
                }
                
                //sum of secondary diagonal
                else if(i+j == mat.length -1){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
        */

        //linear complexity
        int sum =0;
        for(int i=0; i<mat.length; i++){
            //primary
            sum += mat[i][i];

            //secondary
            if(i != mat.length-1-i)
                sum+= mat[i][mat.length -1 -i];
        }
        return sum;
    }
    
    public static void main(String args[]){
        int mat [][]={{1,2,3},
            {4,5,6},
           {7,8,9}};

        System.out.println(sum_of_diagonals(mat));
    }
}
