package entity;

public class UserProduct {
    private Integer userProductId;
    private User userId;
    private Product productId;

    public UserProduct() {
    }

    public UserProduct(Integer userProductId, User userId, Product productId) {
        this.userProductId = userProductId;
        this.userId = userId;
        this.productId = productId;
    }

    public Integer getUserProductId() {
        return userProductId;
    }

    public void setUserProductId(Integer userProductId) {
        this.userProductId = userProductId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "UserProduct{" +
                "userProductId=" + userProductId +
                ", userId=" + userId +
                ", productId=" + productId +
                '}';
    }
}
