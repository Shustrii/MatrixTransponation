/************

 * * Description: This program show you matrix transponation .
 */
public class Matrix {
    public static void main(String[] args) {
        int n =3;
        int [][] a = new int[][] {
                {5,7,3},
                {7,0,1},
                {8,1,2}
        };
        System.out.println("First matrix");
        for (int i = 0 ;i < n; i++){
            for (int j = 0 ;j < n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //Matrix transposing
        for (int i = 0 ;i < n; i++){
            for (int j = i+1 ;j < n; j++){
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }

        }
        System.out.println();
        System.out.println("Transposed matrix");
        for (int i= 0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

}
