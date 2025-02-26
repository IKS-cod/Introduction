package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom);
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int e : array) {
            sum += e;
        }
        return sum;
    }

    public int mul(int[] array) {
        if (array.length > 0) {
            int b = 1;
            for (int e : array) {
                b = b * e;
            }
            return b;
        }
        return 0;
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int e : array) {
            if (min > e) {
                min = e;
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int e : array) {
            if (max < e) {
                max = e;
            }
        }
        return max;
    }

    public double average(int[] array) {
        if (array.length > 0) {
            int sum = 0;
            for (int e : array) {
                sum += e;
            }
            return (double) sum / array.length;
        }
        return 0;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public boolean find(int[] array, int value) {
        for (int e : array) {
            if (e == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix) {
        int resultFull = 0;
        for (int[] e : matrix) {
            int result = sum(e);
            resultFull += result;
        }
        return resultFull;
    }

    public int max(int[][] matrix) {
        int maxResult = Integer.MIN_VALUE;
        for (int[] e : matrix) {
            if (maxResult < max(e)) {
                maxResult = max(e);
            }
        }
        return maxResult;
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (max < matrix[i][i]) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] e : matrix) {
            if (!isSortedDescendant(e)) {
                return false;
            }
        }
        return true;
    }

}
