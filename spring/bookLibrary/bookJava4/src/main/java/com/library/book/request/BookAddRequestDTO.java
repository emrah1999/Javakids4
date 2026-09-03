package com.library.book.request;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class BookAddRequestDTO {
    @NotNull(message = "Kitab adi bosh ola bilmez")
    @NotBlank(message = "Kitab adi bosh ola bilmez")
    @Size(min = 2, max = 100, message = "Kitab adi en az 2, en cox 100 simvol olmalidir")
    private String name;

    @NotNull(message = "Kitab muellifi bosh ola bilmez")
    @NotBlank(message = "Kitab muellifi bosh ola bilmez")
    @Size(min = 2, max = 100, message = "Kitab muellifi en az 2, en cox 100 simvol olmalidir")
    private String author;

    @NotNull(message = "Kitab sayi bosh ola bilmez")
    @Min(value=1, message = "Kitab sayi en az 1 olmalidir")
    @Max(value=1000, message = "Kitab sayi en cox 1000 olmalidir")
    private Integer quantity;

    @NotNull(message = "Kitab sehifes bosh ola bilmez")
    @Min(value=5, message = "Kitab sehifes en az 5 olmalidir")
    @Max(value=3000, message = "Kitab sehifes en cox 300 olmalidir")
    private Integer pageCount;

    @NotNull(message = "Kitab buraxilish tarixi bosh ola bilmez")
    @Past(message = "Kitab buraxilish tarixi gecerli tarix olmalidir")
    private LocalDate publishDate;

    private String username;

    @NotNull(message = "Kitab qiymeti bosh ola bilmez")
    @DecimalMin(value = "0.01", message = "Kitab qiymeti en az 0.01 olmalidir")
    @DecimalMax(value = "1000.00", message = "Kitab qiymeti en cox 1000.00 olmalidir")
    private BigDecimal price;
}
