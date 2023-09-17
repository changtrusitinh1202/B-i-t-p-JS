package models;

import enums.EmployeeStatus;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;
    @Column(name = "full_name", length = 150, nullable = false)
    private String fullName;
    @Column(name = "dob", nullable = false)
    private LocalDate dob;
    @Column(name = "email", unique = true, length = 150)
    private String email;
    @Column(name = "phone", length = 15, nullable = false)
    private String phone;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "status", nullable = false)
    private EmployeeStatus status;

}
