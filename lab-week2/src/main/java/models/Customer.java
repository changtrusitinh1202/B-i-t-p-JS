package models;

import enums.EmployeeStatus;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private long id;
    @Column(name = "name", length = 150, nullable = false)
    private String name;
    @Column(name = "email", unique = true, length = 150)
    private String email;
    @Column(name = "phone", length = 15, nullable = false)
    private String phone;
    @Column(name = "address", nullable = false)
    private String address;

}
