package com.example.book_review.entity;

import com.example.book_review.enums.ReviewStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long review_id;
    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    int rating;
    String review;
    LocalDate createAt;
    Enum<ReviewStatus> status;
}
