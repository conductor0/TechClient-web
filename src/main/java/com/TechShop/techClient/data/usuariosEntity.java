/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.data;

import jakarta.persistence.*;
import lombok.Data; 
@Data 
@Entity 
@Table(name="usuario") 
public class usuariosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer usuario_id;
    private String login;
    private String senha;
}
