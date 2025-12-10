package OOPs;

public class Account {

    private int accId;
    private String name;
    private double balace;

    public Account(int accId, String name, double balace) {
        // accId = 1001;
        // name = "Ram";
        // balace = 50000.0;
        this.accId = accId;
        this.name = name;
        this.balace = balace;
        System.out.println("Constructor is called");
    }

    public void showAccount() {
        System.out.println("id = " + accId + " name = " + name + " balace =" + balace);
    }

}
