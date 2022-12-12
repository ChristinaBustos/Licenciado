package Interfaces;

public interface I_Lista{
    //Declaración de metodos
    void add(Object dato);
    void remove(int index);
    Object get(int index);
    int indexOf(Object dato);
    void print();
    boolean isEmpty();
    void clear();
    int size();
}
