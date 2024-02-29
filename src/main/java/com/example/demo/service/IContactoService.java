package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Contacto;

public interface IContactoService {
    public List<Contacto> listarContactos();
    public void guardar(Contacto contacto);
    public Contacto buscarId(Long id);
    public void eliminar(Long id);
}
