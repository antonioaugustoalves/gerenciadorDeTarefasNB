/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.gerenciador.appgerenciador.services;

import com.antonio.gerenciador.appgerenciador.models.Task;
import java.util.List;

/**
 *
 * @author ANTONIO
 */
public interface TaskService {

    List<Task> getTasks();
    Task getTaskById(Long id);
    Task insert(Task task);
    void updateTask(Long id, Task task);
    void deleteTask(Long id);
}
