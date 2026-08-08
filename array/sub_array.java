import java.util.HashMap;

public class sub_array {

    int sub(int[] arr, int k) {

        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // prefix sum 0 appears once
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // check if previous prefix sum = sum-k exists
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // store current prefix sum frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }


    // GFG: Longest Subarray with Sum K
    public int longestSubarray(int[] arr, int k) {

        int sum = 0;
        int len = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                len = i + 1;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (map.containsKey(sum - k)) {
                int ll = i - map.get(sum - k);
                len = Math.max(len, ll);
            }
        }

        return len;
    }


    public static void main(String[] args) {

        int[] a = {1, 1, 1};

        sub_array s = new sub_array();

        System.out.println(s.sub(a, 2));
    }
}