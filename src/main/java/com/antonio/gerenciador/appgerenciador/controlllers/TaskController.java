/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.gerenciador.appgerenciador.controlllers;

import com.antonio.gerenciador.appgerenciador.models.Task;
import com.antonio.gerenciador.appgerenciador.services.TaskService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ANTONIO
 */
@RestController
@RequestMapping("/api/gerenciador")
public class TaskController {

    @Autowired
    TaskService service;

    @GetMapping("/home")
    public String home() {
        return "O serviço está online";
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = service.getTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<Task> getTask(@PathVariable Long taskId) {
        return new ResponseEntity<>(service.getTaskById(taskId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Task> saveTask(@RequestBody Task task) {
        Task ts = service.insert(task);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("task", "/api/tasks/" + ts.getId().toString());
        return new ResponseEntity<>(ts, httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Task> updateTask(
            @PathVariable Long id, @RequestBody Task task) {

        service.updateTask(id, task);

        return new ResponseEntity<Task>(service.getTaskById(id), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<Task> deleteTask(@PathVariable Long id){
		service.deleteTask(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}

}
