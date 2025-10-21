/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.controller;


import com.TechShop.techClient.data.clienteEntity;
import com.TechShop.techClient.data.produtosEntity;
import com.TechShop.techClient.data.usuariosEntity;
import com.TechShop.techClient.data.vendasEntity;
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
    
    @GetMapping("cadastrar/usuario")
    public String cadastrarUsuario(Model model){
        model.addAttribute("usuario", new usuariosEntity());
        return "cadastroUsuario";
    }
    
    @GetMapping("cadastrar/Cliente")
    public String cadastrarCliente(Model model){
    model.addAttribute("cliente", new clienteEntity());
    return "cadastroCliente";
    }
    
    @GetMapping("procurar/produto")
    public String listarProdutos(Model model){
        List<produtosEntity> produtos = produtosService.listarProdutos();
        model.addAttribute("produtos", produtos);
        return "procurarProduto";
    }
    
    //placeholder. adicionar funcionalidade no futuro
    @GetMapping("procurar/historico")
    public String procurarHistorico() {
        return "historicoCompras";
    }
}
