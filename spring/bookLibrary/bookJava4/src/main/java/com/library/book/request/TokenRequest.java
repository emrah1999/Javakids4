package com.library.book.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TokenRequest {
    @NotBlank(message = "Refresh token must not be blank")
    @NotNull(message = "Refresh token must not be null")
    private String refreshToken;
}
