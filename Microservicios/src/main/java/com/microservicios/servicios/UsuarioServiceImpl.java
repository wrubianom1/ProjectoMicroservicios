/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservicios.servicios;

import com.microservicios.dao.IUsuarioDAO;
import com.microservicios.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author William_Rubiano
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private IUsuarioDAO iUsuarioDAO;

    @Override
    public void crearUsuario(Usuario nuevoUsuario) {
        System.out.println("Entro a crear el usuario en implementacion");
        iUsuarioDAO.crearUsuario(nuevoUsuario);
    }

}
