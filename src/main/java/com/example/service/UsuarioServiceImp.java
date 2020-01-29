package com.example.service;
import com.example.dao.UsuariosRepository;
import com.example.service.UsuarioService;
import com.example.model.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService 
{
@Autowired	
	private UsuariosRepository repositorio;

	@Override
	public List<Usuarios> listUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Usuarios listUsuariounico(String username) {
		return repositorio.findById(username);
	}

	@Override
	public Usuarios bajaUsuario(String username) {
		Usuarios u = repositorio.findById(username);
        if (u!=null)
        {
            repositorio.delete(u);
        }
        return u;
	}

	@Override
	public Usuarios altaUsuario(Usuarios u) {
		return repositorio.save(u);
	}

	@Override
	public Usuarios modifUsuario(String username, Usuarios u) {
		return repositorio.save(u);
	}

}
