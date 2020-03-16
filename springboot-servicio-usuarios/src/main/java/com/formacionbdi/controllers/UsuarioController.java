package com.formacionbdi.controllers;

import java.util.List;

import javax.sound.midi.Patch;

import com.formacionbdi.models.dao.UsuarioDao;

import com.formacionbdi.models.entity.Usuario;

import com.jayway.jsonpath.internal.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UsuarioController
 */
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping(value = "/list")
    public List<Usuario> getCities()
    {
        List<Usuario> usuarios = usuarioDao.
    }

}