package DSA;

public class BinarySearch {

    public static Integer binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int steps = 0;

        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Target found at index " + mid + " in " + steps + " steps.");
                return mid;
            }

            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Target not found after " + steps + " steps.");
        return null;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};

        binarySearch(a, 5);
        binarySearch(b, 5);
        binarySearch(c, 5);
        binarySearch(d, 5);

    }
}

