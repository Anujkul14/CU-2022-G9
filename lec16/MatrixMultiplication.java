package lec16;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][]={
                {1,2,3},
                {4,6,7},
                {8,9,0}
        };
        int B[][]={
                {4,5,6},
                {4,6,7},
                {8,9,0}
        };
        int n=A.length;
        int m=B[0].length;
        int ans[][]=new int[n][m];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                int sum=0;
                for(int k=0;k<B.length;k++){
                    sum=sum+A[i][k] * B[k][j];
                }
                ans[i][j]=sum;
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
