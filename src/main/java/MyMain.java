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
        int nums = mat.length;
        int numCols = mat[0].length;
        double med = 0.0;
        if (nums % 2 != 0 && numCols % 2 != 0) {
            med = mat[nums/2] [numCols/2];
        }
        if (nums % 2 != 0 && numCols % 2 == 0) {
            med = (mat[nums/2][numCols/2 - 1] + mat[nums/2][numCols/2])/2;
        }
        if (nums % 2 == 0 && numCols % 2 == 0) {
            med = (mat[nums/2 - 1][numCols - 1] + mat[nums/2][0])/2;
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
        int cur = 0;
        int prev = 0;
        int col1 = 1;
        int col2 = mat[0].length - 1;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 1; col < mat[0].length; col++) {
                cur = mat[row][col];
                prev = mat[row][col - 1];
                if (cur != prev) {
                    return false;
                }
            }
        }
        for (int col = 0; col < mat[0].length; col++) {
            for (int row = 1; row < mat.length; row++) {
                cur = mat[row][col];
                prev = mat[row - 1][col];
                if (cur != prev) {
                    return false;
                }
            }
        }
        for (int row = 1; row < mat.length; row++) {
            cur = mat[row][col1];
            prev = mat[row - 1][col1 - 1];
            if (cur != prev) {
                return false;
            }
            col1 ++;
        }
        for (int row = 0; row < mat.length - 1; row ++) {
            cur = mat[row][col2];
            prev = mat[row + 1][col2 - 1];
            if (cur != prev) {
                return false;
            }
            col2 --;
        }
        return true;
    }


    public static void main(String[] args) {
        int [][] a = { {2, 7, 1},
                       {1, 1, 1},
                       {1, 1, 1} };
        System.out.println(isMagicSquare(a));
   }
}
