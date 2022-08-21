public class ArrayManager {
    public static void main(String[] args) {

        // Stack
        Stack stack = new Stack();
        stack.push("１番目");
        stack.push("２番目");
        stack.push("３番目");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // RandomQueue
        RandomQueue randomQueue = new RandomQueue();
        randomQueue.push("１番目");
        randomQueue.push("２番目");
        randomQueue.push("３番目");
        System.out.println(randomQueue.pop());
        System.out.println(randomQueue.pop());
        System.out.println(randomQueue.pop());

        // Queue
        Queue queue = new Queue();
        queue.push("1 番目", 10);
        queue.push("2 番目", 10);
        queue.push("3 番目", 100);
        queue.push("4 番目", 50);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}