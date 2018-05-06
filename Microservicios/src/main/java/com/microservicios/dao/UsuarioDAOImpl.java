/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservicios.dao;

import com.microservicios.entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author William_Rubiano
 */
@Service
@Transactional
public class UsuarioDAOImpl implements IUsuarioDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void crearUsuario(Usuario nuevoUsuario) {
        System.out.println("entro a hacer el merge");
        try {
            this.em.merge(nuevoUsuario);
        } catch (Exception e) {
            System.out.println("el error es " + e.getLocalizedMessage());
            e.getStackTrace();
            e.getLocalizedMessage();
        }

    }

}
