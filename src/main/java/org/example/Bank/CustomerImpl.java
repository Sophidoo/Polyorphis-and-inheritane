package org.example.Bank;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CustomerImpl implements  CustomerService{

    @Override
    public void createCustomer(Customers customer) {
        customer.getCustomerId();
        customer.getCustomerName();
        customer.getLastName();
        customer.getAccountNumber();
        customer.toString();
    }

    @Override
    public String deleteCustomer(Long id, Customers customer) {
        return null;
    }

    @Override
    public void updateCustomer(Long id, Customers customer) {

    }

    @Override
    public String transfer(BigDecimal amount, BigInteger accountNo) {
        return null;
    }

    @Override
    public String checkBalance() {
        return null;
    }

    @Override
    public String withdrawal(BigInteger pin, BigDecimal Amount) {
        return null;
    }

    @Override
    public String deposit(int Amount) {
        return null;
    }
}
