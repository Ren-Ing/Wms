package com.example.demo.entity;

import com.example.demo.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntity extends JpaRepository<User, Integer> {

    public Optional<User> findById(Integer id);
}
