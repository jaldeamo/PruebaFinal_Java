package com.example.service;
import com.example.dao.Hist_ventasRepository;
import com.example.service.Hist_ventasService;
import com.example.model.Hist_ventas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Hist_ventasServiceImp implements Hist_ventasService 
{
@Autowired	
	private Hist_ventasRepository repositorio;

	@Override
	public Hist_ventas altaHist_ventas(Hist_ventas h) {
		return repositorio.save(h);
	}
}
