package com.example.service;
import com.example.dao.CompradoresRepository;
import com.example.service.CompradorService;
import com.example.model.Compradores;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompradorServiceImp implements CompradorService 
{
@Autowired	
	private CompradoresRepository repositorio;

	@Override
	public Compradores altaComprador(Compradores c) {
		return repositorio.save(c);
	}

}
