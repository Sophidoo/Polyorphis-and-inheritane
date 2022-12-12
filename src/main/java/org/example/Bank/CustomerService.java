package org.example.Bank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public interface CustomerService {
    public void createCustomer(Customers customer);
    public List<Customers> allCustomer =  new ArrayList<>();
    public String deleteCustomer(Long id, Customers customer);
    public void updateCustomer(Long id, Customers customer);

//    account functions
    public String transfer(BigDecimal amount, BigInteger accountNo);
    public String checkBalance();
    public String withdrawal(BigInteger pin, BigDecimal Amount);

    public String deposit(int Amount);



}
