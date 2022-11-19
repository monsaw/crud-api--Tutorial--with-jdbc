package com.example.crudwithjdbcmysql.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Tutorial {
    private Long id;
    private String title;
    private String description;
    private Boolean published;

    public Tutorial(String title, String description, boolean b) {
        this.title =title;
        this.description = description;
        this.published = b;
    }
}
