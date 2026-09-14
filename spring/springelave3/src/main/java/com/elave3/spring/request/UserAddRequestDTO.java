package com.elave3.spring.request;

import com.elave3.spring.customValditation.UsernameUniqueValidation;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserAddRequestDTO {
    @NotNull(message = "Username bosh ola bilmez")
    @NotBlank(message = "Username daxil edilmeyib")
    @Size(min=3,max=30,message = "Username 3-30 simvol araliginda olmalidir")
    @UsernameUniqueValidation(message = "Username unikal olmalidir")
    private String username;

    @NotNull(message = "Shifre bosh ola bilmez")
    @NotBlank(message = "Shifre daxil edilmeyib")
    @Size(min=6,max=30,message = "Shifre 3-30 simvol araliginda olmalidir")
    private String password;

    @NotNull(message = "Dogum tarixi bosh ola bilmez")
    @Past(message = "Dogum tarixi gecerli tarix olmalidir")
    private LocalDate birthDate;

    @NotNull(message = "Unvan bosh ola bilmez")
    @NotBlank(message = "Unvan daxil edilmeyib")
    @Size(min=3,max=30,message = "Unvan 3-30 simvol araliginda olmalidir")
    private String address;

    @NotNull(message = "Maash bosh ola bilmez")
    @Min(value = 100, message = "Maash 100-den az ola bilmez")
    @Max(value = 10000, message = "Maash 10000-den cox ola bilmez")
    private Integer salary;
}
