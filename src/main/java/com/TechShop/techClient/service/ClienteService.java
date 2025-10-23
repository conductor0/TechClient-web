/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TechShop.techClient.service;


import com.TechShop.techClient.data.clienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TechShop.techClient.repository.ClienteRepository;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    
    public clienteEntity registrarCliente(clienteEntity client) {
        client.setCliente_id(null);
        clienteRepository.save(client);
        return client;
    }
    
    public List<clienteEntity> listarClientes(){
        return clienteRepository.findAll();
    }
}
