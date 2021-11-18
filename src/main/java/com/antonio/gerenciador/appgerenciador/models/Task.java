/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.gerenciador.appgerenciador.models;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private Timestamp dateCreation;
    private Timestamp lastModification;
    
    
    
}
