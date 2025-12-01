public class Temp {

    @Override
    protected void finalize() throws Throwable {
        
        System.out.println("This is finalize method ");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Temp class ";
    }

    

}
