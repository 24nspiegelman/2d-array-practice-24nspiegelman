public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int count = 0;
        for (int [] row : mat) {
            for (int cell : row) {
                if (cell % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int max = mat [0] [0];
        for (int [] row : mat) {
            for (int cell : row) {
                if (cell > max) {
                    max = cell;
                }
            }
        }
        return max;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            int leftMost = mat[row][0];
            for (int col = 0; col < mat[0].length - 1; col++) {
                mat[row][col] = mat[row][col + 1];
            }
            mat[row][mat[0].length - 1] = leftMost;
        }
        return mat;
    }

    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int [][] mat = new int[arraySize][arraySize];
        for (int row = 0; row < arraySize; row++) {
            for (int col = 0; col < arraySize; col++) {
                mat[row][col] = row + col;
            }
        }
        return mat;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double total = 0.0;
        double area = 0.0;
        for (double [] row : mat) {
            for (double cell : row) {
                total += cell;
                area ++;
            }
        }
        return total/area;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        int numRows = mat.length;
        int numCols = mat[0].length;
        double med = 0.0;
        if (numRows % 2 != 0 && numCols % 2 != 0) {
            med = mat[numRows/2] [numCols/2];
        }
        if (numRows % 2 != 0 && numCols % 2 == 0) {
            med = (mat[numRows/2][numCols/2 - 1] + mat[numRows/2][numCols/2])/2;
        }
        if (numRows % 2 == 0 && numCols % 2 == 0) {
            med = (mat[numRows/2 - 1][numCols - 1] + mat[numRows/2][0])/2;
        }
        return med;
}


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        double curNum = mat[0][0];
        double curNumStr = 0;
        double longestNum = 0;
        double longestNumStr = 0;
        for (double [] row : mat) {
            for (double cell : row) {
                if (curNum == cell){
                    curNumStr ++;
                    if (curNumStr > longestNumStr) {
                        longestNumStr = curNumStr;
                        longestNum = curNum;
                    }
                }
                curNum = cell;
            }
        }
        return longestNum;
    }
    public static boolean isMagicSquare(int[][] mat) {
        int rowCur = 0;
        int rowPrev = 0;
        for (int col = 0; col < mat.length; col ++){
            rowCur += mat[0][col];
        }

        return false;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
