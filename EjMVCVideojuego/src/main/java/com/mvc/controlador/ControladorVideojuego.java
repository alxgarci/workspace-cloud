package com.mvc.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.negocio.GestorVideojuego;

@Controller
public class ControladorVideojuego {
	
	@Autowired
	private GestorVideojuego gVid;
	
	@PostMapping("doBuscarId")
	public String buscarPorId(
			@RequestParam("videojuego_id") String id,
			Model model) {
		
		Videojuego v = new Videojuego();
		if (!id.isEmpty()) {
			int idInt = Integer.parseInt(id);
			v.setId(idInt);
		}
		Videojuego videojuego = gVid.existeId(v);
		
		
		
		
		List<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();
		
		if(videojuego != null) {
			listaVideojuegos.add(videojuego);
			
			model.addAttribute("lista", listaVideojuegos);
			return "resultados";
		} else {
			listaVideojuegos.addAll(gVid.selectAll());
			model.addAttribute("lista", listaVideojuegos);
			
			return "resultados";
		}
	}
	
	

}
