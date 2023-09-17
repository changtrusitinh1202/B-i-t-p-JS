package models;

import jakarta.persistence.*;

public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long id;
    @ManyToOne
    @Column(name = "product_id", nullable = false)
    private Product product;
    @Column(name = "path", nullable = false)
    private String path;

}
