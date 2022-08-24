
package com.argentinaPrograma.backEndAP.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Porfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPorfolio;
    private String titulo;
    private String tecnologias;
    private String link;

    public Porfolio() {
    }

    public Porfolio(Long idPorfolio, String titulo, String tecnologias, String link) {
        this.idPorfolio = idPorfolio;
        this.titulo = titulo;
        this.tecnologias = tecnologias;
        this.link = link;
    }

    public Long getIdPorfolio() {
        return idPorfolio;
    }

    public void setIdPorfolio(Long idPorfolio) {
        this.idPorfolio = idPorfolio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
