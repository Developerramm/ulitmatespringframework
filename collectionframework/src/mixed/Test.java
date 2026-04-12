// package mixed;

// import java.util.Comparator;
// import java.util.TreeSet;

// class MyComparator implements Comparator<Customer> {

//     @Override
//     public int compare(Customer o1, Customer o2) {

//         return -o1.id.compareTo(o2.id);
//     }

// }

// class Customer implements Comparable<Customer> {

//     String id;
//     String name;
//     String address;

//     public Customer(String id, String name, String address) {
//         this.id = id;
//         this.name = name;
//         this.address = address;
//     }

//     @Override
//     public String toString() {
//         return "Customer [id=" + id + ", name=" + name + ", address=" + address + "] \n";
//     }

//     @Override
//     public int compareTo(Customer customer) {
//         return this.id.compareTo(customer.id);
//     }

// }

// public class Test {

//     public static void main(String[] args) {
//         System.out.println("Ram kumar springboot developer");
//         System.out.println("Hello world");

//         Customer c1 = new Customer("111", "Ram", "Sitamarhi");
//         Customer c2 = new Customer("222", "Mohit", "Patna");
//         Customer c3 = new Customer("333", "Sarita", "Maniyari");
//         Customer c4 = new Customer("444", "Sahil", "Maniyari");
//         Customer c5 = new Customer("555", "Suraj", "Noida");

//         MyComparator mc = new MyComparator();
//         TreeSet<Customer> ts = new TreeSet<Customer>(mc);
//         ts.add(c5);
//         ts.add(c4);
//         ts.add(c1);
//         ts.add(c3);
//         ts.add(c2);

//         System.out.println(ts);
//     }

// }
