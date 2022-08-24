
package com.argentinaPrograma.backEndAP.servicios;

import com.argentinaPrograma.backEndAP.modelos.Usuario;
import java.util.ArrayList;


public interface IUserServicio {
    public ArrayList<Usuario> getUsuario();
    
    public void saveUser(Usuario usuario);
    
    public void deleteUser(Long id);
    
    public Usuario findUser(Long id);
}
