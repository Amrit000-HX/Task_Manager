package com.example.Task_Manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Task_Manager.Model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {


    List <Task> findByUsername(String username);

}