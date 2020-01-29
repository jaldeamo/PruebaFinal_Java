package com.example.dao;
import com.example.model.Mascotas;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.Repository;

public interface MascotasRepository extends Repository<Mascotas,Integer>{
	List<Mascotas>findAll();
	Mascotas findById(int idmascota);
	Mascotas save(Mascotas m);
	void delete(Mascotas m);
}
