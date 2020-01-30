package com.example.controller;
import java.util.List;
import javax.xml.ws.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Mascotas;
import com.example.service.MascotaService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping
public class MascotasController {
	@Autowired
	MascotaService service;
@GetMapping("/mascotas")
public List<Mascotas>listMascotastodas()
{
	return service.listMascotastodas();
}

public List<Mascotas>listMascotastipo()
{
	return service.listMascotastipo();
}

@PostMapping("/mascotas")
public Mascotas altaMascota(@RequestBody Mascotas m){
   return service.altaMascota(m); 
}

@GetMapping({"/mascotas/{username}"})
public Mascotas listMascotaunica(@PathVariable("idmascota") int idmascota)
{
	return service.listMascotaunica(idmascota);
}

@PutMapping(path={"/mascotas/{username}"})
public Mascotas modifMascota(@RequestBody Mascotas m, @PathVariable("idmascota") int idmascota)
{
	m.setIdmascota(idmascota);
	return service.modifMascota(idmascota, m);
}  

@DeleteMapping(path={"/mascotas/{idmascota}"})
public Mascotas ventaMascota(@PathVariable ("idmascota") int idmascota)
{
	return null;
	/*
	return service.ventaMascota(idmascota);
	*/
}

}
