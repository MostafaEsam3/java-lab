package Mostafa;

public interface  Interface <T> {

        T getReal();
        T getImaginary();
    
        Interface<T> add(Interface<T> z);
        Interface<T> subtract(Interface<T>z);
        Interface<T> prod(Interface<T> z);
        Interface<T> div(Interface<T> z);
}