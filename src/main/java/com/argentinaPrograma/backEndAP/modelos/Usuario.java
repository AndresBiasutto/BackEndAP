
package com.argentinaPrograma.backEndAP.modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column
    private Long idUsuario;
    //@Column
    private String nombre;
    //@Column
    private String apellido;
    //@Column
    private String nacimiento;
    //@Column
    private String sobreMi;
    //@@Column
    private String imagen;

   
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEducacion")
    private List<Educacion> educacionLista;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExperiencia")
    private List<Experiencia> experienciaLista;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idContacto")
    private List<Contacto> contactoLista;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPorfolio")
    private List<Porfolio> porfolioLista;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills> skillsLista;
   
    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombre, String apellido, String nacimiento, String sobreMi, String imagen) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sobreMi = sobreMi;
        this.imagen = imagen;
    }
/*
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }
    */
    
}
