/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.gerenciador.appgerenciador;

import com.antonio.gerenciador.appgerenciador.models.Status;
import com.antonio.gerenciador.appgerenciador.models.Task;
import com.antonio.gerenciador.appgerenciador.repositories.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author ANTONIO
 */
@Component
public class TaskLoader implements CommandLineRunner {

    public final TaskRepository repository;

    public TaskLoader(TaskRepository repository) {
        this.repository = repository;
    }

    private void loadTasks() {
        if (repository.count() == 0) {
            Task t1 = new Task();
            t1.setTitle("Ir ao cinema");
            t1.setDescription("Assisitir ao novo filme do miranha");
            t1.setStatus(Status.NOT_COMPLETE);
            
            repository.save(t1);
            
            Task t2 = new Task();
            t2.setTitle("Corrigir provas");
            t2.setDescription("Corrigir as provas do 8º ano");
            t2.setStatus(Status.IN_PROGRESS);
            repository.save(t2);
            
            Task t3 = new Task();
            t3.setTitle("Reunião escolar");
            t3.setDescription("Reunião escolar para definir quem passa e que será reprovado muhahahaaha");
            t3.setStatus(Status.NOT_COMPLETE);
            repository.save(t3);
            
            Task t4 = new Task();
            t4.setTitle("Ir no dentista");
            t4.setDescription("Fazer limpeza e manutenção do sorriso");
            t4.setStatus(Status.COMPLETE);
            repository.save(t4);
            
            System.out.println("Carrengando dados...");
        }
    }

    @Override
    public void run(String... args) throws Exception {
        loadTasks();
    }

}
