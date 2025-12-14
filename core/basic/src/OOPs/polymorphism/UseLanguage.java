package OOPs.polymorphism;

public class UseLanguage {

    public static void main(String[] args) {
        Language ln = new Hindi();
        ln.greeting();
        ln = new English();
        ln.greeting();
        ln = new French();
        ln.greeting();
    }

}
