package OOPLab3.Model;

public interface IStack {
    void push(int element);
    int pop();
    int peek();
    void clear();
    void elements();
    boolean isEmpty();
    boolean isFull();

}
