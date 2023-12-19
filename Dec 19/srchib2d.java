import java.util.Arrays;

public class srchib2d {
    static int[] srch2d(int[][] mat,int tar){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==tar){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{5,6,7},{4,2,7,9,32}};
        int tar=2;
        System.out.println(Arrays.toString(srch2d(arr,tar)) );

    }
}
