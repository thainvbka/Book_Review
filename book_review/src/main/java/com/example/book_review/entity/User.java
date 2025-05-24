package com.example.book_review.entity;

import com.example.book_review.enums.Role;
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long user_id;
    String username;
    String password;
    String email;
    Enum<Role> role;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Review> reviewList;
}
