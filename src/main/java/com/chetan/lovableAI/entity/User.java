package com.chetan.lovableAI.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Builder
public class User {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String email;
     String passwordHash;
     @Column(nullable = false)
     String name;
     String avatarUrl;
     @CreationTimestamp
     Instant createdAt;
     @UpdateTimestamp
     Instant updatedAt;
     Instant deletedAt;
}
