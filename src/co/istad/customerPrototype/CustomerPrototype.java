package co.istad.customerPrototype;

import java.time.LocalDate;

public class CustomerPrototype {
    static void main() {
        CustomerImp customerImp1 = new CustomerImp(
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

        CustomerImp customerImp2 = (CustomerImp) customerImp1.clone();
        customerImp2.setId(02);
        customerImp2.setRank("Silver");
        customerImp2.setStatus(false);

        CustomerImp customerImp3 = (CustomerImp) customerImp2.clone();
        customerImp3.setId(03);
        customerImp3.setName("Tohka");
        customerImp3.setHeight(1.70);

        CustomerImp customerImp4 = (CustomerImp) customerImp1.clone();
        customerImp4.setId(04);
        customerImp4.setContact(782396421);
        customerImp4.setEmail("happytime@gmail.com");

        CustomerImp customerImp5 = (CustomerImp) customerImp4.clone();
        customerImp5.setId(05);
        customerImp5.setJob("Teacher");
        customerImp5.setPosition("PE");


        System.out.println(customerImp1);
        System.out.println(customerImp2);
        System.out.println(customerImp3);
        System.out.println(customerImp4);
        System.out.println(customerImp5);
    }
}
