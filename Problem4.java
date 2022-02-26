// Problem 4 [30pts]
// Mutiply two matrices, use method displayProduct() to display the result. 
// For matrix multiplication to take place, the number of columns of the first matrix must be equal to the number of rows of the second matrix. 
// In our example, i.e.c1 = r2
// Also, the final product matrix is of size r1 x c2, i.e.product[r1][c2]
public class MultiplyMatrices {

    public static void main(String[] args) {
        // input matrix
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
        
        // Input your code here: 
        
        //int product = 0;
        int roll_1 = 2, column_1 = 3;
        int roll_2 = 3, column_2 = 2;
        int[][] product = new int [roll_1][column_2];
        for (int i=0; i<roll_1;i++)
        {
            for(int j=0;j<column_2;j++)
            {
                for (int k=0; k<column_1;k++)
                {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        //displayProduct(product); 
        System.out.println("the product of the two array is ");
        for (int[] row : product) {
            for (int column: row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

    }

    //public static void displayProduct(int[][] product) {
        //System.out.println("Product of two matrices is: ");
        //for(int[] row : product) {
            //for (int column : row) {
                //System.out.print(column + "    ");
            //}
            //System.out.println();
        //}
    //}
}
