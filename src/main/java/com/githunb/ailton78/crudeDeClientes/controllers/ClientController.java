package com.githunb.ailton78.crudeDeClientes.controllers;

import com.githunb.ailton78.crudeDeClientes.dto.ClientDTO;
import com.githunb.ailton78.crudeDeClientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        ClientDTO dto = service.findById(id);
        return dto;
    }
    @GetMapping
    public List<ClientDTO> findAll(){
        List<ClientDTO> dto = service.findAll();
        return dto;
    }
    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto){
        dto = service.insert(dto);
        return dto;
    }

}
