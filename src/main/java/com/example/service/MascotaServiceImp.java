package com.example.service;
import com.example.dao.MascotasRepository;
import com.example.dao.UsuariosRepository;
import com.example.service.MascotaService;
import com.example.model.Mascotas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaServiceImp implements MascotaService 
{
@Autowired
	private MascotasRepository repositorio;
	
	@Override
	public List<Mascotas> listMascotastodas() {
		return repositorio.findAll();
	}

	@Override
	public List<Mascotas> listMascotastipo() {
		return repositorio.findAll();
	}

	@Override
	public Mascotas listMascotaunica(int idmascota) {
		return repositorio.findById(idmascota);
	}

	/*
	 * @Override(non-Javadoc)
	 * @see com.example.service.MascotaService#ventaMascota(int)
	
	public Mascotas ventaMascota(int idmascota) {
		return repositorio.save(m);
	}
	*/

	@Override
	public Mascotas altaMascota(Mascotas m) {
			return repositorio.save(m);
	}

	@Override
	public Mascotas modifMascota(int idmascota, Mascotas m) {
		return repositorio.save(m);
	}

	@Override
	public Mascotas ventaMascota(int idmascota) {
		// TODO Auto-generated method stub
		return null;
	}

}
