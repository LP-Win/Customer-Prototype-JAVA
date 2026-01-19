package co.istad.customerPrototype;

import java.time.LocalDate;

public class CustomerPrototype {
    static void main() {
        ConcreteCustomer concreteCustomer1 = new ConcreteCustomer(
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

        ConcreteCustomer concreteCustomer2 = (ConcreteCustomer) concreteCustomer1.clone();
        concreteCustomer2.setId(02);
        concreteCustomer2.setRank("Silver");
        concreteCustomer2.setStatus(false);

        ConcreteCustomer concreteCustomer3 = (ConcreteCustomer) concreteCustomer2.clone();
        concreteCustomer3.setId(03);
        concreteCustomer3.setName("Tohka");
        concreteCustomer3.setHeight(1.70);

        ConcreteCustomer concreteCustomer4 = (ConcreteCustomer) concreteCustomer1.clone();
        concreteCustomer4.setId(04);
        concreteCustomer4.setContact(782396421);
        concreteCustomer4.setEmail("happytime@gmail.com");

        ConcreteCustomer concreteCustomer5 = (ConcreteCustomer) concreteCustomer4.clone();
        concreteCustomer5.setId(05);
        concreteCustomer5.setJob("Teacher");
        concreteCustomer5.setPosition("PE");


        System.out.println(concreteCustomer1);
        System.out.println(concreteCustomer2);
        System.out.println(concreteCustomer3);
        System.out.println(concreteCustomer4);
        System.out.println(concreteCustomer5);
    }
}
