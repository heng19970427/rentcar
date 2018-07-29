package com.rentcar.pojo;

public class OrderForm {
    private Order order;
    private IdCard idCard;
    private User user;
    private DisCountPackage disCountPackage;

    public DisCountPackage getDisCountPackage() {
        return disCountPackage;
    }

    public void setDisCountPackage(DisCountPackage disCountPackage) {
        this.disCountPackage = disCountPackage;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
