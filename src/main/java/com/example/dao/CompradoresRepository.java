package com.example.dao;
import com.example.model.Compradores;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.Repository;

public interface CompradoresRepository extends Repository<Compradores,Integer>{
	Compradores save(Compradores c);
}
