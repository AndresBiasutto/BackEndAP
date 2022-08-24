
package com.argentinaPrograma.backEndAP.servicios;

import com.argentinaPrograma.backEndAP.modelos.Usuario;
import com.argentinaPrograma.backEndAP.repositorios.IUsuarioRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpUsuarioServicio implements IUserServicio{
    
    @Autowired IUsuarioRepo UsuarioRepo;

    @Override
    public ArrayList<Usuario> getUsuario() {
       List<Usuario> usuario = UsuarioRepo.findAll();
       return (ArrayList<Usuario>) usuario;
    }

    @Override
    public void saveUser(Usuario usuario) {
        UsuarioRepo.save(usuario);
    }

    @Override
    public void deleteUser(Long id) {
        UsuarioRepo.deleteById(id);
    }

    @Override
    public Usuario findUser(Long id) {
        Usuario user= UsuarioRepo.findById(id).orElse(null);
        return user;
    }
    
}
