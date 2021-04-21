package com.example.demo.model.user;

import org.hibernate.validator.constraints.*;

import javax.validation.constraints.Size;

public class SignUpForm {
    private Long id;

    @NotBlank
    @Size(min = 10, max = 30)
    private String username;


    @NotBlank
    @Size(min = 6, max = 8)
    private String password;

    @NotBlank
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
