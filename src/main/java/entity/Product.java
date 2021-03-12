package entity;

import java.sql.Date;

public class Product {
    private Integer prodictId;
    private String name;
    private Double price;
    private int type;
    private String decription;
    private Date createdAt;
    private Date modifiedAt;

    public Product() {
    }

    public Product(Integer prodictId, String name, Double price, int type, String decription, Date createdAt, Date modifiedAt) {
        this.prodictId = prodictId;
        this.name = name;
        this.price = price;
        this.type = type;
        this.decription = decription;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Integer getProdictId() {
        return prodictId;
    }

    public void setProdictId(Integer prodictId) {
        this.prodictId = prodictId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodictId=" + prodictId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", decription='" + decription + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}
