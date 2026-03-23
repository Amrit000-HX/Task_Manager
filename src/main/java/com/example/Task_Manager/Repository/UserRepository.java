package com.example.Task_Manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Task_Manager.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {


    User findByUsername(String username);

}