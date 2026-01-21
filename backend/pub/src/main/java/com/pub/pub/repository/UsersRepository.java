package com.pub.pub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pub.pub.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{    
    // public Users findByEmail(String email);
    // public Users findByEmailAndPassword(String email, String passwordHash);
    // public Users findByUsername(String username);
}

