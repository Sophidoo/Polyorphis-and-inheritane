package org.example;

import org.example.Bank.CustomerImpl;
import org.example.Bank.Customers;
import org.example.Bank.Person;
import org.example.Bank.Student;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        var poly = new PolyDemo();
//
//        poly.userRegisteration("onyeka", "sophia");
//        String s = poly.userRegisteration(1234L, "sophie", "onyeka");
//
//        System.out.println(s);
//
//        PolyDynamic p = new PolyDynamic();
//        Lambo v = new Lambo();
//        v.speed();

        Customers customer = new Customers();
        CustomerImpl impl = new CustomerImpl();
        customer.setCustomerId((1234L));
        customer.setCustomerName("Sophia");
        customer.setLastName("Okosodo");
        customer.setAccountNumber(BigInteger.valueOf(12345678L));

        impl.createCustomer(customer);
        impl.toString();

        Person p  = new Person(101L, "Sophia", "Okosodo");

        Student student = new Student(101L, "Sophia", "Okosodo", "Computer Science", "U2020/5570046", 200);
        Person per = new Student(101L, "Sophia", "Okosodo", "Computer Science", "U2020/5570046", 200);
        Person per2 = new Student(101L, "Mary", "Ottt", "Computer Science", "U2020/5570046", 300);

        List<Person> user = new ArrayList<>();
        user.add(per);
        user.add(per2);
        List<Student> students = new ArrayList<>();
//        user.stream().forEach(u -> System.out.println(u));
//        System.out.println(per.toString());
//        System.out.println(student.toString());

        students.stream().filter(stud -> stud.getLevel() > 200)
                .forEach(stud -> System.out.println(stud));
    }
}