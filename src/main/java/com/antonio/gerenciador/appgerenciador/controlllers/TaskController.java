/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.gerenciador.appgerenciador.controlllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ANTONIO
 */
@RestController
@RequestMapping("/api/gerenciador")
public class TaskController {
    
    @GetMapping("/home")
    public String home(){
        return "O serviço está online";
    }
    
}
