package com.headwayclone.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String category;
    private String summary;
    private String coverImageUrl; // Over here, we'll fix in the URL to a placeholder image
}