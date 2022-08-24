package com.argentinaPrograma.backEndAP.controlador;

import com.argentinaPrograma.backEndAP.modelos.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.argentinaPrograma.backEndAP.servicios.IUserServicio;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioControlador {

    @Autowired IUserServicio iUserServicio;
    

    @GetMapping("/usuarios/ver")
    public ArrayList<Usuario> getUsuario() {
        return iUserServicio.getUsuario();
    }

    @PostMapping("/usuarios/crear")
    public String crearUsuario(@RequestBody Usuario user) {
        iUserServicio.saveUser(user);
        return "persona agregada correctamente";
    }

    @DeleteMapping("/usuarios/borrar/{id}")
    public void borrarUsuario(@PathVariable Long id) {
        iUserServicio.deleteUser(id);
    }

    @PutMapping("/usuarios/editar/{id}")
    public Usuario editarPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("nacimiento") String nuevoNacimiento,
            @RequestParam("sobreMi") String nuevoSobreMi) {

        Usuario usuario = iUserServicio.findUser(id);

        usuario.setApellido(nuevoApellido);
        usuario.setNombre(nuevoNombre);
        usuario.setNacimiento(nuevoNacimiento);
        usuario.setSobreMi(nuevoSobreMi);
        
        iUserServicio.saveUser(usuario);
        return usuario;

    }
}
