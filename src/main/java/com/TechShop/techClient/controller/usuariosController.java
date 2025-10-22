/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.controller;


import com.TechShop.techClient.data.usuariosEntity;
import com.TechShop.techClient.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/usuarios")
public class usuariosController {
    @Autowired
    UsuariosService usuariosService;
    
    @PostMapping("/adicionar")
    public String registrarUsuario(@ModelAttribute usuariosEntity usu) {
        usuariosService.registrarUsuario(usu);
        return "telaPrincipal";
    }
    
    @GetMapping("/telaPrincipal")
    public String redirecionar(){
        return "telaPrincipal";
    }
}
