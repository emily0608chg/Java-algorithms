package codesignal_hackerrank;

public class MatrixSum {

    public static int matrixElementsSum(int[][] matrix) {
        int sumOfCosts = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > 0)
                    sumOfCosts += matrix[j][i];
                else
                    break;
            }
        }
        System.out.println(sumOfCosts);
        return sumOfCosts;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3},
                {3, 5, 6},
                {7, 6, 2}
        };

        matrixElementsSum(matrix);
    }
}