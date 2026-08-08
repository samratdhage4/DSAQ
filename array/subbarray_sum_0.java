import java.util.HashMap;

public class subbarray_sum_0 {

    void show(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int h = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.println("\n==============================");
            System.out.println("i = " + i);
            System.out.println("arr[" + i + "] = " + arr[i]);

            sum += arr[i];

            System.out.println("sum = " + sum);

            if (sum == 0) {

                h = i + 1;

                System.out.println("sum == 0");
                System.out.println("Subarray: index 0 to " + i);
                System.out.println("Length = " + (i + 1));
            }

            if (map.containsKey(sum)) {

                int oldIndex = map.get(sum);
                int length = i - oldIndex;

                System.out.println("sum " + sum + " already exists!");
                System.out.println("Old index = " + oldIndex);
                System.out.println("Current index = " + i);

                System.out.println(
                    "Length = current index - old index"
                );

                System.out.println(
                    length + " = " + i + " - " + oldIndex
                );

                h = Math.max(h, length);

                System.out.println("h = " + h);

            } else {

                map.put(sum, i);

                System.out.println(
                    "sum " + sum + " not found, so storing:"
                );

                System.out.println(
                    "map.put(" + sum + ", " + i + ")"
                );
            }

            System.out.println("Current map = " + map);
            System.out.println("Current h = " + h);
        }

        System.out.println("\n==============================");
        System.out.println("FINAL ANSWER = " + h);
    }

    public static void main(String[] args) {

        subbarray_sum_0 s = new subbarray_sum_0();

        s.show(new int[]{1, 2, 3, -5, 0, 7, -7});
    }
}