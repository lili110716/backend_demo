package com.example.demo.pojo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDto {
//    @NotBlank(message = "用户名不能为空！")
//    @NotEmpty 上面的校验规则会自动去掉空格而这个不会
//    @NotNull  校验不能为null
    private Integer userId;
    @NotBlank(message = "用户名不能为空！")
    private String userName;
    @NotBlank(message = "密码不能为空！")
    private String password;
    @Email(message = "邮箱格式不正确！")
    private String email;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
