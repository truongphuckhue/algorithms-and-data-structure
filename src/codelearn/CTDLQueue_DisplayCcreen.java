package codelearn;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class CTDLQueue_DisplayCcreen {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> queue = new LinkedList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            // Thêm các phần tử vào PriorityQueue
            for (int i = 0; i < n; i++) {
                priorityQueue.add(scanner.nextInt());
            }

            int k = scanner.nextInt();
            Integer temNum = priorityQueue.poll();

            // Xử lý các phần tử trong PriorityQueue và thêm vào Queue
            while (!priorityQueue.isEmpty()) {
                if (!temNum.equals(priorityQueue.peek())) {
                    queue.add(temNum);
                }
                temNum = priorityQueue.poll();
            }
            queue.add(temNum);  // Thêm phần tử cuối cùng vào queue

            // In ra các phần tử cuối cùng trong Queue
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                if (i >= queueSize - k) {
                    System.out.print(queue.poll() + " ");
                } else {
                    queue.poll();  // Loại bỏ các phần tử không cần thiết
                }
            }
        }
    }
}
