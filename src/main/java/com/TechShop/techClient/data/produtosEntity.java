/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.data;

import jakarta.persistence.*;
import lombok.Data; 
@Data 
@Entity 
@Table(name="produtos") 
public class produtosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer produtos_id;
    private String nome_produto;
    private String quantidade;
    private String valor;
    private String marca;
}
