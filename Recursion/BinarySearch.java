public class BinarySearch {

    static int search(int[] arr, int i, int j, int elem) {
        if (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == elem) // 1 2 3 4 5 6
                return mid;

            if (arr[mid] > elem)
                return search(arr, i, mid - 1, elem);

            return search(arr, mid + 1, j, elem);

        }

        return -1;

    }

    public static void main(String[] args) {

        System.out.println(search(new int[] { 1, 2, 3, 4, 5, 6 }, 0, 6, 6));
    }
}
