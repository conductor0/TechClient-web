/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.data;

import jakarta.persistence.*;
import lombok.Data; 
@Data 
@Entity 
@Table(name="cliente") 
public class clienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cliente_id;
    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;
    private String email;
}

