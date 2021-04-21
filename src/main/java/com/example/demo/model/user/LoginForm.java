package com.example.demo.model.user;

import javax.validation.constraints.*;

public class LoginForm {
    @NotBlank
    @Size(min = 10, max = 30)
    private String username;

    @NotBlank
    @Size(min = 6, max = 8)
    private String password;

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
}
