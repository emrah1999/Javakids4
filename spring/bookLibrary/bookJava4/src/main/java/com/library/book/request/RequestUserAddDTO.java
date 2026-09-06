package com.library.book.request;

import com.library.book.customValidation.UniqueUsername;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestUserAddDTO {
    @NotBlank(message = "Username is required")
    @UniqueUsername(message = "Username sistemde movcuddur")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password en az 6 simvol olmalidir")
    private String password;
}
