/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.gerenciador.appgerenciador.repositories;

import com.antonio.gerenciador.appgerenciador.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ANTONIO
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{
    
}
