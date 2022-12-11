package Interfaces;

public interface I_Pila<T>{
    void push(T data);
    void pop();
    T peek();
    int lenght();
    boolean isEmpty();
}
