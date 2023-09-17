package models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;
    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;
    @Column(name = "emp_id", nullable = false)
    private Employee employee;
    @Column(name = "cus_id", nullable = false)
    private Customer customer;
}
