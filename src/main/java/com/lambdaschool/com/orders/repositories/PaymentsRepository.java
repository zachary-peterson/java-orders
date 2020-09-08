package com.lambdaschool.com.orders.repositories;

import com.lambdaschool.com.orders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepositorye extends CrudRepository<Payment, Long>
{
}
