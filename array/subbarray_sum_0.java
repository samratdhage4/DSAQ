import java.util.HashMap;

public class subbarray_sum_0 {

    void show(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int h = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == 0) {

                h = i + 1;
            }
            if (map.containsKey(sum)) {

                int oldIndex = map.get(sum);
                int length = i - oldIndex;

                h = Math.max(h, length);
               
            } else {

                map.put(sum, i);
            }

          
        }
    }

    public static void main(String[] args) {

        subbarray_sum_0 s = new subbarray_sum_0();

        s.show(new int[]{15,1,-16,1,2,3,4,5});
    }
}