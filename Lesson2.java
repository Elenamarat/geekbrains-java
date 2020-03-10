package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(array1);
        int[] array2 = new int [8];
        fillArray(array2);
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(array3);
        minElementArray(array3);
        maxElementArray(array3);
        int[][] array4 = new int[10][10];
        fillDiagonal(array4);
        evenArray(array1);
        int[] array5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        shiftArray(array5, -4);
    }

    public static int[] invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        return arr;
    }

    public static int[] fillArray(int[] arr) {
        for (int i = 0, j = 1; i < arr.length; i++, j+=3) {
            arr[i] = j;
        }
        return arr;
    }

    public static int[] changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] * 2 : arr[i];
        }
        return arr;
    }

    public static int minElementArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
        }
        return min;
    }

    public static int maxElementArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = (arr[i] > max) ? arr[i] : max;
        }
        return max;
    }

    public static int[][] fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        return arr;
    }

    public static boolean evenArray(int[] arr) {
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum % 2 == 0);
    }

    public static int[] shiftArray(int[] arr, int n) {
        if (n >= arr.length || -n >= arr.length) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 0;
            }
            return arr;
        } else if (n >= 0) {
            for (int i = arr.length - 1; i >= n; i--) {
                arr[i] = arr[i - n];
            }
            for (int i = 0; i < n; i++) {
                arr[i] = 0;
            }
            return arr;
        }
        for (int i = 0; i < arr.length + n; i++) {
            arr[i] = arr[i - n];
        }
        for (int i = arr.length - 1; i > arr.length - 1 + n; i--) {
            arr[i] = 0;
        }
        return arr;
    }
}
