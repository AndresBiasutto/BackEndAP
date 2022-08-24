
package com.argentinaPrograma.backEndAP.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContacto;
    private String facebook;
    private String linkedin;
    private String github;
    private String email;
    private String telefono;

    public Contacto() {
    }

    public Contacto(Long idContacto, String facebook, String linkedin, String github, String email, String telefono) {
        this.idContacto = idContacto;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.github = github;
        this.email = email;
        this.telefono = telefono;
    }

    public Long getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Long idContacto) {
        this.idContacto = idContacto;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
