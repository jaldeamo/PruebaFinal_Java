package com.example.demo;

import java.util.List;

public interface PersonaService {
	List<Persona>listadoCompleto();
	Persona listadoPersonaUnica(int id);
	Persona eliminarPersona(int id);
	Persona altaPersona(Persona p);
	Persona modificarPersona(int id, Persona p);
}
