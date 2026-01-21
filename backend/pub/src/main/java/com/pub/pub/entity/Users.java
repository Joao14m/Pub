package com.pub.pub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId; 

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roleId;

    @Column(name = "email", unique = true)
    private String email;
    
    @Column(name = "password_hash")
    private String passwordHash; 

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "university")
    private String university;

    @Column(name = "userprofilepic")
    private String userprofilepic;
}
