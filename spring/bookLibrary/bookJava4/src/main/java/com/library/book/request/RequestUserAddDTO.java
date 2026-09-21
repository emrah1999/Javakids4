package com.library.book.request;

import com.library.book.customValidation.UniqueUsername;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RequestUserAddDTO {
    @NotBlank(message = "Username is required")
    @UniqueUsername(message = "Username sistemde movcuddur")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password en az 6 simvol olmalidir")
    private String password;

    @NotBlank(message = "Name is required")
    @Size(min = 2, message = "Ad en az 6 simvol olmalidir")
    private String name;

    @NotNull(message = "Type is required")
    @Min(value = 1, message = "Type must be either 1 (librarian) or 2 (student)")
    @Max(value = 2, message = "Type must be either 1 (librarian) or 2 (student)")
    private Integer type; // 1 librarian, 2 student
}
