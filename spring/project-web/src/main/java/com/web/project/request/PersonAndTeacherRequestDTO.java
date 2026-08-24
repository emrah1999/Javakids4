package com.web.project.request;

import lombok.Data;

@Data
public class PersonAndTeacherRequestDTO {
    private String teacherName;
    private String teacherSubject;
    private String teacherSalary;
    private String personName;
    private String personEmail;
}
