
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        // Creation of all objects
        DequeInput dequeInput = new DequeInput();
        Collection pro = new Collections();

        // Getting input and  retrieving all the return values from the input methods
        int dequeSize = dequeInput.getSize();
        int sizeOfSubset = dequeInput.getSubsetSize();

        Deque<Integer> deque = dequeInput.getDeque();
        System.out.println();

        int output = pro.process((ArrayDeque<Integer>) deque, sizeOfSubset);
        System.out.println(output);
    }
}