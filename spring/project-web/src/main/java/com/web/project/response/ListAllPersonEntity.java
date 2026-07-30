package com.web.project.response;

import lombok.Data;

import java.util.List;

@Data
public class ListAllPersonEntity {
    private List<ListPersonEntityDTO> persons;
}
