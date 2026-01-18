package co.istad.customerPrototype;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    static void main() {
        Customer customer1 = new Customer(
                01,
                "LP",
                20,
                "Male",
                LocalDate.of(2006, 01, 11),
                1.60,
                50.55,
                "Khmer",
                "IT",
                "Security",
                "PP",
                123456789,
                "customer@gmail.com",
                true,
                5,
                20,
                "brown",
                5,
                LocalDate.now(),
                true

        );

        Customer customer2 = (Customer) customer1.clone();
        customer2.setId(02);
        customer2.setRank("Silver");
        customer2.setStatus(false);

        Customer customer3 = (Customer) customer2.clone();
        customer3.setId(03);
        customer3.setName("Tohka");
        customer3.setHeight(1.70);

        Customer customer4 = (Customer) customer1.clone();
        customer4.setId(04);
        customer4.setContact(782396421);
        customer4.setEmail("happytime@gmail.com");

        Customer customer5 = (Customer) customer4.clone();
        customer5.setId(05);
        customer5.setJob("Teacher");
        customer5.setPosition("PE");


        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);
        System.out.println(customer5);
    }
}
