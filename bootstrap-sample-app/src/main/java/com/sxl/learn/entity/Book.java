package com.sxl.learn.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false,unique = true)
    private String title;

    @Column(nullable = false)
    private String author;
}
