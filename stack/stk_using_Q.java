import java.util.LinkedList;
import java.util.Queue;

public class stk_using_Q {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);

        int n = q.size();

        for (int i = 0; i < n - 1; i++) {
            q.offer(q.poll());
        }
    }

    void pop() {
        if (!q.isEmpty()) {
            q.poll();
        }
    }

    int peek() {
        if (q.isEmpty())
            return -1;

        return q.peek();
    }

    int size() {
        return q.size();
    }

    public static void main(String[] args) {
        stk_using_Q s = new stk_using_Q();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());  // 30
        System.out.println(s.size());  // 3

        s.pop();

        System.out.println(s.peek());  // 20
        System.out.println(s.size());  // 2
    }
}
