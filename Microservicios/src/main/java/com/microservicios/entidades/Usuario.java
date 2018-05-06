/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservicios.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author William_Rubiano
 */
@Entity
@XmlRootElement
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    public Usuario() {

    }

    public String nombre;
    public String email;
    public String password;
    public String img;
    public String role;
    public boolean google;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String value) {
        this.img = value;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String value) {
        this.role = value;
    }

    public boolean getGoogle() {
        return this.google;
    }

    public void setGoogle(boolean value) {
        this.google = value;
    }

}
