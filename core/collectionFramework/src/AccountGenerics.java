public class AccountGenerics<T> {

    T obj;

    AccountGenerics(T obj) {
        this.obj = obj;
    }

    void show() {
        System.out.println("The type of class is " + obj.getClass().getName());
    }

    public T getObj(){
        return obj;
    }

}
