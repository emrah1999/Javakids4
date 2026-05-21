package com.book.spring_project.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrdinaryClass {

    @Value("${spring.profiles.active}")  // value annotasiyasina gelen melumatlar string tipinde gelir
    private String projectName;

    @Value("${server.port}")
    public int port; //long

    @Value("#{'${app.lang}'.split(',')}")  // value annotasiyasina gelen melumatlar string tipinde gelir, split ile ayırarak listeye atar
    public List<String> langs;

    @Value("${app.active_status}")
    public boolean activeStatus;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
