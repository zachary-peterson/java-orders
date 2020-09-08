package com.lambdaschool.com.orders.services;

import com.lambdaschool.com.orders.models.Customer;
import com.lambdaschool.com.orders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    private CustomersRepository customRepos;

    @Override
    public Customer save(Customer customer)
    {
        return customRepos.save(customer);
    }
}
