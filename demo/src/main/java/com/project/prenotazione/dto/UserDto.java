package com.project.prenotazione.dto;


import io.swagger.annotations.ApiModelProperty;

public class UserDto {

    @ApiModelProperty(position = 1, value = "username", dataType = "String", example = "user")
    private String username;

    @ApiModelProperty(position = 2, value = "password", dataType = "String", example = "123456")
    private String password;

    public UserDto() {
    }

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
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
}
