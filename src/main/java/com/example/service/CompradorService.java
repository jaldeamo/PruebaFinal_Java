package com.example.service;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import com.example.model.Compradores;

public interface CompradorService {
	Compradores altaComprador(Compradores c);
}
