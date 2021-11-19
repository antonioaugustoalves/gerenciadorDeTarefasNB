/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.gerenciador.appgerenciador.services;

import com.antonio.gerenciador.appgerenciador.models.Task;
import com.antonio.gerenciador.appgerenciador.repositories.TaskRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ANTONIO
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Task> getTasks() {
        List<Task> taskList = new ArrayList<>();
        repository.findAll().forEach(taskList::add);
        return taskList;
    }

    @Override
    public Task getTaskById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Task insert(Task task) {
        return repository.save(task);
    }

    @Override
    public void updateTask(Long id, Task task) {
        Task oldTask = repository.findById(id).get();
        System.out.println("Old task:" + oldTask.toString());
        oldTask.setTitle(task.getTitle());
        oldTask.setDescription(task.getDescription());
        oldTask.setStatus(task.getStatus());
        repository.save(oldTask);
    }

    @Override
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }

}
