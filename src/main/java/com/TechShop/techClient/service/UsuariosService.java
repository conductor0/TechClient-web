/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.service;

import com.TechShop.techClient.data.usuariosEntity;
import com.TechShop.techClient.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    @Autowired
    UsuariosRepository usuariosRepository;
    
    public usuariosEntity registrarCliente(usuariosEntity usuarios) {
        usuarios.setUsuario_id(null);
        usuariosRepository.save(usuarios);
        return usuarios;
    }
}
