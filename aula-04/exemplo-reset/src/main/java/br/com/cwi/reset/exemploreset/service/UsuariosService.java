package br.com.cwi.reset.exemploreset.service;

import br.com.cwi.reset.exemploreset.domain.Usuario;
import br.com.cwi.reset.exemploreset.exception.BadRequestException;
import br.com.cwi.reset.exemploreset.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private UsuarioRepository usuarios;

    public List<Usuario> obterUsuario(){
        return usuarios.getUsuarios();
    }

    public Usuario criarUsuario(Usuario usuario){
        if(usuario == null || usuario.getId() == null || usuario.getNome() == null
        || usuario.getEmail() == null || usuario.getSenha() == null){
            throw new BadRequestException();
        }
        return usuarios.addUsuarios(usuario);
    }
}
