import java.lang.annotation.ElementType;

public class MyQueue {

    private int[] elements;
    private int counter;

    public MyQueue(int size) {
        this.elements = new int[size];
        this.counter = 0;
    }


}
