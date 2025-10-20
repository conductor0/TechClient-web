/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.service;

import com.TechShop.techClient.data.produtosEntity;
import com.TechShop.techClient.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutosService {
    @Autowired
    ProdutosRepository produtosRepository;
    
    public List<produtosEntity> listarProdutos () {
        return produtosRepository.findAll();
    }
}
