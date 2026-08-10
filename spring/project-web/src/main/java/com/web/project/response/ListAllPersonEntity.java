package com.web.project.response;

import lombok.Data;

import java.util.List;

@Data
public class ListAllPersonEntity {
    private List<ListPersonEntityDTO> persons;
    private int totalElements;
    private int totalPages;
    private int currentPage;
    private int size;

}
