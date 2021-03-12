package entity;

import java.sql.Date;
import java.time.LocalDateTime;

public class Product {
    private Integer prodictId;
    private String name;
    private Double price;
    private int type;
    private String decription;
    private LocalDateTime createdAt;
    private Date modifiedAt;

    public Product() {
    }

    public Product(Integer prodictId, String name, Double price, int type, String decription, LocalDateTime createdAt, Date modifiedAt) {
        this.prodictId = prodictId;
        this.name = name;
        this.price = price;
        this.type = type;
        this.decription = decription;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
