package com.example.dao;
import com.example.model.Hist_ventas;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.Repository;

public interface Hist_ventasRepository extends Repository<Hist_ventas,Integer>{
	Hist_ventas save(Hist_ventas h);
}
