public class TestGenerics {

    public static void main(String[] args) {
        AccountGenerics<String> accountGenerics = new AccountGenerics<String>("ram");
        accountGenerics.show();
        String s = accountGenerics.getObj();
        System.out.println(s);
    }

}
