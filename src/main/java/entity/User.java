package entity;

import java.sql.Date;

public class User {
    private Integer userId;
    private String name;
    private String surname;
    private String userCode;
    private Double bonus;
    private Date createdAt;
    private Date modifiedAt;

    public User() {
    }

    public User(Integer userId, String name, String surname, String userCode, Double bonus, Date createdAt, Date modifiedAt) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.userCode = userCode;
        this.bonus = bonus;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
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
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", userCode='" + userCode + '\'' +
                ", bonus=" + bonus +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}
