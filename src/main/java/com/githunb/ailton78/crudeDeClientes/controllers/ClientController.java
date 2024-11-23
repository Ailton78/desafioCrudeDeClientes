package com.githunb.ailton78.crudeDeClientes.controllers;

import com.githunb.ailton78.crudeDeClientes.dto.ClientDTO;
import com.githunb.ailton78.crudeDeClientes.services.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "clients")
public class ClientController {

    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        ClientDTO dto = service.findById(id);
        return dto;
    }
}
