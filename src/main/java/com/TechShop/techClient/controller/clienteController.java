/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.controller;


import com.TechShop.techClient.data.clienteEntity;
import com.TechShop.techClient.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/clientes")
public class clienteController {
    @Autowired
    ClienteService clienteService;
    
    @PostMapping("/adicionar")
    public String registrarCliente(@ModelAttribute clienteEntity client) {
        clienteService.registrarCliente(client);
        return "telaPrincipal";
    }
    
    @GetMapping("/telaPrincipal")
    public String redirecionar(){
        return "telaPrincipal";
    }

}
