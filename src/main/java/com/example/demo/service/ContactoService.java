package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contacto;
import com.example.demo.repository.ContactoRepository;

@Service
public class ContactoService implements IContactoService{

    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    public List<Contacto> listarContactos() {
        return (List<Contacto>)contactoRepository.findAll();
    }

    @Override
    public void guardar(Contacto contacto) {
        contactoRepository.save(contacto);
    }

    @Override
    public Contacto buscarId(Long id) {
        return contactoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        contactoRepository.deleteById(id);
    }

}
