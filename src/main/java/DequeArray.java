import java.util.*;


public class DequeArray {

    static ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

    static public void createArray() {

        queue.add(2);
        queue.add(2);
        queue.add(3);
        queue.add(3);
        queue.add(4);
        queue.add(2);
        queue.add(2);
        queue.add(2);
        queue.add(3);

    }
    static public void createSubArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of subArray :");
        int sub_array = scanner.nextInt();
        
        int count = 0;
        int counter = 1;
        HashSet<Integer> newSet = new HashSet<>();

        while (queue.size() >= sub_array){
            Iterator<Integer> queueIterator = queue.iterator();
                while (queueIterator.hasNext() && count < sub_array) {
                    newSet.add(queueIterator.next());
                    count++;
                }
            if (newSet.size() > counter) {
                counter += newSet.size();
            }
                queue.removeFirst();
                newSet.clear();
            }
        System.out.println("Unique digits are : " + counter);
        scanner.close();
        }

    public static void main(String[] args) {
        createArray();
        createSubArray();
    }
}
