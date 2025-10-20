/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.data;

import jakarta.persistence.*;
import lombok.Data; 
@Data 
@Entity 
@Table(name="vendas") 
public class vendasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vendas_id;
    private String data_realizada;
    private Integer cliente_id;
    private Integer produto_id;
}
