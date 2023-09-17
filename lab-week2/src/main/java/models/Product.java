package models;

import enums.ProductStatus;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    @Column(name = "name", length = 150, nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "unit", nullable = false)
    private String unit;
    @Column(name = "manufacturer_name", length = 150,nullable = false)
    private String manufacturerName;
    @Column(name = "status", nullable = false)
    private ProductStatus status;
}
