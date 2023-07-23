package com.example.questionanswerboard.member.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Member {
    @Id
    private long memberId;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private LocalDateTime created_at = LocalDateTime.now();

    @Column(nullable = true)
    private LocalDateTime modified_at;
}
