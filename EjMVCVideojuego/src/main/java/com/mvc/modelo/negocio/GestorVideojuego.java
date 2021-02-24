package com.mvc.modelo.negocio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	
	public Videojuego existeId(Videojuego v) {
		Videojuego vidAux = daoVideojuego.findById(v.getId());
		
		if(vidAux != null) {
			return vidAux;
		} else {
			return null;
		}
	}
	
	public ArrayList<Videojuego> selectAll() {
		ArrayList<Videojuego> listaVideojuegos = daoVideojuego.findAll();
		
		return listaVideojuegos;
	}

}
