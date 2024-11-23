package com.githunb.ailton78.crudeDeClientes.services;

import com.githunb.ailton78.crudeDeClientes.dto.ClientDTO;
import com.githunb.ailton78.crudeDeClientes.entities.Client;
import com.githunb.ailton78.crudeDeClientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private  ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).get();
        return  new ClientDTO(client);
    }
    @Transactional(readOnly = true)
    public List<ClientDTO> findAll(){
        List<Client> list = repository.findAll();
        return list.stream().map(ClientDTO::new).toList();
    }
    @Transactional
    public ClientDTO insert(ClientDTO dto){
        Client entity = new Client();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ClientDTO(entity);
    }
    @Transactional
    public ClientDTO update(Long id, ClientDTO dto){
        Client entity = repository.getReferenceById(id);
        copyDtoToEntity(dto, entity);
        repository.save(entity);
        return new ClientDTO(entity);
    }
    @Transactional
    public void delete(Long id){
        repository.deleteById(id);
    }

    private void copyDtoToEntity(ClientDTO dto, Client entity) {
       entity.setName(dto.getName());
       entity.setCpf(dto.getCpf());
       entity.setBirthDate(dto.getBirthDate());
       entity.setChildren(dto.getChildren());
       entity.setIncome(dto.getIncome());
    }

}
