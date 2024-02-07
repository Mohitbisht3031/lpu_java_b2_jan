package Day10;
/*
 * given a multi-array convert that multi-array by doing some operation
 * opertaion is : if a 0 is coming at a specific box(i,j) than convert that 
 * entire row i and entire col j into 0
 */
public class Q1 {
    // apporach 1 , TC : O(N^3) , SC : O(n^2)
    void convert(int mat[][]){
        int nMat[][] = new int[mat.length][mat[0].length];
        for(int i =0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    for(int k = 0;k<mat.length;k++)nMat[k][j] = -1;
                    for(int k = 0;k<mat[0].length;k++)nMat[i][k] = -1;
                }
            }
        }
        for(int i = 0;i<nMat.length;i++){
            for(int j = 0;j<nMat[0].length;j++){
                if(nMat[i][j] == -1)nMat[i][j] = 0;
                else nMat[i][j] = mat[i][j];
            }
        }
        return;
    }

    // approach2 , TC : O(n^2) , sc : O(N+M) /  O(N)
    void convert2(int mat[][]){
        int r[] = new int[mat.length];
        int c[] = new int[mat[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j= 0 ;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }

        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(r[i] == 1 || c[j] == 1){
                    mat[i][j] = 0;
                }
            }
        }

        return ;
    }
    public static void main(String[] args) {
        
    }
}
