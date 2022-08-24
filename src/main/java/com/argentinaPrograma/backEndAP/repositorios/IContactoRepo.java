/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaPrograma.backEndAP.repositorios;

import com.argentinaPrograma.backEndAP.modelos.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aquia
 */
public interface IContactoRepo extends JpaRepository<Contacto, Long> {
    
}
