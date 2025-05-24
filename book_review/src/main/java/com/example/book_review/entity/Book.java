package com.example.book_review.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long book_id;
    String title;
    String author;
    String description;
    int publishedYear;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    List<Review> reviewList;
}
