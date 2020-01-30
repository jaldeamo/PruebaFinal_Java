package com.example.service;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import com.example.model.Mascotas;

public interface MascotaService {
	List<Mascotas>listMascotastodas();
	List<Mascotas>listMascotastipo();
	Mascotas listMascotaunica(int idmascota);
	Mascotas ventaMascota(int idmascota);
	Mascotas altaMascota(Mascotas m);
	Mascotas modifMascota(int idmascota, Mascotas m);
}
