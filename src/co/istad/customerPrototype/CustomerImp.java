package co.istad.customerPrototype;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerImp implements Customer {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private LocalDate dob;
    private Double height;
    private Double weight;
    private String language;
    private String job;
    private String position;
    private String address;
    private Integer contact;
    private String email;
    private Boolean membership;
    private Integer purchase;
    private Integer point;
    private String rank;
    private Integer discount;
    private LocalDate register;
    private Boolean status;

    public CustomerImp(Integer id, String name, Integer age, String gender, LocalDate dob, Double height, Double weight, String language, String job, String position, String address, Integer contact, String email, Boolean membership, Integer purchase, Integer point, String rank, Integer discount, LocalDate register, Boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.language = language;
        this.job = job;
        this.position = position;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.membership = membership;
        this.purchase = purchase;
        this.point = point;
        this.rank = rank;
        this.discount = discount;
        this.register = register;
        this.status = status;
    }

    @Override
    public Customer clone() {
        return new CustomerImp(id, name, age, gender, dob, height, weight, language, job, position, address, contact, email, membership, purchase, point, rank, discount, register, status);
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", location='" + address + '\'' + ", contact=" + contact + ", email='" + email + '\'' + ", membership=" + membership + ", rank='" + rank + '\'' + ", point=" + point + ", register=" + register + '}';
    }
}
