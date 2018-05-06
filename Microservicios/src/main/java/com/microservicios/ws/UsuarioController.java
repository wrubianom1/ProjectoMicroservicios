/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservicios.ws;

import com.microservicios.dto.ResponseServiceGeneric;
import com.microservicios.entidades.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.microservicios.entidades.Usuario;
import com.microservicios.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.condition.ConsumesRequestCondition;

/**
 *
 * @author William_Rubiano
 */
@RestController
@RequestMapping(value = "/rest")
@CrossOrigin // Esta anotacion sirve para consumir servicios y omitir la seguridad temporalmente
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public Product list(@PathVariable("idin") Integer idin) {
        //
        Product res = null;
        System.out.println("Returning rpoducts:" + res);
        return res;
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.POST, consumes = {"application/json", "application/xml", "application/x-www-form-urlencoded"},
            produces = {"application/json", "application/xml"}
    )
    public ResponseServiceGeneric crearUsuario(Usuario usuario) {
        //
        ResponseServiceGeneric response = null;
        System.out.println("Se ingreso el usuario " + usuario.getNombre());

        try {

            usuarioService.crearUsuario(usuario);
            response = new ResponseServiceGeneric();
            response.setCode(1);
            response.setDeveloperMessage("Se creo el usuario correctamente");
            response.setStatus(200);
        } catch (Exception e) {
            response = new ResponseServiceGeneric();
            response.setCode(2);
            response.setDeveloperMessage("ocurrio un error al crear el usuario " + e.toString());
            response.setStatus(500);
        }

        return response;
    }

}
