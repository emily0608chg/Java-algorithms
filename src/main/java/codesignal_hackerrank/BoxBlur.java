package codesignal_hackerrank;

import java.util.Arrays;

public class BoxBlur {

    static int[][] boxBlur(int[][] image) {

        int rows = image.length;
        int cols = image[0].length;
        int[][] blur = new int[rows - 2][cols - 2];
        for (int r = 1; r < rows - 1; r++) {
            for (int c = 1; c < cols - 1; c++) {
                blur[r - 1][c - 1] = getAvg(image, r, c);
            }
        }
        System.out.println(Arrays.deepToString(blur));
        return blur;
    }

    private static int getAvg(int[][] img, int r, int c) {
        return (img[r - 1][c - 1] + img[r - 1][c] + img[r - 1][c + 1] +
                img[r][c - 1] + img[r][c] + img[r][c + 1] +
                img[r + 1][c - 1] + img[r + 1][c] + img[r + 1][c + 1]) / 9;
    }

    public static void main(String[] args) {
        int image[][] = {{7, 4, 0, 1},
                {5, 6, 2, 2},
                {6, 10, 7, 8},
                {1, 4, 2, 0}};

        int img[][] = {{1, 1, 1},
                {1, 7, 1},
                {1, 1, 1}};

        boxBlur(img);
    }
}

   /*/ int[][] out = new int[image.length - 2][image[0].length - 2];

    /i for vertical iteration, j for horizontal iteration, starting at first row and third column
        for (int i = 0; i < image.length - 2; i++) {
        for (int j = 2; j < image[0].length; j++) {
            out[i][j - 2] = (image[i][j - 2] + image[i][j - 1]
                    + image[i][j] + image[i + 1][j - 2]
                    + image[i + 1][j - 1] + image[i + 1][j]
                    + image[i + 2][j - 2] + image[i + 2][j - 1]
                    + image[i + 2][j]) / 9;
        }
    }

        return out;*/

