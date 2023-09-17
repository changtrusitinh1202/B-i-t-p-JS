package models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class ProductPrice {
    @Id
    @ManyToOne
    @Column(name = "product_id")
    private Product product;
    @Column(name = "price_date_time", nullable = false)
    private LocalDate priceDateTime;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "note")
    private String note;
}
