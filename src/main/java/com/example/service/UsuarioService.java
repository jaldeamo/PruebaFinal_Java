package com.example.service;
import java.util.List;
import com.example.model.Usuarios;
import org.springframework.context.annotation.ComponentScan;

public interface UsuarioService {
	List<Usuarios>listUsuarios();
	Usuarios listUsuariounico(String username);
	Usuarios bajaUsuario(String username);
	Usuarios altaUsuario(Usuarios u);
	Usuarios modifUsuario(String username, Usuarios u);
}
