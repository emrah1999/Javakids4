package com.emrah.ecommerce.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RequestAddUserDTO {
    @NotBlank(message = "Username is required")
    @NotNull(message = "Username cannot be null")
    private String username;

    @NotBlank(message = "Password is required")
    @NotNull(message = "Password cannot be null")
    private String password;

    @NotBlank(message = "Name is required")
    @NotNull(message = "Name cannot be null")
    private String name;

    @NotBlank(message = "Surname is required")
    @NotNull(message = "Surname cannot be null")
    private String surname;

    @NotBlank(message = "Email is required")
    @NotNull(message = "Email cannot be null")
    private String email;

}
