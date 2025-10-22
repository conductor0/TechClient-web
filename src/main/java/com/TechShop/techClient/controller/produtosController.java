/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.controller;

import com.TechShop.techClient.data.produtosEntity;
import com.TechShop.techClient.service.ProdutosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/produtos")
public class produtosController {
    @Autowired
    ProdutosService produtosService;
    
    @GetMapping("/listar")
    public List listarProdutos(){
        List <produtosEntity> produtos = produtosService.listarProdutos();
        return produtos;
    }
}
