package com.example.controller;
import java.util.List;

import javax.xml.ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Usuarios;
import com.example.service.UsuarioService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping

public class UsuariosController {
	@Autowired
	UsuarioService service;
	
@GetMapping("/usuarios")
public List<Usuarios>listUsuarios()
{
	return service.listUsuarios();
}

@PostMapping("/usuarios")
public Usuarios altaUsuario(@RequestBody Usuarios u){
   return service.altaUsuario(u); 
}

@GetMapping({"/usuarios/{username}"})
public Usuarios listUsuariounico(@PathVariable("username") String username)
{
	return service.listUsuariounico(username);
}

@PutMapping(path={"/usuarios/{username}"})
public Usuarios modifUsuario(@RequestBody Usuarios u, @PathVariable("username") String username)
{
    u.setUsername(username);
    return service.modifUsuario(username, u);
}  

@DeleteMapping(path={"/usuarios/{username}"})
public Usuarios bajaUsuario(@PathVariable ("username") String username)
{
	return service.bajaUsuario(username);
}
}
