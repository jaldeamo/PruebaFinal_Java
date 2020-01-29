package com.example.dao;
import com.example.model.Usuarios;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.Repository;

public interface UsuariosRepository extends Repository<Usuarios,String>{
	List<Usuarios>findAll();
	Usuarios findById(String username);
	Usuarios save(Usuarios u);
	void delete(Usuarios u);
}
