/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.controller;


import com.TechShop.techClient.service.ClienteService;
import com.TechShop.techClient.service.ProdutosService;
import com.TechShop.techClient.service.UsuariosService;
import com.TechShop.techClient.service.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Controller
public class miscController {
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private UsuariosService usuariosService;
    @Autowired
    private VendasService vendasService;
    @Autowired
    private ProdutosService produtosService;
    
    @GetMapping("navegar/telaPrincipal")
    public String telaPrincipal () {
        return "telaPrincipal";
    }
    
}
