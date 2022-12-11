package Interfaces;

public interface I_Lista<T>{
    //Declaración de metodos
    void add(T dato);
    void remove(int index);
    T get(int index);
    int indexOf(T dato);
    void print();
    boolean isEmpty();
    void clear();
    int size();
}
