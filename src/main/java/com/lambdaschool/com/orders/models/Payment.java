package com.lambdaschool.com.orders.models;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;
    private String type;


}
