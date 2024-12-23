package queue;

import java.util.PriorityQueue;

public class priorityqueue {

public static void main(String[] args) {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        priorityQueue.offer(10);

        // Printing the elements of the priority queue
        System.out.println("Priority Queue elements: " + priorityQueue);

        // Removing elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removing element: " + priorityQueue.poll());
        }
	}
		
}
