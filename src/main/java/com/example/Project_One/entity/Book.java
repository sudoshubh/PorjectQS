package com.example.Project_One.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Book")

public class Book {

        // Attributes
        @Id
        private int id;
        private String bookName;
        private String authorName;
    }
