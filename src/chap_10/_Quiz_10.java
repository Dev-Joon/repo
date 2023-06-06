package chap_10;

import java.util.ArrayList;
import java.util.List;

public class _Quiz_10 {
    public static void main(String[] args) {
        int price = 5000;

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("챈들러", 50));
        customerList.add(new Customer("레이첼", 42));
        customerList.add(new Customer("모니카", 21));
        customerList.add(new Customer("벤자민", 18));
        customerList.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        System.out.println("--------------");
        customerList.stream()
                .map(x -> x.age >= 20 ? x.name + " " + price : x.name + " 무료")
                .forEach(System.out::println);
    }
}

class Customer {
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
