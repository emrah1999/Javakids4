package com.web.project.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Builder
//@RequiredArgsConstructor //addresi inject edir
public class User {
    private String username;
    private String password;
    private String email;
    private String fullName;
    private LocalDate birthday;
    private String phoneNumber;

//    private final Address address;


}
