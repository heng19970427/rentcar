package com.rentcar.pojo;

public class User {
    private Integer userId;
    private String username;
    private String password;
    private String token;
    private String company;
    private String companyLocation;
    private String phone;
    private String account;
    private String email;
    private String img;
    private String note;
    private boolean verified;
    private Integer verfyId;
    private Integer vipLevel;
    private Integer roleId;
    private IDCard idCard;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", company='" + company + '\'' +
                ", companyLocation='" + companyLocation + '\'' +
                ", phone='" + phone + '\'' +
                ", account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", img='" + img + '\'' +
                ", note='" + note + '\'' +
                ", verified=" + verified +
                ", verfyId=" + verfyId +
                ", vipLevel=" + vipLevel +
                ", roleId=" + roleId +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Integer getVerfyId() {
        return verfyId;
    }

    public void setVerfyId(Integer verfyId) {
        this.verfyId = verfyId;
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }
}
