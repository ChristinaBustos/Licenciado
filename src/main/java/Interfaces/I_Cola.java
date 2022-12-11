package Interfaces;

public interface I_Cola<T>{
    void queue(T dato);
    T dequeue();
    int length();
    boolean isEmpty();
    T peek();
}
